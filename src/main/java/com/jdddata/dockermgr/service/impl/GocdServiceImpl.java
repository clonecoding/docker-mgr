package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.service.GocdService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/30 10:25
 * @modified By:
 */
public class GocdServiceImpl implements GocdService {

    @Autowired
    ProjectDeployInfoCMapper projectDeployInfoCMapper;

    /**
     * 创建容器
     *
     * @param projectId
     * @return
     */
    @Override
    public boolean createPipeline(String projectId) {
//        String url = "";
//        ProjectDeployInfo projectDeployInfo = projectDeployInfoCMapper.findByProjectId(projectId);
//
//        //配置task
//        Task task =new Task();
//        task.setType("exec");
//        task.setAttributes(new Attributes_());
//        //配置job
//        Job job = new Job();
//        job.setName("defaultJob");
//        job.setRunInstanceCount(null);
//        job.setTimeout(0);
//        job.setEnvironmentVariables(new ArrayList<>());
//        job.setResources(new ArrayList<>());
//        List<Task> tasks = new ArrayList<>();
//        tasks.add(task);
//        job.setTasks(tasks);
//        //配置stage
//        Stage stage =new Stage();
//        stage.setName("defaultStage");
//        stage.setFetchMaterials(true);
//        stage.setCleanWorkingDirectory(false);
//        stage.setNeverCleanupArtifacts(false);
//        Approval approval =new Approval();
//        approval.setType("success");
//        approval.setAuthorization(new Authorization());
//        stage.setApproval(approval);
//        // 配置stage 环境变量
//        stage.setEnvironmentVariables(new ArrayList<>());
//        List<Job> jobs =new ArrayList<>();
//        jobs.add(job);
//        stage.setJobs(jobs);
//
//        //配置材料参数
//        Attributes attributes =new Attributes();
//        attributes.setUrl(url);
//        attributes.setDestination("dest");
//        attributes.setFilter(null);
//        attributes.setInvert_filter(false);
//        attributes.setName(null);
//        attributes.setAuto_update(true);
//        attributes.setBranch(projectDeployInfo.getGitVersion());
//        attributes.setSubmodule_folder(null);
//        attributes.setShallow_clone(true);
//        // 配置材料
//        Material material = new Material();
//        material.setType("git");
//        material.setAttributes(attributes);
//        // 创建pipeLineGroup
//        PipelineCreateDto pipelineCreateDto = new PipelineCreateDto();
//        pipelineCreateDto.setLabelTemplate("${COUNT}");
//        pipelineCreateDto.setLockBehavior("lockOnFailure");
//        pipelineCreateDto.setName("maven_deploy");
//        pipelineCreateDto.setTemplate(null);
//        List<Material> materials =new ArrayList<>();
//        materials.add(material);
//        pipelineCreateDto.setMaterials(materials);
//        List<Stage> stages=new ArrayList<>();
//        stages.add(stage);
//        pipelineCreateDto.setStages(stages);
//
//        Map<String,Object> requestDto =new HashMap<>();
//        requestDto.put("group","test");
//        requestDto.put("pipeline",pipelineCreateDto);
        return false;
    }
}
