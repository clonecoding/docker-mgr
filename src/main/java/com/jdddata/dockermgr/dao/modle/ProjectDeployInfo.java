package com.jdddata.dockermgr.dao.modle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangheng
 */
public class ProjectDeployInfo implements Serializable {

    private static final long serialVersionUID = 1532346273645L;

    /**
     * 主键
     * 自增Id
     * isNullAble:0
     */
    private Long id;

    /**
     * 项目id
     * isNullAble:1
     */
    private String projectId;

    /**
     * 项目容器ip地址
     * isNullAble:1
     */
    private String containerIp;

    /**
     * 环境
     * isNullAble:1
     */
    private String env;

    /**
     * 1.docker部署；2.非docker部署
     * isNullAble:1
     */
    private Integer deployMode;

    /**
     * docker 部署容器民称
     * isNullAble:1
     */
    private String containerName;

    /**
     * 是否有效
     * isNullAble:1
     */
    private Integer isValid;

    /**
     * 是否删除
     * isNullAble:1
     */
    private Integer isDelete;

    /**
     * 创建时间
     * isNullAble:1
     */
    private java.time.LocalDateTime createTime;

    /**
     * 创建人
     * isNullAble:1
     */
    private String createUser;

    /**
     * 更新时间
     * isNullAble:1
     */
    private java.time.LocalDateTime updateTime;

    /**
     * 更新人
     * isNullAble:1
     */
    private String updateUser;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setContainerIp(String containerIp) {
        this.containerIp = containerIp;
    }

