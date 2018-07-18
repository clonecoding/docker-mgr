package com.jdddata.dockermgr.bussiness.controller.dto.container;

public class ContainerCreatePyDto {
    private String name;
    private String image;
    private String ports;
    private String volumes;
    private String entrypoint;
    private String hostconfig;
    private String exportPort;
    private String memory;
    private String memorySwap;
    private String memoryReservation;
    private String cpusetCpus;

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

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getHostconfig() {
        return hostconfig;
    }

    public void setHostconfig(String hostconfig) {
        this.hostconfig = hostconfig;
    }

    public String getExportPort() {
        return exportPort;
    }

    public void setExportPort(String exportPort) {
        this.exportPort = exportPort;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(String memorySwap) {
        this.memorySwap = memorySwap;
    }

    public String getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(String memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }
}
