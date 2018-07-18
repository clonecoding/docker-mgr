
package com.jdddata.dockermgr.bussiness.service.bo.container.list;

import java.util.HashMap;
import java.util.Map;

public class NetworkSettings {

    private Networks networks;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Networks getNetworks() {
        return networks;
    }

    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
