
package com.jdddata.dockermgr.adapter.gocd.dto.create;

import java.util.List;

public class Job {

    private String name;
    private Object runInstanceCount;
    private Object timeout;
    private List<Object> environmentVariables = null;
    private List<Object> resources = null;
    private List<Task> tasks = null;
    private List<Object> tabs = null;
    private List<Object> artifacts = null;
    private Object properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRunInstanceCount() {
        return runInstanceCount;
    }

    public void setRunInstanceCount(Object runInstanceCount) {
        this.runInstanceCount = runInstanceCount;
    }

    public Object getTimeout() {
        return timeout;
    }

    public void setTimeout(Object timeout) {
        this.timeout = timeout;
    }

    public List<Object> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(List<Object> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public List<Object> getResources() {
        return resources;
    }

    public void setResources(List<Object> resources) {
        this.resources = resources;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Object> getTabs() {
        return tabs;
    }

    public void setTabs(List<Object> tabs) {
        this.tabs = tabs;
    }

    public List<Object> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Object> artifacts) {
        this.artifacts = artifacts;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

}
