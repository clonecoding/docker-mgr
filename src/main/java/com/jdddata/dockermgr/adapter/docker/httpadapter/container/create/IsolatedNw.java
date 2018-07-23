
package com.jdddata.dockermgr.adapter.docker.httpadapter.container.create;

import java.util.List;

public class IsolatedNw {

    private IPAMConfig iPAMConfig;
    private List<String> links = null;
    private List<String> aliases = null;

    public IPAMConfig getIPAMConfig() {
        return iPAMConfig;
    }

    public void setIPAMConfig(IPAMConfig iPAMConfig) {
        this.iPAMConfig = iPAMConfig;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }


}
