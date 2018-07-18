
package com.jdddata.dockermgr.bussiness.service.bo.container.list;

import java.util.HashMap;
import java.util.Map;

public class Bridge {

    private String networkID;
    private String endpointID;
    private String gateway;
    private String iPAddress;
    private Integer iPPrefixLen;
    private String iPv6Gateway;
    private String globalIPv6Address;
    private Integer globalIPv6PrefixLen;
    private String macAddress;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    public String getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(String endpointID) {
        this.endpointID = endpointID;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    public Integer getIPPrefixLen() {
        return iPPrefixLen;
    }

    public void setIPPrefixLen(Integer iPPrefixLen) {
        this.iPPrefixLen = iPPrefixLen;
    }

    public String getIPv6Gateway() {
        return iPv6Gateway;
    }

    public void setIPv6Gateway(String iPv6Gateway) {
        this.iPv6Gateway = iPv6Gateway;
    }

    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    public void setGlobalIPv6Address(String globalIPv6Address) {
        this.globalIPv6Address = globalIPv6Address;
    }

    public Integer getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    public void setGlobalIPv6PrefixLen(Integer globalIPv6PrefixLen) {
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
