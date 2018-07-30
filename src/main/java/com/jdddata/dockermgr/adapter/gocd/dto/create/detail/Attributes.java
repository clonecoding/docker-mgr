
package com.jdddata.dockermgr.adapter.gocd.dto.create.detail;


public class Attributes {

    private String url;
    private Object destination;
    private Object filter;
    private Boolean invertFilter;
    private String name;
    private Boolean autoUpdate;
    private String branch;
    private Object submoduleFolder;
    private Boolean shallowClone;
    private String pipeline;
    private String stage;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getDestination() {
        return destination;
    }

    public void setDestination(Object destination) {
        this.destination = destination;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public Boolean getInvertFilter() {
        return invertFilter;
    }

    public void setInvertFilter(Boolean invertFilter) {
        this.invertFilter = invertFilter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Object getSubmoduleFolder() {
        return submoduleFolder;
    }

    public void setSubmoduleFolder(Object submoduleFolder) {
        this.submoduleFolder = submoduleFolder;
    }

    public Boolean getShallowClone() {
        return shallowClone;
    }

    public void setShallowClone(Boolean shallowClone) {
        this.shallowClone = shallowClone;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

}
