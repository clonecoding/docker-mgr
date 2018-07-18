
package com.jdddata.dockermgr.bussiness.service.bo.container.create;

import java.util.List;
import java.util.Map;

public class HostConfig {

    /**
     * "Binds": [
     * 			"/tmp:/tmp"
     * 		],
     */
    private List<String> binds = null;
    /**
     * 		"Links": [
     * 			"redis3:redis"
     * 		],
     */
    private List<String> links = null;
    private Integer memory;
    private Integer memorySwap;
    private Integer memoryReservation;
    private Integer kernelMemory;
    private Integer nanoCPUs;
    private Integer cpuPercent;
    private Integer cpuShares;
    private Integer cpuPeriod;
    private Integer cpuRealtimePeriod;
    private Integer cpuRealtimeRuntime;
    private Integer cpuQuota;
    private String cpusetCpus;
    private String cpusetMems;
    private Integer maximumIOps;
    private Integer maximumIOBps;
    private Integer blkioWeight;
//    private List<BlkioWeightDevice> blkioWeightDevice = null;
//    private List<BlkioDeviceReadBp> blkioDeviceReadBps = null;
//    private List<BlkioDeviceReadIOp> blkioDeviceReadIOps = null;
//    private List<BlkioDeviceWriteBp> blkioDeviceWriteBps = null;
//    private List<BlkioDeviceWriteIOp> blkioDeviceWriteIOps = null;
    private Integer memorySwappiness;
    private Boolean oomKillDisable;
    private Integer oomScoreAdj;
    private String pidMode;
    private Integer pidsLimit;
    /**
     * "PortBindings": {
     * 			"22/tcp": [{
     * 					"HostPort": "11022"
     *                                }
     * 			]
     * 		},
     */
    private Map<String,List<Map<String,String>>> portBindings;
    private Boolean publishAllPorts;
    private Boolean privileged;
    private Boolean readonlyRootfs;
    private List<String> dns = null;
    private List<String> dnsOptions = null;
    private List<String> dnsSearch = null;
    private List<String> volumesFrom = null;
    private List<String> capAdd = null;
    private List<String> capDrop = null;
    private List<String> groupAdd = null;
    /**
     * "RestartPolicy": {
     * 			"Name": "",
     * 			"MaximumRetryCount": 0
     *                },
     */
    private Map<String,String> restartPolicy;
    private Boolean autoRemove;
    private String networkMode;
    private List<Object> devices = null;
//    private List<Ulimit> ulimits = null;
    private LogConfig logConfig;
    private List<Object> securityOpt = null;
//    private Map<String,String> storageOpt;
//    private String cgroupParent;
//    private String volumeDriver;
    private Integer shmSize;

    public List<String> getBinds() {
        return binds;
    }

    public void setBinds(List<String> binds) {
        this.binds = binds;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
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

    public Integer getKernelMemory() {
        return kernelMemory;
    }

    public void setKernelMemory(Integer kernelMemory) {
        this.kernelMemory = kernelMemory;
    }

    public Integer getNanoCPUs() {
        return nanoCPUs;
    }

    public void setNanoCPUs(Integer nanoCPUs) {
        this.nanoCPUs = nanoCPUs;
    }

    public Integer getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    public Integer getCpuPeriod() {
        return cpuPeriod;
    }

    public void setCpuPeriod(Integer cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    public Integer getCpuRealtimePeriod() {
        return cpuRealtimePeriod;
    }

    public void setCpuRealtimePeriod(Integer cpuRealtimePeriod) {
        this.cpuRealtimePeriod = cpuRealtimePeriod;
    }

    public Integer getCpuRealtimeRuntime() {
        return cpuRealtimeRuntime;
    }

    public void setCpuRealtimeRuntime(Integer cpuRealtimeRuntime) {
        this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    }

    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    public Integer getMaximumIOps() {
        return maximumIOps;
    }

    public void setMaximumIOps(Integer maximumIOps) {
        this.maximumIOps = maximumIOps;
    }

    public Integer getMaximumIOBps() {
        return maximumIOBps;
    }

    public void setMaximumIOBps(Integer maximumIOBps) {
        this.maximumIOBps = maximumIOBps;
    }

    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public void setBlkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    public Integer getMemorySwappiness() {
        return memorySwappiness;
    }

    public void setMemorySwappiness(Integer memorySwappiness) {
        this.memorySwappiness = memorySwappiness;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    public Integer getOomScoreAdj() {
        return oomScoreAdj;
    }

    public void setOomScoreAdj(Integer oomScoreAdj) {
        this.oomScoreAdj = oomScoreAdj;
    }

    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public Integer getPidsLimit() {
        return pidsLimit;
    }

    public void setPidsLimit(Integer pidsLimit) {
        this.pidsLimit = pidsLimit;
    }

    public Map<String, List<Map<String, String>>> getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(Map<String, List<Map<String, String>>> portBindings) {
        this.portBindings = portBindings;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }

    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public List<String> getDnsOptions() {
        return dnsOptions;
    }

    public void setDnsOptions(List<String> dnsOptions) {
        this.dnsOptions = dnsOptions;
    }

    public List<String> getDnsSearch() {
        return dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    public List<String> getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(List<String> volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public List<String> getCapAdd() {
        return capAdd;
    }

    public void setCapAdd(List<String> capAdd) {
        this.capAdd = capAdd;
    }

    public List<String> getCapDrop() {
        return capDrop;
    }

    public void setCapDrop(List<String> capDrop) {
        this.capDrop = capDrop;
    }

    public List<String> getGroupAdd() {
        return groupAdd;
    }

    public void setGroupAdd(List<String> groupAdd) {
        this.groupAdd = groupAdd;
    }

    public Map<String, String> getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(Map<String, String> restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public Boolean getAutoRemove() {
        return autoRemove;
    }

    public void setAutoRemove(Boolean autoRemove) {
        this.autoRemove = autoRemove;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    public List<Object> getDevices() {
        return devices;
    }

    public void setDevices(List<Object> devices) {
        this.devices = devices;
    }

    public LogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public List<Object> getSecurityOpt() {
        return securityOpt;
    }

    public void setSecurityOpt(List<Object> securityOpt) {
        this.securityOpt = securityOpt;
    }

    public Integer getShmSize() {
        return shmSize;
    }

    public void setShmSize(Integer shmSize) {
        this.shmSize = shmSize;
    }
}
