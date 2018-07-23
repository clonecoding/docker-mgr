
package com.jdddata.dockermgr.adapter.docker.httpadapter.container.create;

import java.util.List;
import java.util.Map;

public class ContainerCreateDto {

    private String hostname;
    private String domainname;
    private String user;
    private Boolean attachStdin;
    private Boolean attachStdout;
    private Boolean attachStderr;
    private Boolean tty;
    private Boolean openStdin;
    private Boolean stdinOnce;
    /**
     * "Env": [
     * "FOO=bar",
     * "BAZ=quux"
     * ],
     */
    private List<String> env = null;
    /**
     * "Cmd": [
     * "date","cmd"
     * ],
     */
    private List<String> cmd = null;
    private List<String> entrypoint = null;
    private String image;
    /**
     * "Labels": {
     * "com.example.vendor": "Acme",
     * "com.example.license": "GPL",
     * "com.example.version": "1.0"
     * }
     */
    private Map<String, String> labels;
    /**
     * "Volumes": {
     * "/volumes/data": {}
     * },
     */
    private Map<String, Object> volumes;
    private String workingDir;
    private Boolean networkDisabled;
    private String macAddress;
    /**
     * "ExposedPorts": {
     * "22/tcp": {},
     * "80/tcp":{}
     * },
     */
    private Map<String, Object> exposedPorts;
    private String stopSignal;
    private Integer stopTimeout;
    private HostConfig hostConfig;
    private NetworkingConfig networkingConfig;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(Boolean attachStdin) {
        this.attachStdin = attachStdin;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(Boolean attachStdout) {
        this.attachStdout = attachStdout;
    }

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(Boolean attachStderr) {
        this.attachStderr = attachStderr;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public Boolean getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(Boolean openStdin) {
        this.openStdin = openStdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    public List<String> getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Map<String, Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, Object> volumes) {
        this.volumes = volumes;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(Boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Map<String, Object> getExposedPorts() {
        return exposedPorts;
    }

    public void setExposedPorts(Map<String, Object> exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
    }

    public Integer getStopTimeout() {
        return stopTimeout;
    }

    public void setStopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }

    public NetworkingConfig getNetworkingConfig() {
        return networkingConfig;
    }

    public void setNetworkingConfig(NetworkingConfig networkingConfig) {
        this.networkingConfig = networkingConfig;
    }

}
