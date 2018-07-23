
package com.jdddata.dockermgr.adapter.docker.httpadapter.container.list;

public class Mount {

    private String name;
    private String source;
    private String destination;
    private String driver;
    private String mode;
    private Boolean rW;
    private String propagation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getRW() {
        return rW;
    }

    public void setRW(Boolean rW) {
        this.rW = rW;
    }

    public String getPropagation() {
        return propagation;
    }

    public void setPropagation(String propagation) {
        this.propagation = propagation;
    }
}
