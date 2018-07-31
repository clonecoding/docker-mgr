package com.jdddata.dockermgr.common.vo.gitlab;

public class Branch {
    private String name;

    private Commit commit;

    private boolean merged;

    private boolean developers_can_push;

    private boolean developers_can_merge;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Commit getCommit() {
        return this.commit;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public boolean getMerged() {
        return this.merged;
    }

    public void setDevelopers_can_push(boolean developers_can_push) {
        this.developers_can_push = developers_can_push;
    }

    public boolean getDevelopers_can_push() {
        return this.developers_can_push;
    }

    public void setDevelopers_can_merge(boolean developers_can_merge) {
        this.developers_can_merge = developers_can_merge;
    }

    public boolean getDevelopers_can_merge() {
        return this.developers_can_merge;
    }

}
