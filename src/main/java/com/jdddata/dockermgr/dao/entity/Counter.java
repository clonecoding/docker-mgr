package com.jdddata.dockermgr.dao.entity;

public class Counter {
    private String id;

    private String pipelinegroup;

    private String pipelinename;

    private String pipelinecounter;

    private String stagename;

    private String stagecounter;

    private String jobname;

    private String classfiler;

    private Boolean imagepushed;

    private String envid;

    private String imagemgrid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPipelinegroup() {
        return pipelinegroup;
    }

    public void setPipelinegroup(String pipelinegroup) {
        this.pipelinegroup = pipelinegroup == null ? null : pipelinegroup.trim();
    }

    public String getPipelinename() {
        return pipelinename;
    }

    public void setPipelinename(String pipelinename) {
        this.pipelinename = pipelinename == null ? null : pipelinename.trim();
    }

    public String getPipelinecounter() {
        return pipelinecounter;
    }

    public void setPipelinecounter(String pipelinecounter) {
        this.pipelinecounter = pipelinecounter == null ? null : pipelinecounter.trim();
    }

    public String getStagename() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename == null ? null : stagename.trim();
    }

    public String getStagecounter() {
        return stagecounter;
    }

    public void setStagecounter(String stagecounter) {
        this.stagecounter = stagecounter == null ? null : stagecounter.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getClassfiler() {
        return classfiler;
    }

    public void setClassfiler(String classfiler) {
        this.classfiler = classfiler == null ? null : classfiler.trim();
    }

    public Boolean getImagepushed() {
        return imagepushed;
    }

    public void setImagepushed(Boolean imagepushed) {
        this.imagepushed = imagepushed;
    }

    public String getEnvid() {
        return envid;
    }

    public void setEnvid(String envid) {
        this.envid = envid == null ? null : envid.trim();
    }

    public String getImagemgrid() {
        return imagemgrid;
    }

    public void setImagemgrid(String imagemgrid) {
        this.imagemgrid = imagemgrid == null ? null : imagemgrid.trim();
    }
}