    public String getContainerIp() {
        return this.containerIp;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getEnv() {
        return this.env;
    }

    public void setDeployMode(Integer deployMode) {
        this.deployMode = deployMode;
    }

    public Integer getDeployMode() {
        return this.deployMode;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getContainerName() {
        return this.containerName;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsValid() {
        return this.isValid;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setCreateTime(java.time.LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public java.time.LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setUpdateTime(java.time.LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public java.time.LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    @Override
    public String toString() {
        return "ProjectDeployInfo{" +
                "id='" + id + '\'' +
                "projectId='" + projectId + '\'' +
                "containerIp='" + containerIp + '\'' +
                "env='" + env + '\'' +
                "deployMode='" + deployMode + '\'' +
                "containerName='" + containerName + '\'' +
                "isValid='" + isValid + '\'' +
                "isDelete='" + isDelete + '\'' +
                "createTime='" + createTime + '\'' +
                "createUser='" + createUser + '\'' +
                "updateTime='" + updateTime + '\'' +
                "updateUser='" + updateUser + '\'' +
                '}';
    }

    public static Builder Build() {
        return new Builder();
    }

    public static ConditionBuilder ConditionBuild() {
        return new ConditionBuilder();
    }

    public static UpdateBuilder UpdateBuild() {
        return new UpdateBuilder();
    }

    public static QueryBuilder QueryBuild() {
        return new QueryBuilder();
    }

    public static class UpdateBuilder {

        private ProjectDeployInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProjectDeployInfo set) {
            this.set = set;
            return this;
        }

        public ProjectDeployInfo getSet() {
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where) {
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere() {
            return this.where;
        }

        public UpdateBuilder build() {
            return this;
        }
    }

    public static class QueryBuilder extends ProjectDeployInfo {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        private List<Long> idList;

        public List<Long> getIdList() {
            return this.idList;
        }

        private Long idSt;

        private Long idEd;

        public Long getIdSt() {
            return this.idSt;
        }

        public Long getIdEd() {
            return this.idEd;
        }

        private List<String> projectIdList;

        public List<String> getProjectIdList() {
            return this.projectIdList;
        }

        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId() {
            return this.fuzzyProjectId;
        }

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId() {
            return this.rightFuzzyProjectId;
        }

        private List<String> containerIpList;

        public List<String> getContainerIpList() {
            return this.containerIpList;
        }

        private List<String> fuzzyContainerIp;

        public List<String> getFuzzyContainerIp() {
            return this.fuzzyContainerIp;
        }

        private List<String> rightFuzzyContainerIp;

        public List<String> getRightFuzzyContainerIp() {
            return this.rightFuzzyContainerIp;
        }

        private List<String> envList;

        public List<String> getEnvList() {
            return this.envList;
        }

        private List<String> fuzzyEnv;

        public List<String> getFuzzyEnv() {
            return this.fuzzyEnv;
        }

        private List<String> rightFuzzyEnv;

        public List<String> getRightFuzzyEnv() {
            return this.rightFuzzyEnv;
        }

        private List<Integer> deployModeList;

        public List<Integer> getDeployModeList() {
            return this.deployModeList;
        }

        private Integer deployModeSt;

        private Integer deployModeEd;

        public Integer getDeployModeSt() {
            return this.deployModeSt;
        }

        public Integer getDeployModeEd() {
            return this.deployModeEd;
        }

        private List<String> containerNameList;

        public List<String> getContainerNameList() {
            return this.containerNameList;
        }

        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName() {
            return this.fuzzyContainerName;
        }

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName() {
            return this.rightFuzzyContainerName;
        }

        private List<Integer> isValidList;

        public List<Integer> getIsValidList() {
            return this.isValidList;
        }

        private Integer isValidSt;

        private Integer isValidEd;

        public Integer getIsValidSt() {
            return this.isValidSt;
        }

        public Integer getIsValidEd() {
            return this.isValidEd;
        }

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList() {
            return this.isDeleteList;
        }

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt() {
            return this.isDeleteSt;
        }

        public Integer getIsDeleteEd() {
            return this.isDeleteEd;
        }

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList() {
            return this.createTimeList;
        }

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt() {
            return this.createTimeSt;
        }

        public java.time.LocalDateTime getCreateTimeEd() {
            return this.createTimeEd;
        }

        private List<String> createUserList;

        public List<String> getCreateUserList() {
            return this.createUserList;
        }

        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser() {
            return this.fuzzyCreateUser;
        }

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser() {
            return this.rightFuzzyCreateUser;
        }

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList() {
            return this.updateTimeList;
        }

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt() {
            return this.updateTimeSt;
        }

        public java.time.LocalDateTime getUpdateTimeEd() {
            return this.updateTimeEd;
        }

        private List<String> updateUserList;

        public List<String> getUpdateUserList() {
            return this.updateUserList;
        }

        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser() {
            return this.fuzzyUpdateUser;
        }

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser() {
            return this.rightFuzzyUpdateUser;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt, Long idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt) {
            this.idSt = idSt;
            return this;
        }

        public QueryBuilder idLessEqThan(Long idEd) {
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder id(Long id) {
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id) {
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId() {
            setFetchFields("fetchFields", "id");
            return this;
        }

        public QueryBuilder excludeId() {
            setFetchFields("excludeFields", "id");
            return this;
        }

        public QueryBuilder fuzzyProjectId(List<String> fuzzyProjectId) {
            this.fuzzyProjectId = fuzzyProjectId;
            return this;
        }

        public QueryBuilder fuzzyProjectId(String... fuzzyProjectId) {
            this.fuzzyProjectId = solveNullList(fuzzyProjectId);
            return this;
        }

        public QueryBuilder rightFuzzyProjectId(List<String> rightFuzzyProjectId) {
            this.rightFuzzyProjectId = rightFuzzyProjectId;
            return this;
        }

        public QueryBuilder rightFuzzyProjectId(String... rightFuzzyProjectId) {
            this.rightFuzzyProjectId = solveNullList(rightFuzzyProjectId);
            return this;
        }

        public QueryBuilder projectId(String projectId) {
            setProjectId(projectId);
            return this;
        }

        public QueryBuilder projectIdList(String... projectId) {
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public QueryBuilder projectIdList(List<String> projectId) {
            this.projectIdList = projectId;
            return this;
        }

        public QueryBuilder fetchProjectId() {
            setFetchFields("fetchFields", "projectId");
            return this;
        }

        public QueryBuilder excludeProjectId() {
            setFetchFields("excludeFields", "projectId");
            return this;
        }

        public QueryBuilder fuzzyContainerIp(List<String> fuzzyContainerIp) {
            this.fuzzyContainerIp = fuzzyContainerIp;
            return this;
        }

        public QueryBuilder fuzzyContainerIp(String... fuzzyContainerIp) {
            this.fuzzyContainerIp = solveNullList(fuzzyContainerIp);
            return this;
        }

        public QueryBuilder rightFuzzyContainerIp(List<String> rightFuzzyContainerIp) {
            this.rightFuzzyContainerIp = rightFuzzyContainerIp;
            return this;
        }

        public QueryBuilder rightFuzzyContainerIp(String... rightFuzzyContainerIp) {
            this.rightFuzzyContainerIp = solveNullList(rightFuzzyContainerIp);
            return this;
        }

        public QueryBuilder containerIp(String containerIp) {
            setContainerIp(containerIp);
            return this;
        }

        public QueryBuilder containerIpList(String... containerIp) {
            this.containerIpList = solveNullList(containerIp);
            return this;
        }

        public QueryBuilder containerIpList(List<String> containerIp) {
            this.containerIpList = containerIp;
            return this;
        }

        public QueryBuilder fetchContainerIp() {
            setFetchFields("fetchFields", "containerIp");
            return this;
        }

        public QueryBuilder excludeContainerIp() {
            setFetchFields("excludeFields", "containerIp");
            return this;
        }

        public QueryBuilder fuzzyEnv(List<String> fuzzyEnv) {
            this.fuzzyEnv = fuzzyEnv;
            return this;
        }

        public QueryBuilder fuzzyEnv(String... fuzzyEnv) {
            this.fuzzyEnv = solveNullList(fuzzyEnv);
            return this;
        }

        public QueryBuilder rightFuzzyEnv(List<String> rightFuzzyEnv) {
            this.rightFuzzyEnv = rightFuzzyEnv;
            return this;
        }

        public QueryBuilder rightFuzzyEnv(String... rightFuzzyEnv) {
            this.rightFuzzyEnv = solveNullList(rightFuzzyEnv);
            return this;
        }

        public QueryBuilder env(String env) {
            setEnv(env);
            return this;
        }

        public QueryBuilder envList(String... env) {
            this.envList = solveNullList(env);
            return this;
        }

        public QueryBuilder envList(List<String> env) {
            this.envList = env;
            return this;
        }

        public QueryBuilder fetchEnv() {
            setFetchFields("fetchFields", "env");
            return this;
        }

        public QueryBuilder excludeEnv() {
            setFetchFields("excludeFields", "env");
            return this;
        }

        public QueryBuilder deployModeBetWeen(Integer deployModeSt, Integer deployModeEd) {
            this.deployModeSt = deployModeSt;
            this.deployModeEd = deployModeEd;
            return this;
        }

        public QueryBuilder deployModeGreaterEqThan(Integer deployModeSt) {
            this.deployModeSt = deployModeSt;
            return this;
        }

        public QueryBuilder deployModeLessEqThan(Integer deployModeEd) {
            this.deployModeEd = deployModeEd;
            return this;
        }

        public QueryBuilder deployMode(Integer deployMode) {
            setDeployMode(deployMode);
            return this;
        }

        public QueryBuilder deployModeList(Integer... deployMode) {
            this.deployModeList = solveNullList(deployMode);
            return this;
        }

        public QueryBuilder deployModeList(List<Integer> deployMode) {
            this.deployModeList = deployMode;
            return this;
        }

        public QueryBuilder fetchDeployMode() {
            setFetchFields("fetchFields", "deployMode");
            return this;
        }

        public QueryBuilder excludeDeployMode() {
            setFetchFields("excludeFields", "deployMode");
            return this;
        }

        public QueryBuilder fuzzyContainerName(List<String> fuzzyContainerName) {
            this.fuzzyContainerName = fuzzyContainerName;
            return this;
        }

        public QueryBuilder fuzzyContainerName(String... fuzzyContainerName) {
            this.fuzzyContainerName = solveNullList(fuzzyContainerName);
            return this;
        }

        public QueryBuilder rightFuzzyContainerName(List<String> rightFuzzyContainerName) {
            this.rightFuzzyContainerName = rightFuzzyContainerName;
            return this;
        }

        public QueryBuilder rightFuzzyContainerName(String... rightFuzzyContainerName) {
            this.rightFuzzyContainerName = solveNullList(rightFuzzyContainerName);
            return this;
        }

        public QueryBuilder containerName(String containerName) {
            setContainerName(containerName);
            return this;
        }

        public QueryBuilder containerNameList(String... containerName) {
            this.containerNameList = solveNullList(containerName);
            return this;
        }

        public QueryBuilder containerNameList(List<String> containerName) {
            this.containerNameList = containerName;
            return this;
        }

        public QueryBuilder fetchContainerName() {
            setFetchFields("fetchFields", "containerName");
            return this;
        }

        public QueryBuilder excludeContainerName() {
            setFetchFields("excludeFields", "containerName");
            return this;
        }

        public QueryBuilder isValidBetWeen(Integer isValidSt, Integer isValidEd) {
            this.isValidSt = isValidSt;
            this.isValidEd = isValidEd;
            return this;
        }

        public QueryBuilder isValidGreaterEqThan(Integer isValidSt) {
            this.isValidSt = isValidSt;
            return this;
        }

        public QueryBuilder isValidLessEqThan(Integer isValidEd) {
            this.isValidEd = isValidEd;
            return this;
        }

        public QueryBuilder isValid(Integer isValid) {
            setIsValid(isValid);
            return this;
        }

        public QueryBuilder isValidList(Integer... isValid) {
            this.isValidList = solveNullList(isValid);
            return this;
        }

        public QueryBuilder isValidList(List<Integer> isValid) {
            this.isValidList = isValid;
            return this;
        }

        public QueryBuilder fetchIsValid() {
            setFetchFields("fetchFields", "isValid");
            return this;
        }

        public QueryBuilder excludeIsValid() {
            setFetchFields("excludeFields", "isValid");
            return this;
        }

        public QueryBuilder isDeleteBetWeen(Integer isDeleteSt, Integer isDeleteEd) {
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDeleteGreaterEqThan(Integer isDeleteSt) {
            this.isDeleteSt = isDeleteSt;
            return this;
        }

        public QueryBuilder isDeleteLessEqThan(Integer isDeleteEd) {
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDelete(Integer isDelete) {
            setIsDelete(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(Integer... isDelete) {
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(List<Integer> isDelete) {
            this.isDeleteList = isDelete;
            return this;
        }

        public QueryBuilder fetchIsDelete() {
            setFetchFields("fetchFields", "isDelete");
            return this;
        }

        public QueryBuilder excludeIsDelete() {
            setFetchFields("excludeFields", "isDelete");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt, java.time.LocalDateTime createTimeEd) {
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt) {
            this.createTimeSt = createTimeSt;
            return this;
        }

        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd) {
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTime(java.time.LocalDateTime createTime) {
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime... createTime) {
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime) {
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime() {
            setFetchFields("fetchFields", "createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime() {
            setFetchFields("excludeFields", "createTime");
            return this;
        }

        public QueryBuilder fuzzyCreateUser(List<String> fuzzyCreateUser) {
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public QueryBuilder fuzzyCreateUser(String... fuzzyCreateUser) {
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser(List<String> rightFuzzyCreateUser) {
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser(String... rightFuzzyCreateUser) {
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public QueryBuilder createUser(String createUser) {
            setCreateUser(createUser);
            return this;
        }

        public QueryBuilder createUserList(String... createUser) {
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public QueryBuilder createUserList(List<String> createUser) {
            this.createUserList = createUser;
            return this;
        }

        public QueryBuilder fetchCreateUser() {
            setFetchFields("fetchFields", "createUser");
            return this;
        }

        public QueryBuilder excludeCreateUser() {
            setFetchFields("excludeFields", "createUser");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt, java.time.LocalDateTime updateTimeEd) {
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt) {
            this.updateTimeSt = updateTimeSt;
            return this;
        }

        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd) {
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTime(java.time.LocalDateTime updateTime) {
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime... updateTime) {
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime) {
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime() {
            setFetchFields("fetchFields", "updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime() {
            setFetchFields("excludeFields", "updateTime");
            return this;
        }

        public QueryBuilder fuzzyUpdateUser(List<String> fuzzyUpdateUser) {
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public QueryBuilder fuzzyUpdateUser(String... fuzzyUpdateUser) {
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser(List<String> rightFuzzyUpdateUser) {
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser(String... rightFuzzyUpdateUser) {
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public QueryBuilder updateUser(String updateUser) {
            setUpdateUser(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(String... updateUser) {
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(List<String> updateUser) {
            this.updateUserList = updateUser;
            return this;
        }

        public QueryBuilder fetchUpdateUser() {
            setFetchFields("fetchFields", "updateUser");
            return this;
        }

        public QueryBuilder excludeUpdateUser() {
            setFetchFields("excludeFields", "updateUser");
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll() {
            this.fetchFields.put("AllFields", true);
            return this;
        }

        public QueryBuilder addField(String... fields) {
            List<String> list = new ArrayList<>();
            if (fields != null) {
                for (String field : fields) {
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields", list);
            return this;
        }

        @SuppressWarnings("unchecked")
        private void setFetchFields(String key, String val) {
            Map<String, Boolean> fields = (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null) {
                fields = new HashMap<>();
            }
            fields.put(val, true);
            this.fetchFields.put(key, fields);
        }

        public ProjectDeployInfo build() {
            return this;
        }
    }

    public static class ConditionBuilder {
        private List<Long> idList;

        public List<Long> getIdList() {
            return this.idList;
        }

        private Long idSt;

        private Long idEd;

        public Long getIdSt() {
            return this.idSt;
        }

        public Long getIdEd() {
            return this.idEd;
        }

        private List<String> projectIdList;

        public List<String> getProjectIdList() {
            return this.projectIdList;
        }

        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId() {
            return this.fuzzyProjectId;
        }

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId() {
            return this.rightFuzzyProjectId;
        }

        private List<String> containerIpList;

        public List<String> getContainerIpList() {
            return this.containerIpList;
        }

        private List<String> fuzzyContainerIp;

        public List<String> getFuzzyContainerIp() {
            return this.fuzzyContainerIp;
        }

        private List<String> rightFuzzyContainerIp;

        public List<String> getRightFuzzyContainerIp() {
            return this.rightFuzzyContainerIp;
        }

        private List<String> envList;

        public List<String> getEnvList() {
            return this.envList;
        }

        private List<String> fuzzyEnv;

        public List<String> getFuzzyEnv() {
            return this.fuzzyEnv;
        }

        private List<String> rightFuzzyEnv;

        public List<String> getRightFuzzyEnv() {
            return this.rightFuzzyEnv;
        }

        private List<Integer> deployModeList;

        public List<Integer> getDeployModeList() {
            return this.deployModeList;
        }

        private Integer deployModeSt;

        private Integer deployModeEd;

        public Integer getDeployModeSt() {
            return this.deployModeSt;
        }

        public Integer getDeployModeEd() {
            return this.deployModeEd;
        }

        private List<String> containerNameList;

        public List<String> getContainerNameList() {
            return this.containerNameList;
        }

        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName() {
            return this.fuzzyContainerName;
        }

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName() {
            return this.rightFuzzyContainerName;
        }

        private List<Integer> isValidList;

        public List<Integer> getIsValidList() {
            return this.isValidList;
        }

        private Integer isValidSt;

        private Integer isValidEd;

        public Integer getIsValidSt() {
            return this.isValidSt;
        }

        public Integer getIsValidEd() {
            return this.isValidEd;
        }

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList() {
            return this.isDeleteList;
        }

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt() {
            return this.isDeleteSt;
        }

        public Integer getIsDeleteEd() {
            return this.isDeleteEd;
        }

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList() {
            return this.createTimeList;
        }

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt() {
            return this.createTimeSt;
        }

        public java.time.LocalDateTime getCreateTimeEd() {
            return this.createTimeEd;
        }

        private List<String> createUserList;

        public List<String> getCreateUserList() {
            return this.createUserList;
        }

        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser() {
            return this.fuzzyCreateUser;
        }

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser() {
            return this.rightFuzzyCreateUser;
        }

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList() {
            return this.updateTimeList;
        }

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt() {
            return this.updateTimeSt;
        }

        public java.time.LocalDateTime getUpdateTimeEd() {
            return this.updateTimeEd;
        }

        private List<String> updateUserList;

        public List<String> getUpdateUserList() {
            return this.updateUserList;
        }

        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser() {
            return this.fuzzyUpdateUser;
        }

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser() {
            return this.rightFuzzyUpdateUser;
        }

        public ConditionBuilder idBetWeen(Long idSt, Long idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt) {
            this.idSt = idSt;
            return this;
        }

        public ConditionBuilder idLessEqThan(Long idEd) {
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idList(Long... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id) {
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyProjectId(List<String> fuzzyProjectId) {
            this.fuzzyProjectId = fuzzyProjectId;
            return this;
        }

        public ConditionBuilder fuzzyProjectId(String... fuzzyProjectId) {
            this.fuzzyProjectId = solveNullList(fuzzyProjectId);
            return this;
        }

        public ConditionBuilder rightFuzzyProjectId(List<String> rightFuzzyProjectId) {
            this.rightFuzzyProjectId = rightFuzzyProjectId;
            return this;
        }

        public ConditionBuilder rightFuzzyProjectId(String... rightFuzzyProjectId) {
            this.rightFuzzyProjectId = solveNullList(rightFuzzyProjectId);
            return this;
        }

        public ConditionBuilder projectIdList(String... projectId) {
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public ConditionBuilder projectIdList(List<String> projectId) {
            this.projectIdList = projectId;
            return this;
        }

        public ConditionBuilder fuzzyContainerIp(List<String> fuzzyContainerIp) {
            this.fuzzyContainerIp = fuzzyContainerIp;
            return this;
        }

        public ConditionBuilder fuzzyContainerIp(String... fuzzyContainerIp) {
            this.fuzzyContainerIp = solveNullList(fuzzyContainerIp);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerIp(List<String> rightFuzzyContainerIp) {
            this.rightFuzzyContainerIp = rightFuzzyContainerIp;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerIp(String... rightFuzzyContainerIp) {
            this.rightFuzzyContainerIp = solveNullList(rightFuzzyContainerIp);
            return this;
        }

        public ConditionBuilder containerIpList(String... containerIp) {
            this.containerIpList = solveNullList(containerIp);
            return this;
        }

        public ConditionBuilder containerIpList(List<String> containerIp) {
            this.containerIpList = containerIp;
            return this;
        }

        public ConditionBuilder fuzzyEnv(List<String> fuzzyEnv) {
            this.fuzzyEnv = fuzzyEnv;
            return this;
        }

        public ConditionBuilder fuzzyEnv(String... fuzzyEnv) {
            this.fuzzyEnv = solveNullList(fuzzyEnv);
            return this;
        }

        public ConditionBuilder rightFuzzyEnv(List<String> rightFuzzyEnv) {
            this.rightFuzzyEnv = rightFuzzyEnv;
            return this;
        }

        public ConditionBuilder rightFuzzyEnv(String... rightFuzzyEnv) {
            this.rightFuzzyEnv = solveNullList(rightFuzzyEnv);
            return this;
        }

        public ConditionBuilder envList(String... env) {
            this.envList = solveNullList(env);
            return this;
        }

        public ConditionBuilder envList(List<String> env) {
            this.envList = env;
            return this;
        }

        public ConditionBuilder deployModeBetWeen(Integer deployModeSt, Integer deployModeEd) {
            this.deployModeSt = deployModeSt;
            this.deployModeEd = deployModeEd;
            return this;
        }

        public ConditionBuilder deployModeGreaterEqThan(Integer deployModeSt) {
            this.deployModeSt = deployModeSt;
            return this;
        }

        public ConditionBuilder deployModeLessEqThan(Integer deployModeEd) {
            this.deployModeEd = deployModeEd;
            return this;
        }

        public ConditionBuilder deployModeList(Integer... deployMode) {
            this.deployModeList = solveNullList(deployMode);
            return this;
        }

        public ConditionBuilder deployModeList(List<Integer> deployMode) {
            this.deployModeList = deployMode;
            return this;
        }

        public ConditionBuilder fuzzyContainerName(List<String> fuzzyContainerName) {
            this.fuzzyContainerName = fuzzyContainerName;
            return this;
        }

        public ConditionBuilder fuzzyContainerName(String... fuzzyContainerName) {
            this.fuzzyContainerName = solveNullList(fuzzyContainerName);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerName(List<String> rightFuzzyContainerName) {
            this.rightFuzzyContainerName = rightFuzzyContainerName;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerName(String... rightFuzzyContainerName) {
            this.rightFuzzyContainerName = solveNullList(rightFuzzyContainerName);
            return this;
        }

        public ConditionBuilder containerNameList(String... containerName) {
            this.containerNameList = solveNullList(containerName);
            return this;
        }

        public ConditionBuilder containerNameList(List<String> containerName) {
            this.containerNameList = containerName;
            return this;
        }

        public ConditionBuilder isValidBetWeen(Integer isValidSt, Integer isValidEd) {
            this.isValidSt = isValidSt;
            this.isValidEd = isValidEd;
            return this;
        }

        public ConditionBuilder isValidGreaterEqThan(Integer isValidSt) {
            this.isValidSt = isValidSt;
            return this;
        }

        public ConditionBuilder isValidLessEqThan(Integer isValidEd) {
            this.isValidEd = isValidEd;
            return this;
        }

        public ConditionBuilder isValidList(Integer... isValid) {
            this.isValidList = solveNullList(isValid);
            return this;
        }

        public ConditionBuilder isValidList(List<Integer> isValid) {
            this.isValidList = isValid;
            return this;
        }

        public ConditionBuilder isDeleteBetWeen(Integer isDeleteSt, Integer isDeleteEd) {
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteGreaterEqThan(Integer isDeleteSt) {
            this.isDeleteSt = isDeleteSt;
            return this;
        }

        public ConditionBuilder isDeleteLessEqThan(Integer isDeleteEd) {
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteList(Integer... isDelete) {
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public ConditionBuilder isDeleteList(List<Integer> isDelete) {
            this.isDeleteList = isDelete;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt, java.time.LocalDateTime createTimeEd) {
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt) {
            this.createTimeSt = createTimeSt;
            return this;
        }

        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd) {
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeList(java.time.LocalDateTime... createTime) {
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime) {
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser(List<String> fuzzyCreateUser) {
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser(String... fuzzyCreateUser) {
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser(List<String> rightFuzzyCreateUser) {
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser(String... rightFuzzyCreateUser) {
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public ConditionBuilder createUserList(String... createUser) {
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public ConditionBuilder createUserList(List<String> createUser) {
            this.createUserList = createUser;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt, java.time.LocalDateTime updateTimeEd) {
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt) {
            this.updateTimeSt = updateTimeSt;
            return this;
        }

        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd) {
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeList(java.time.LocalDateTime... updateTime) {
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime) {
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser(List<String> fuzzyUpdateUser) {
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser(String... fuzzyUpdateUser) {
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser(List<String> rightFuzzyUpdateUser) {
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser(String... rightFuzzyUpdateUser) {
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder updateUserList(String... updateUser) {
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public ConditionBuilder updateUserList(List<String> updateUser) {
            this.updateUserList = updateUser;
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build() {
            return this;
        }
    }

    public static class Builder {

        private ProjectDeployInfo obj;

        public Builder() {
            this.obj = new ProjectDeployInfo();
        }

        public Builder id(Long id) {
            this.obj.setId(id);
            return this;
        }

        public Builder projectId(String projectId) {
            this.obj.setProjectId(projectId);
            return this;
        }

        public Builder containerIp(String containerIp) {
            this.obj.setContainerIp(containerIp);
            return this;
        }

        public Builder env(String env) {
            this.obj.setEnv(env);
            return this;
        }

        public Builder deployMode(Integer deployMode) {
            this.obj.setDeployMode(deployMode);
            return this;
        }

        public Builder containerName(String containerName) {
            this.obj.setContainerName(containerName);
            return this;
        }

        public Builder isValid(Integer isValid) {
            this.obj.setIsValid(isValid);
            return this;
        }

        public Builder isDelete(Integer isDelete) {
            this.obj.setIsDelete(isDelete);
            return this;
        }

        public Builder createTime(java.time.LocalDateTime createTime) {
            this.obj.setCreateTime(createTime);
            return this;
        }

        public Builder createUser(String createUser) {
            this.obj.setCreateUser(createUser);
            return this;
        }

        public Builder updateTime(java.time.LocalDateTime updateTime) {
            this.obj.setUpdateTime(updateTime);
            return this;
        }

        public Builder updateUser(String updateUser) {
            this.obj.setUpdateUser(updateUser);
            return this;
        }

        public ProjectDeployInfo build() {
            return obj;
        }
    }

}
