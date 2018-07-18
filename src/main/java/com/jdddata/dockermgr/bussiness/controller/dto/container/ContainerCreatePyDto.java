package com.jdddata.dockermgr.bussiness.controller.dto.container;

public class ContainerCreatePyDto {
    private String name;

    /**
     * image:tag
     */
    private String image;

    /**
     *  -p host:container
     *  host:container,host:container
     */
    private String ports;
    private String volumes;

    /**
     * http,3
     */
    private String entryPoint;
    private String hostConfig;
    private Integer memory;
    private Integer memorySwap;
    private Integer memoryReservation;
    private String cpusetCpus;

    /**
     * env: ENV=FOO,TEST=10.356
     */
    private String env;

    /**
     * cmd: ENV=FOO,TEST=10.356
     */
    private String cmd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public String getVolumes() {
        return volumes;
    }

    public void setVolumes(String volumes) {
        this.volumes = volumes;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(String hostConfig) {
        this.hostConfig = hostConfig;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(Integer memorySwap) {
        this.memorySwap = memorySwap;
    }

    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
}
