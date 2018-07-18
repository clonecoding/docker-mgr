
package com.jdddata.dockermgr.bussiness.service.bo.container.create;

import java.util.HashMap;
import java.util.Map;

public class NetworkingConfig {

    private EndpointsConfig endpointsConfig;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public EndpointsConfig getEndpointsConfig() {
        return endpointsConfig;
    }

    public void setEndpointsConfig(EndpointsConfig endpointsConfig) {
        this.endpointsConfig = endpointsConfig;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
