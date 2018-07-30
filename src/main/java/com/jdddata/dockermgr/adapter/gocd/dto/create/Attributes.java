
package com.jdddata.dockermgr.adapter.gocd.dto.create;


public class Attributes {

    /**
     * url : git@github.com:sample_repo/example.git
     * destination : dest
     * filter : null
     * invert_filter : false
     * name : null
     * auto_update : true
     * branch : master
     * submodule_folder : null
     * shallow_clone : true
     */

    private String url;
    private String destination;
    private Object filter;
    private boolean invert_filter;
    private Object name;
    private boolean auto_update;
    private String branch;
    private Object submodule_folder;
    private boolean shallow_clone;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public boolean isInvert_filter() {
        return invert_filter;
    }

    public void setInvert_filter(boolean invert_filter) {
        this.invert_filter = invert_filter;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public boolean isAuto_update() {
        return auto_update;
    }

    public void setAuto_update(boolean auto_update) {
        this.auto_update = auto_update;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Object getSubmodule_folder() {
        return submodule_folder;
    }

    public void setSubmodule_folder(Object submodule_folder) {
        this.submodule_folder = submodule_folder;
    }

    public boolean isShallow_clone() {
        return shallow_clone;
    }

    public void setShallow_clone(boolean shallow_clone) {
        this.shallow_clone = shallow_clone;
    }
}
