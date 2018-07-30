
package com.jdddata.dockermgr.adapter.gocd.dto.create.detail;

import java.util.List;

public class Attributes_ {

    private List<String> runIf = null;
    private String command;
    private Object workingDirectory;
    private Object onCancel;
    private List<String> arguments = null;

    public List<String> getRunIf() {
        return runIf;
    }

    public void setRunIf(List<String> runIf) {
        this.runIf = runIf;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Object getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(Object workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public Object getOnCancel() {
        return onCancel;
    }

    public void setOnCancel(Object onCancel) {
        this.onCancel = onCancel;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

}
