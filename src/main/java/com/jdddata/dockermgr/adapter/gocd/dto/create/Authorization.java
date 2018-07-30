
package com.jdddata.dockermgr.adapter.gocd.dto.create;

import java.util.ArrayList;
import java.util.List;

public class Authorization {

    private List<Object> roles = new ArrayList<>();
    private List<Object> users = new ArrayList<>();

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
