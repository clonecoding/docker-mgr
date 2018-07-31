package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.constant.GitConstants;
import com.jdddata.dockermgr.common.vo.pom.PomParseModel;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;
import com.jdddata.dockermgr.service.GitService;
import com.jdddata.dockermgr.service.PomParseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

@Service
public class PomParseServiceImpl implements PomParseService {

    private static final CharSequence POM_XML = "pom.xml";
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    @Autowired
    private GitService gitService;

    @Override
    public ResultVo parseFromGit(GitDto gitDto) {
        try {
            String codePath = gitService.gitClone(gitDto.getUrl(), gitDto.getVersion());
            List<File> files = findPom(codePath);
            BlockingQueue<PomParseModel> pomParseModels = new ArrayBlockingQueue<PomParseModel>(10);
            for (File file : files) {
                Future<PomParseModel> f = executorService.submit(new CallableTask(file));
                pomParseModels.add(f.get());
            }

            Iterator<PomParseModel> iterator = pomParseModels.iterator();
            while (iterator.hasNext()) {
                PomParseModel pomParseModel = iterator.next();
                if (StringUtils.isBlank(pomParseModel.getAssemblyPlugin()) || StringUtils.equalsIgnoreCase(pomParseModel.getPackagingType(), "pom")) {
                    iterator.remove();
                }
                formatter(pomParseModel);
            }
//            gitService.cleanGitPath(codePath);
            return ResultGenerator.getSuccessDto(pomParseModels);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void formatter(PomParseModel pomParseModel) {
        String groupId = null != pomParseModel.getGroupId() ? pomParseModel.getGroupId() : pomParseModel.getParent().getGroupId();
        String artifactId = null != pomParseModel.getArtifectId() ? pomParseModel.getArtifectId() : pomParseModel.getParent().getArtifectId();
        String version = null != pomParseModel.getVersion() ? pomParseModel.getVersion() : pomParseModel.getParent().getVersion();
        pomParseModel.setGroupId(groupId);
        pomParseModel.setVersion(version);

        pomParseModel.setUrl(urlCreate(pomParseModel));
    }

    private String urlCreate(PomParseModel pomParseModel) {

        return MessageFormat.format(GitConstants.MAVEN_NEXUS, pomParseModel.getGroupId(), pomParseModel.getArtifectId(), pomParseModel.getVersion());
    }

    private List<File> findPom(String codePath) {
        List<File> pomList = new ArrayList<>();
        File file = new File(codePath);
        for (File c1 : file.listFiles()) {
            if (c1.isFile() && StringUtils.equalsIgnoreCase(c1.getName(), POM_XML)) {
                pomList.add(c1.getAbsoluteFile());
            }
            if (c1.isDirectory()) {
                for (File c2 : c1.listFiles()) {
                    int count = 1;
                    if (c2.isFile() && StringUtils.equalsIgnoreCase(c2.getName(), POM_XML)) {
                        pomList.add(c2.getAbsoluteFile());
                    }
                    if (c2.isDirectory()) {
                        for (File c3 : c2.listFiles()) {
                            if (c3.isFile() && StringUtils.equalsIgnoreCase(c3.getName(), POM_XML)) {
                                pomList.add(c3.getAbsoluteFile());
                            }
                            if (c3.isDirectory()) {
                                for (File c4 : c3.listFiles()) {
                                    if (c4.isFile() && StringUtils.equalsIgnoreCase(c4.getName(), POM_XML)) {
                                        pomList.add(c4.getAbsoluteFile());
                                    }
                                    if (c4.isDirectory()) {
                                        for (File c5 : c4.listFiles()) {
                                            if (c5.isFile() && StringUtils.equalsIgnoreCase(c5.getName(), POM_XML)) {
                                                pomList.add(c5.getAbsoluteFile());
                                            }
                                        }
                                    }
                                }
                            }

                        }

                    }
                }


            }
        }
        return pomList;
    }

    private static class CallableTask implements Callable<PomParseModel> {

        private File file;

        public CallableTask(File file) {
            this.file = file;
        }

        @Override
        public PomParseModel call() throws Exception {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            Element rootElement = document.getDocumentElement();
            PomParseModel pomParseModel = new PomParseModel();
            NodeList nodes = rootElement.getChildNodes();
            generate(pomParseModel, nodes);
            return pomParseModel;
        }

        private PomParseModel parseParent(Element childr) {
            PomParseModel pomParseModel = new PomParseModel();
            NodeList nodes = childr.getChildNodes();
            generate(pomParseModel, nodes);
            return pomParseModel;
        }

        private void generate(PomParseModel pomParseModel, NodeList nodes) {
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element child = (Element) node;
                    String nodeName = child.getNodeName();
                    switch (nodeName) {
                        case "parent":
                            pomParseModel.setParent(parseParent(child));
                            break;
                        case "groupId":
                            pomParseModel.setGroupId(child.getTextContent());
                            break;
                        case "artifactId":
                            pomParseModel.setArtifectId(child.getTextContent());
                            break;
                        case "version":
                            pomParseModel.setVersion(child.getTextContent());
                            break;
                        case "packaging":
                            pomParseModel.setPackagingType(null != child.getTextContent() ? child.getTextContent() : "jar");
                            break;
                        case "build":
                            pomParseModel.setAssemblyPlugin(parseBuild(child));
                    }
                }
            }
        }

        private String parseBuild(Element childer) {
            NodeList artifactIds = childer.getElementsByTagName("artifactId");
            if (artifactIds.getLength() < 0) {
                return null;
            }

            for (int i = 0; i < artifactIds.getLength(); i++) {
                Node node = artifactIds.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element child = (Element) node;
                    if (child.getTextContent().equalsIgnoreCase("maven-assembly-plugin")) {
                        return child.getTextContent();
                    }
                }
            }
            return null;
        }
    }
}
