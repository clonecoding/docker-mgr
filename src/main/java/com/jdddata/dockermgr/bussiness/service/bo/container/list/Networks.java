
package com.jdddata.dockermgr.bussiness.service.bo.container.list;

import java.util.HashMap;
import java.util.Map;

public class Networks {

    private Bridge bridge;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Bridge getBridge() {
        return bridge;
    }

    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
