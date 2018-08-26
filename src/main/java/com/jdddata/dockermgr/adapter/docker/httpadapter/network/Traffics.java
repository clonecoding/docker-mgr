
package com.jdddata.dockermgr.adapter.docker.httpadapter.network;


public class Traffics {

    private String containerName;
    private Integer rxBytes;
    private Integer rxPackets;
    private Integer rxErrors;
    private Integer rxDropped;
    private Integer txBytes;
    private Integer txPackets;
    private Integer txErrors;
    private Integer txDropped;

    public Integer getRxBytes() {
        return rxBytes;
    }

    public void setRxBytes(Integer rxBytes) {
        this.rxBytes = rxBytes;
    }

    public Integer getRxPackets() {
        return rxPackets;
    }

    public void setRxPackets(Integer rxPackets) {
        this.rxPackets = rxPackets;
    }

    public Integer getRxErrors() {
        return rxErrors;
    }

    public void setRxErrors(Integer rxErrors) {
        this.rxErrors = rxErrors;
    }

    public Integer getRxDropped() {
        return rxDropped;
    }

    public void setRxDropped(Integer rxDropped) {
        this.rxDropped = rxDropped;
    }

    public Integer getTxBytes() {
        return txBytes;
    }

    public void setTxBytes(Integer txBytes) {
        this.txBytes = txBytes;
    }

    public Integer getTxPackets() {
        return txPackets;
    }

    public void setTxPackets(Integer txPackets) {
        this.txPackets = txPackets;
    }

    public Integer getTxErrors() {
        return txErrors;
    }

    public void setTxErrors(Integer txErrors) {
        this.txErrors = txErrors;
    }

    public Integer getTxDropped() {
        return txDropped;
    }

    public void setTxDropped(Integer txDropped) {
        this.txDropped = txDropped;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }
}
