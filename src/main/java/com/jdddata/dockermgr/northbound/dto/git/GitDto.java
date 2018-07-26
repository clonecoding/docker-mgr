package com.jdddata.dockermgr.northbound.dto.git;

public class GitDto {
    private String url;

    private String version;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
