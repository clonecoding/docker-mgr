
package com.jdddata.dockermgr.adapter.gocd.dto;

import java.util.List;

public class Authorization {

    private List<Object> roles = null;
    private List<Object> users = null;

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public List<Object> getUsers() {
        return users;
    }

    public void setUsers(List<Object> users) {
        this.users = users;
    }

}
