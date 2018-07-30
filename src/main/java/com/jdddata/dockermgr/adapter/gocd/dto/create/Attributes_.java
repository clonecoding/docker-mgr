
package com.jdddata.dockermgr.adapter.gocd.dto.create;

import java.util.List;

public class Attributes_ {

    private List<String> runIf = null;
    private Object onCancel;
    private String command;
    private List<String> arguments = null;
    private Object workingDirectory;

    public List<String> getRunIf() {
        return runIf;
    }

    public void setRunIf(List<String> runIf) {
        this.runIf = runIf;
    }

    public Object getOnCancel() {
        return onCancel;
    }

    public void setOnCancel(Object onCancel) {
        this.onCancel = onCancel;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public Object getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(Object workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

}
