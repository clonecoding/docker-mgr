
package com.jdddata.dockermgr.adapter.gocd.dto.create.detail;

import java.util.List;

public class Pipeline {

    private String labelTemplate;
    private String lockBehavior;
    private String name;
    private Object template;
    private List<Object> parameters = null;
    private List<EnvironmentVariable> environmentVariables = null;
    private List<Material> materials = null;
    private List<Stage> stages = null;

    public String getLabelTemplate() {
        return labelTemplate;
    }

    public void setLabelTemplate(String labelTemplate) {
        this.labelTemplate = labelTemplate;
    }

    public String getLockBehavior() {
        return lockBehavior;
    }

    public void setLockBehavior(String lockBehavior) {
        this.lockBehavior = lockBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTemplate() {
        return template;
    }

    public void setTemplate(Object template) {
        this.template = template;
    }

    public List<Object> getParameters() {
        return parameters;
    }

    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    public List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

}
