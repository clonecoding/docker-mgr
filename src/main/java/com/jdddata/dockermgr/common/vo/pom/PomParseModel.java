package com.jdddata.dockermgr.common.vo.pom;

public class PomParseModel {
    private String groupId;

    private String artifectId;

    private String version;

    private String url;

    private String packagingType;

    private PomParseModel parent;

    private String assemblyPlugin;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifectId() {
        return artifectId;
    }

    public void setArtifectId(String artifectId) {
        this.artifectId = artifectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public PomParseModel getParent() {
        return parent;
    }

    public void setParent(PomParseModel parent) {
        this.parent = parent;
    }

    public String getAssemblyPlugin() {
        return assemblyPlugin;
    }

    public void setAssemblyPlugin(String assemblyPlugin) {
        this.assemblyPlugin = assemblyPlugin;
    }

    @Override
    public String toString() {
        return "PomParseModel{" +
                "groupId='" + groupId + '\'' +
                ", artifectId='" + artifectId + '\'' +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", packagingType='" + packagingType + '\'' +
                ", parent=" + parent +
                ", assemblyPlugin='" + assemblyPlugin + '\'' +
                '}';
    }
}
