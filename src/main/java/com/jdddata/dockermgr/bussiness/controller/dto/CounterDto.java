package com.jdddata.dockermgr.bussiness.controller.dto;

import java.io.Serializable;

public class CounterDto implements Serializable {

    private String pipelineGroup;

    private String pipelineName;

    private String pipeCounter;

    private String stageName;

    private String stageCounter;

    private String jobName;

    private String classfiler;

    public String getPipelineGroup() {
        return pipelineGroup;
    }

    public void setPipelineGroup(String pipelineGroup) {
        this.pipelineGroup = pipelineGroup;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public String getPipeCounter() {
        return pipeCounter;
    }

    public void setPipeCounter(String pipeCounter) {
        this.pipeCounter = pipeCounter;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getStageCounter() {
        return stageCounter;
    }

    public void setStageCounter(String stageCounter) {
        this.stageCounter = stageCounter;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getClassfiler() {
        return classfiler;
    }

    public void setClassfiler(String classfiler) {
        this.classfiler = classfiler;
    }

    @Override
    public String toString() {
        return "CounterDto{" +
                "pipelineGroup='" + pipelineGroup + '\'' +
                ", pipelineName='" + pipelineName + '\'' +
                ", pipeCounter='" + pipeCounter + '\'' +
                ", stageName='" + stageName + '\'' +
                ", stageCounter='" + stageCounter + '\'' +
                ", jobName='" + jobName + '\'' +
                ", classfiler='" + classfiler + '\'' +
                '}';
    }
}
