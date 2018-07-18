package com.jdddata.dockermgr.bussiness.service.bo.container.list;

import java.util.List;
import java.util.Map;

public class ContainerListDto {
    private String id;
    private List<String> names = null;
    private String image;
    private String imageID;
    private String command;
    private Integer created;
    private String state;
    private String status;
    /**
     * "Ports": [
     * {
     * "PrivatePort": 2222,
     * "PublicPort": 3333,
     * "Type": "tcp"
     * }
     * ],
     */
    private List<Port> ports = null;
    /**
     * "Labels": {
     * "com.example.vendor": "Acme",
     * "com.example.license": "GPL",
     * "com.example.version": "1.0"
     * }
     */
    private Map<String, String> labels;
    private Integer sizeRw;
    private Integer sizeRootFs;
    private HostConfig hostConfig;
    private NetworkSettings networkSettings;
    private List<Mount> mounts = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Integer getSizeRw() {
        return sizeRw;
    }

    public void setSizeRw(Integer sizeRw) {
        this.sizeRw = sizeRw;
    }

    public Integer getSizeRootFs() {
        return sizeRootFs;
    }

    public void setSizeRootFs(Integer sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public void setNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }
}
