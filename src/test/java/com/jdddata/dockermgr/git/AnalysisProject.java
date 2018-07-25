package com.jdddata.dockermgr.git;

import com.jdddata.dockermgr.common.pom.PomParseModel;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AnalysisProject {
    private static final String WORK_PATH = "E:" + File.separator + "TEST_GIT";
    private static final String POM_XML = "pom.xml";
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private static AtomicInteger atomicInteger = new AtomicInteger(0);


    public String parseDir(String url) {
        return url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));
    }


    public String codePath(String url) {
        return WORK_PATH + File.separator + parseDir(url);
    }

    public void cloneProject(String url) throws GitAPIException, URISyntaxException, IOException, InterruptedException {

        String codePath = codePath(url);

        File f = new File(codePath);

        if (!f.exists()) {
            f.mkdirs();
        } else {
            deleteAll(f);
            TimeUnit.SECONDS.sleep(1);
            f.mkdirs();
        }


        System.out.println("开始下载......");

        CloneCommand cc = Git.cloneRepository().setURI(url).setBranch("1.0.0").setCredentialsProvider(new UsernamePasswordCredentialsProvider("gezhiwei", "12345678")).setTimeout(100000);
        cc.setDirectory(new File(codePath)).call();
        System.out.println("下载完成......");
    }

    private void deleteAll(File file) {
        if (file.isDirectory()) { //如果是文件夹
            File[] files = file.listFiles();
            for (File file2 : files) {
                deleteAll(file2);
            }
        }
        file.delete(); //不管是不是文件夹都删除，当递归完，文件夹都会为空，都会被删除
    }

    public List<File> findPom(String url) {
        List<File> pomList = new ArrayList<>();
        String codePath = codePath(url);
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


    public static void main(String[] args) throws
            GitAPIException, IOException, URISyntaxException, InterruptedException, ExecutionException {
        String url = "https://gitlab.jdddata.com/project/dac/dac.git";
        AnalysisProject analysisProject = new AnalysisProject();
//        analysisProject.cloneProject(url);
        List<File> pom = analysisProject.findPom(url);
        /**
         * 1.生产url，获取tar的url
         *
         */
        List<PomParseModel> pomParseModels = new ArrayList<>();
        for (File file : pom) {
            Future<PomParseModel> f = executorService.submit(new CallableTask(file));
            pomParseModels.add(f.get());
        }
        executorService.shutdown();
        executorService.awaitTermination(10000, TimeUnit.SECONDS);
        int size = pomParseModels.size();
        System.out.println("list size is " + pom.size() + " atomicInter is " + atomicInteger);
        for (PomParseModel pomParseModel : pomParseModels) {
            if (StringUtils.isBlank(pomParseModel.getAssemblyPlugin()) || StringUtils.equalsIgnoreCase(pomParseModel.getPackagingType(), "pom")) {
                continue;
            }

            System.out.println(pomParseModel.toString());
        }

    }

    private static class CallableTask implements Callable<PomParseModel> {

        private File file;

        public CallableTask(File file) {
            this.file = file;
        }

        @Override
        public PomParseModel call() throws Exception {
            atomicInteger.addAndGet(1);
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            Element rootElement = document.getDocumentElement();

            PomParseModel pomParseModel = new PomParseModel();
            NodeList nodes = rootElement.getChildNodes();
            generate(pomParseModel, nodes);

//            rootElement.getChildNodes()
//            NodeList nodeList = rootElement.getElementsByTagName("artifactId");
//            if (nodeList != null) {
//                for (int i = 0; i < nodeList.getLength(); i++) {
//                    Element element = (Element) nodeList.item(i);
//                    System.out.println(element.getNodeName());
//                }
//            }

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
                    return child.getTextContent().equalsIgnoreCase("maven-assembly-plugin") ? child.getTextContent() : null;
                }
            }
            return null;
        }
    }
//    public static void main(String[] args) {
//
//        String url = "https://gitlab.jdddata.com/project/dac/dac.git";
//        AnalysisProject analysisProject = new AnalysisProject();
//        System.out.println(analysisProject.parseDir(url));
//    }
}
