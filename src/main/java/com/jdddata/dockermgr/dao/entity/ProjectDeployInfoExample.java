package com.jdddata.dockermgr.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDeployInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDeployInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("host_ip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("host_ip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("host_ip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("host_ip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("host_ip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("host_ip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andDockerEnvIsNull() {
            addCriterion("docker_env is null");
            return (Criteria) this;
        }

        public Criteria andDockerEnvIsNotNull() {
            addCriterion("docker_env is not null");
            return (Criteria) this;
        }

        public Criteria andDockerEnvEqualTo(String value) {
            addCriterion("docker_env =", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvNotEqualTo(String value) {
            addCriterion("docker_env <>", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvGreaterThan(String value) {
            addCriterion("docker_env >", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvGreaterThanOrEqualTo(String value) {
            addCriterion("docker_env >=", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvLessThan(String value) {
            addCriterion("docker_env <", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvLessThanOrEqualTo(String value) {
            addCriterion("docker_env <=", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvLike(String value) {
            addCriterion("docker_env like", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvNotLike(String value) {
            addCriterion("docker_env not like", value, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvIn(List<String> values) {
            addCriterion("docker_env in", values, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvNotIn(List<String> values) {
            addCriterion("docker_env not in", values, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvBetween(String value1, String value2) {
            addCriterion("docker_env between", value1, value2, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDockerEnvNotBetween(String value1, String value2) {
            addCriterion("docker_env not between", value1, value2, "dockerEnv");
            return (Criteria) this;
        }

        public Criteria andDeployModeIsNull() {
            addCriterion("deploy_mode is null");
            return (Criteria) this;
        }

        public Criteria andDeployModeIsNotNull() {
            addCriterion("deploy_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDeployModeEqualTo(Integer value) {
            addCriterion("deploy_mode =", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeNotEqualTo(Integer value) {
            addCriterion("deploy_mode <>", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeGreaterThan(Integer value) {
            addCriterion("deploy_mode >", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deploy_mode >=", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeLessThan(Integer value) {
            addCriterion("deploy_mode <", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeLessThanOrEqualTo(Integer value) {
            addCriterion("deploy_mode <=", value, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeIn(List<Integer> values) {
            addCriterion("deploy_mode in", values, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeNotIn(List<Integer> values) {
            addCriterion("deploy_mode not in", values, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeBetween(Integer value1, Integer value2) {
            addCriterion("deploy_mode between", value1, value2, "deployMode");
            return (Criteria) this;
        }

        public Criteria andDeployModeNotBetween(Integer value1, Integer value2) {
            addCriterion("deploy_mode not between", value1, value2, "deployMode");
            return (Criteria) this;
        }

        public Criteria andGitVersionIsNull() {
            addCriterion("git_version is null");
            return (Criteria) this;
        }

        public Criteria andGitVersionIsNotNull() {
            addCriterion("git_version is not null");
            return (Criteria) this;
        }

        public Criteria andGitVersionEqualTo(String value) {
            addCriterion("git_version =", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionNotEqualTo(String value) {
            addCriterion("git_version <>", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionGreaterThan(String value) {
            addCriterion("git_version >", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionGreaterThanOrEqualTo(String value) {
            addCriterion("git_version >=", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionLessThan(String value) {
            addCriterion("git_version <", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionLessThanOrEqualTo(String value) {
            addCriterion("git_version <=", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionLike(String value) {
            addCriterion("git_version like", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionNotLike(String value) {
            addCriterion("git_version not like", value, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionIn(List<String> values) {
            addCriterion("git_version in", values, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionNotIn(List<String> values) {
            addCriterion("git_version not in", values, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionBetween(String value1, String value2) {
            addCriterion("git_version between", value1, value2, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andGitVersionNotBetween(String value1, String value2) {
            addCriterion("git_version not between", value1, value2, "gitVersion");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlIsNull() {
            addCriterion("nexus_target_url is null");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlIsNotNull() {
            addCriterion("nexus_target_url is not null");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlEqualTo(String value) {
            addCriterion("nexus_target_url =", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlNotEqualTo(String value) {
            addCriterion("nexus_target_url <>", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlGreaterThan(String value) {
            addCriterion("nexus_target_url >", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("nexus_target_url >=", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlLessThan(String value) {
            addCriterion("nexus_target_url <", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlLessThanOrEqualTo(String value) {
            addCriterion("nexus_target_url <=", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlLike(String value) {
            addCriterion("nexus_target_url like", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlNotLike(String value) {
            addCriterion("nexus_target_url not like", value, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlIn(List<String> values) {
            addCriterion("nexus_target_url in", values, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlNotIn(List<String> values) {
            addCriterion("nexus_target_url not in", values, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlBetween(String value1, String value2) {
            addCriterion("nexus_target_url between", value1, value2, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andNexusTargetUrlNotBetween(String value1, String value2) {
            addCriterion("nexus_target_url not between", value1, value2, "nexusTargetUrl");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameIsNull() {
            addCriterion("docker_container_name is null");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameIsNotNull() {
            addCriterion("docker_container_name is not null");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameEqualTo(String value) {
            addCriterion("docker_container_name =", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameNotEqualTo(String value) {
            addCriterion("docker_container_name <>", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameGreaterThan(String value) {
            addCriterion("docker_container_name >", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameGreaterThanOrEqualTo(String value) {
            addCriterion("docker_container_name >=", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameLessThan(String value) {
            addCriterion("docker_container_name <", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameLessThanOrEqualTo(String value) {
            addCriterion("docker_container_name <=", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameLike(String value) {
            addCriterion("docker_container_name like", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameNotLike(String value) {
            addCriterion("docker_container_name not like", value, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameIn(List<String> values) {
            addCriterion("docker_container_name in", values, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameNotIn(List<String> values) {
            addCriterion("docker_container_name not in", values, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameBetween(String value1, String value2) {
            addCriterion("docker_container_name between", value1, value2, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerContainerNameNotBetween(String value1, String value2) {
            addCriterion("docker_container_name not between", value1, value2, "dockerContainerName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameIsNull() {
            addCriterion("docker_image_name is null");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameIsNotNull() {
            addCriterion("docker_image_name is not null");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameEqualTo(String value) {
            addCriterion("docker_image_name =", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameNotEqualTo(String value) {
            addCriterion("docker_image_name <>", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameGreaterThan(String value) {
            addCriterion("docker_image_name >", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("docker_image_name >=", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameLessThan(String value) {
            addCriterion("docker_image_name <", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameLessThanOrEqualTo(String value) {
            addCriterion("docker_image_name <=", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameLike(String value) {
            addCriterion("docker_image_name like", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameNotLike(String value) {
            addCriterion("docker_image_name not like", value, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameIn(List<String> values) {
            addCriterion("docker_image_name in", values, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameNotIn(List<String> values) {
            addCriterion("docker_image_name not in", values, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameBetween(String value1, String value2) {
            addCriterion("docker_image_name between", value1, value2, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerImageNameNotBetween(String value1, String value2) {
            addCriterion("docker_image_name not between", value1, value2, "dockerImageName");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointIsNull() {
            addCriterion("docker_entrypoint is null");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointIsNotNull() {
            addCriterion("docker_entrypoint is not null");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointEqualTo(String value) {
            addCriterion("docker_entrypoint =", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointNotEqualTo(String value) {
            addCriterion("docker_entrypoint <>", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointGreaterThan(String value) {
            addCriterion("docker_entrypoint >", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointGreaterThanOrEqualTo(String value) {
            addCriterion("docker_entrypoint >=", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointLessThan(String value) {
            addCriterion("docker_entrypoint <", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointLessThanOrEqualTo(String value) {
            addCriterion("docker_entrypoint <=", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointLike(String value) {
            addCriterion("docker_entrypoint like", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointNotLike(String value) {
            addCriterion("docker_entrypoint not like", value, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointIn(List<String> values) {
            addCriterion("docker_entrypoint in", values, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointNotIn(List<String> values) {
            addCriterion("docker_entrypoint not in", values, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointBetween(String value1, String value2) {
            addCriterion("docker_entrypoint between", value1, value2, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerEntrypointNotBetween(String value1, String value2) {
            addCriterion("docker_entrypoint not between", value1, value2, "dockerEntrypoint");
            return (Criteria) this;
        }

        public Criteria andDockerMountIsNull() {
            addCriterion("docker_mount is null");
            return (Criteria) this;
        }

        public Criteria andDockerMountIsNotNull() {
            addCriterion("docker_mount is not null");
            return (Criteria) this;
        }

        public Criteria andDockerMountEqualTo(String value) {
            addCriterion("docker_mount =", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountNotEqualTo(String value) {
            addCriterion("docker_mount <>", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountGreaterThan(String value) {
            addCriterion("docker_mount >", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountGreaterThanOrEqualTo(String value) {
            addCriterion("docker_mount >=", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountLessThan(String value) {
            addCriterion("docker_mount <", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountLessThanOrEqualTo(String value) {
            addCriterion("docker_mount <=", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountLike(String value) {
            addCriterion("docker_mount like", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountNotLike(String value) {
            addCriterion("docker_mount not like", value, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountIn(List<String> values) {
            addCriterion("docker_mount in", values, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountNotIn(List<String> values) {
            addCriterion("docker_mount not in", values, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountBetween(String value1, String value2) {
            addCriterion("docker_mount between", value1, value2, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerMountNotBetween(String value1, String value2) {
            addCriterion("docker_mount not between", value1, value2, "dockerMount");
            return (Criteria) this;
        }

        public Criteria andDockerLinkIsNull() {
            addCriterion("docker_link is null");
            return (Criteria) this;
        }

        public Criteria andDockerLinkIsNotNull() {
            addCriterion("docker_link is not null");
            return (Criteria) this;
        }

        public Criteria andDockerLinkEqualTo(String value) {
            addCriterion("docker_link =", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkNotEqualTo(String value) {
            addCriterion("docker_link <>", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkGreaterThan(String value) {
            addCriterion("docker_link >", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkGreaterThanOrEqualTo(String value) {
            addCriterion("docker_link >=", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkLessThan(String value) {
            addCriterion("docker_link <", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkLessThanOrEqualTo(String value) {
            addCriterion("docker_link <=", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkLike(String value) {
            addCriterion("docker_link like", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkNotLike(String value) {
            addCriterion("docker_link not like", value, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkIn(List<String> values) {
            addCriterion("docker_link in", values, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkNotIn(List<String> values) {
            addCriterion("docker_link not in", values, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkBetween(String value1, String value2) {
            addCriterion("docker_link between", value1, value2, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerLinkNotBetween(String value1, String value2) {
            addCriterion("docker_link not between", value1, value2, "dockerLink");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusIsNull() {
            addCriterion("docker_cpuset_cpus is null");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusIsNotNull() {
            addCriterion("docker_cpuset_cpus is not null");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusEqualTo(String value) {
            addCriterion("docker_cpuset_cpus =", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusNotEqualTo(String value) {
            addCriterion("docker_cpuset_cpus <>", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusGreaterThan(String value) {
            addCriterion("docker_cpuset_cpus >", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusGreaterThanOrEqualTo(String value) {
            addCriterion("docker_cpuset_cpus >=", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusLessThan(String value) {
            addCriterion("docker_cpuset_cpus <", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusLessThanOrEqualTo(String value) {
            addCriterion("docker_cpuset_cpus <=", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusLike(String value) {
            addCriterion("docker_cpuset_cpus like", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusNotLike(String value) {
            addCriterion("docker_cpuset_cpus not like", value, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusIn(List<String> values) {
            addCriterion("docker_cpuset_cpus in", values, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusNotIn(List<String> values) {
            addCriterion("docker_cpuset_cpus not in", values, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusBetween(String value1, String value2) {
            addCriterion("docker_cpuset_cpus between", value1, value2, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerCpusetCpusNotBetween(String value1, String value2) {
            addCriterion("docker_cpuset_cpus not between", value1, value2, "dockerCpusetCpus");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryIsNull() {
            addCriterion("docker_memory is null");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryIsNotNull() {
            addCriterion("docker_memory is not null");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryEqualTo(String value) {
            addCriterion("docker_memory =", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryNotEqualTo(String value) {
            addCriterion("docker_memory <>", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryGreaterThan(String value) {
            addCriterion("docker_memory >", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("docker_memory >=", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryLessThan(String value) {
            addCriterion("docker_memory <", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryLessThanOrEqualTo(String value) {
            addCriterion("docker_memory <=", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryLike(String value) {
            addCriterion("docker_memory like", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryNotLike(String value) {
            addCriterion("docker_memory not like", value, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryIn(List<String> values) {
            addCriterion("docker_memory in", values, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryNotIn(List<String> values) {
            addCriterion("docker_memory not in", values, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryBetween(String value1, String value2) {
            addCriterion("docker_memory between", value1, value2, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryNotBetween(String value1, String value2) {
            addCriterion("docker_memory not between", value1, value2, "dockerMemory");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapIsNull() {
            addCriterion("docker_memory_swap is null");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapIsNotNull() {
            addCriterion("docker_memory_swap is not null");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapEqualTo(String value) {
            addCriterion("docker_memory_swap =", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapNotEqualTo(String value) {
            addCriterion("docker_memory_swap <>", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapGreaterThan(String value) {
            addCriterion("docker_memory_swap >", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapGreaterThanOrEqualTo(String value) {
            addCriterion("docker_memory_swap >=", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapLessThan(String value) {
            addCriterion("docker_memory_swap <", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapLessThanOrEqualTo(String value) {
            addCriterion("docker_memory_swap <=", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapLike(String value) {
            addCriterion("docker_memory_swap like", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapNotLike(String value) {
            addCriterion("docker_memory_swap not like", value, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapIn(List<String> values) {
            addCriterion("docker_memory_swap in", values, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapNotIn(List<String> values) {
            addCriterion("docker_memory_swap not in", values, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapBetween(String value1, String value2) {
            addCriterion("docker_memory_swap between", value1, value2, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwapNotBetween(String value1, String value2) {
            addCriterion("docker_memory_swap not between", value1, value2, "dockerMemorySwap");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationIsNull() {
            addCriterion("docker_memory_reservation is null");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationIsNotNull() {
            addCriterion("docker_memory_reservation is not null");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationEqualTo(String value) {
            addCriterion("docker_memory_reservation =", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationNotEqualTo(String value) {
            addCriterion("docker_memory_reservation <>", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationGreaterThan(String value) {
            addCriterion("docker_memory_reservation >", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationGreaterThanOrEqualTo(String value) {
            addCriterion("docker_memory_reservation >=", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationLessThan(String value) {
            addCriterion("docker_memory_reservation <", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationLessThanOrEqualTo(String value) {
            addCriterion("docker_memory_reservation <=", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationLike(String value) {
            addCriterion("docker_memory_reservation like", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationNotLike(String value) {
            addCriterion("docker_memory_reservation not like", value, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationIn(List<String> values) {
            addCriterion("docker_memory_reservation in", values, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationNotIn(List<String> values) {
            addCriterion("docker_memory_reservation not in", values, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationBetween(String value1, String value2) {
            addCriterion("docker_memory_reservation between", value1, value2, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemoryReservationNotBetween(String value1, String value2) {
            addCriterion("docker_memory_reservation not between", value1, value2, "dockerMemoryReservation");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessIsNull() {
            addCriterion("docker_memory_swappiness is null");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessIsNotNull() {
            addCriterion("docker_memory_swappiness is not null");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessEqualTo(String value) {
            addCriterion("docker_memory_swappiness =", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessNotEqualTo(String value) {
            addCriterion("docker_memory_swappiness <>", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessGreaterThan(String value) {
            addCriterion("docker_memory_swappiness >", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessGreaterThanOrEqualTo(String value) {
            addCriterion("docker_memory_swappiness >=", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessLessThan(String value) {
            addCriterion("docker_memory_swappiness <", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessLessThanOrEqualTo(String value) {
            addCriterion("docker_memory_swappiness <=", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessLike(String value) {
            addCriterion("docker_memory_swappiness like", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessNotLike(String value) {
            addCriterion("docker_memory_swappiness not like", value, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessIn(List<String> values) {
            addCriterion("docker_memory_swappiness in", values, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessNotIn(List<String> values) {
            addCriterion("docker_memory_swappiness not in", values, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessBetween(String value1, String value2) {
            addCriterion("docker_memory_swappiness between", value1, value2, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andDockerMemorySwappinessNotBetween(String value1, String value2) {
            addCriterion("docker_memory_swappiness not between", value1, value2, "dockerMemorySwappiness");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}