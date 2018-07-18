
package com.jdddata.dockermgr.bussiness.service.bo.container.create;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPAMConfig {

    private String iPv4Address;
    private String iPv6Address;
    private List<String> linkLocalIPs = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getIPv4Address() {
        return iPv4Address;
    }

    public void setIPv4Address(String iPv4Address) {
        this.iPv4Address = iPv4Address;
    }

    public String getIPv6Address() {
        return iPv6Address;
    }

    public void setIPv6Address(String iPv6Address) {
        this.iPv6Address = iPv6Address;
    }

    public List<String> getLinkLocalIPs() {
        return linkLocalIPs;
    }

    public void setLinkLocalIPs(List<String> linkLocalIPs) {
        this.linkLocalIPs = linkLocalIPs;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
