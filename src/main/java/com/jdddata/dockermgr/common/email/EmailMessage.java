package com.jdddata.dockermgr.common.email;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/3 17:14
 * @modified By:
 */
public class EmailMessage {
    private String projectName;

    private String messageStatus;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
}
