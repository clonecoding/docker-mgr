package com.jdddata.dockermgr.common.vo.gitlab;

public class Commit {
    private String id;

    private String short_id;

    private String title;

    private String created_at;

    private String parent_ids;

    private String message;

    private String author_name;

    private String author_email;

    private String authored_date;

    private String committer_name;

    private String committer_email;

    private String committed_date;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setShort_id(String short_id) {
        this.short_id = short_id;
    }

    public String getShort_id() {
        return this.short_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setParent_ids(String parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getParent_ids() {
        return this.parent_ids;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_name() {
        return this.author_name;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public String getAuthor_email() {
        return this.author_email;
    }

    public void setAuthored_date(String authored_date) {
        this.authored_date = authored_date;
    }

    public String getAuthored_date() {
        return this.authored_date;
    }

    public void setCommitter_name(String committer_name) {
        this.committer_name = committer_name;
    }

    public String getCommitter_name() {
        return this.committer_name;
    }

    public void setCommitter_email(String committer_email) {
        this.committer_email = committer_email;
    }

    public String getCommitter_email() {
        return this.committer_email;
    }

    public void setCommitted_date(String committed_date) {
        this.committed_date = committed_date;
    }

    public String getCommitted_date() {
        return this.committed_date;
    }

}