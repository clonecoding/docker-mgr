package com.jdddata.dockermgr.dao.modle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhangheng
*/
public class ProjectDeployInfo implements Serializable {

    private static final long serialVersionUID = 1532582462446L;


    /**
    * 主键
    * 自增Id
    * isNullAble:0
    */
    private Long id;

    /**
    * 项目id
    * isNullAble:0
    */
    private String projectId;

    /**
    * 项目宿主机ip地址
    * isNullAble:0
    */
    private String hostIp;

    /**
    * 环境
    * isNullAble:1,defaultVal:
    */
    private String dockerEnv;

    /**
    * 1.docker部署；2.非docker部署
    * isNullAble:1,defaultVal:1
    */
    private Integer deployMode;

    /**
    * docker 部署容器名称
    * isNullAble:1,defaultVal:
    */
    private String containerName;

    /**
    * git分支版本
    * isNullAble:1,defaultVal:
    */
    private String gitBranch;

    /**
    * nexus 下载地址
    * isNullAble:1,defaultVal:
    */
    private String nexusTargetUrl;

    /**
    * docker镜像名称
    * isNullAble:1,defaultVal:
    */
    private String dockerImageName;

    /**
    * docker enterpoint
    * isNullAble:1,defaultVal:
    */
    private String entrypoint;

    /**
    * docker挂载情况
    * isNullAble:1,defaultVal:
    */
    private String dockerMount;

    /**
    * docker 链接情况
    * isNullAble:1,defaultVal:
    */
    private String dockerLink;

    /**
    * 是否有效
    * isNullAble:1,defaultVal:1
    */
    private Integer isValid;

    /**
    * 是否删除
    * isNullAble:1,defaultVal:0
    */
    private Integer isDelete;

    /**
    * 创建时间
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;

    /**
    * 创建人
    * isNullAble:1,defaultVal:
    */
    private String createUser;

    /**
    * 更新时间
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime updateTime;

    /**
    * 更新人
    * isNullAble:1,defaultVal:
    */
    private String updateUser;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProjectId(String projectId){this.projectId = projectId;}

    public String getProjectId(){return this.projectId;}

    public void setHostIp(String hostIp){this.hostIp = hostIp;}

    public String getHostIp(){return this.hostIp;}

    public void setDockerEnv(String dockerEnv){this.dockerEnv = dockerEnv;}

    public String getDockerEnv(){return this.dockerEnv;}

    public void setDeployMode(Integer deployMode){this.deployMode = deployMode;}

    public Integer getDeployMode(){return this.deployMode;}

    public void setContainerName(String containerName){this.containerName = containerName;}

    public String getContainerName(){return this.containerName;}

    public void setGitBranch(String gitBranch){this.gitBranch = gitBranch;}

    public String getGitBranch(){return this.gitBranch;}

    public void setNexusTargetUrl(String nexusTargetUrl){this.nexusTargetUrl = nexusTargetUrl;}

    public String getNexusTargetUrl(){return this.nexusTargetUrl;}

    public void setDockerImageName(String dockerImageName){this.dockerImageName = dockerImageName;}

    public String getDockerImageName(){return this.dockerImageName;}

    public void setEntrypoint(String entrypoint){this.entrypoint = entrypoint;}

    public String getEntrypoint(){return this.entrypoint;}

    public void setDockerMount(String dockerMount){this.dockerMount = dockerMount;}

    public String getDockerMount(){return this.dockerMount;}

    public void setDockerLink(String dockerLink){this.dockerLink = dockerLink;}

    public String getDockerLink(){return this.dockerLink;}

    public void setIsValid(Integer isValid){this.isValid = isValid;}

    public Integer getIsValid(){return this.isValid;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setCreateUser(String createUser){this.createUser = createUser;}

    public String getCreateUser(){return this.createUser;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}

    public void setUpdateUser(String updateUser){this.updateUser = updateUser;}

    public String getUpdateUser(){return this.updateUser;}
    @Override
    public String toString() {
        return "com.jdddata.dockermgr.dao.modle.ProjectDeployInfo{" +
                "id='" + id + '\'' +
                "projectId='" + projectId + '\'' +
                "hostIp='" + hostIp + '\'' +
                "dockerEnv='" + dockerEnv + '\'' +
                "deployMode='" + deployMode + '\'' +
                "containerName='" + containerName + '\'' +
                "gitBranch='" + gitBranch + '\'' +
                "nexusTargetUrl='" + nexusTargetUrl + '\'' +
                "dockerImageName='" + dockerImageName + '\'' +
                "entrypoint='" + entrypoint + '\'' +
                "dockerMount='" + dockerMount + '\'' +
                "dockerLink='" + dockerLink + '\'' +
                "isValid='" + isValid + '\'' +
                "isDelete='" + isDelete + '\'' +
                "createTime='" + createTime + '\'' +
                "createUser='" + createUser + '\'' +
                "updateTime='" + updateTime + '\'' +
                "updateUser='" + updateUser + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProjectDeployInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProjectDeployInfo set){
            this.set = set;
            return this;
        }

        public ProjectDeployInfo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ProjectDeployInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> projectIdList;

        public List<String> getProjectIdList(){return this.projectIdList;}


        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId(){return this.fuzzyProjectId;}

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId(){return this.rightFuzzyProjectId;}
        private List<String> hostIpList;

        public List<String> getHostIpList(){return this.hostIpList;}


        private List<String> fuzzyHostIp;

        public List<String> getFuzzyHostIp(){return this.fuzzyHostIp;}

        private List<String> rightFuzzyHostIp;

        public List<String> getRightFuzzyHostIp(){return this.rightFuzzyHostIp;}
        private List<String> dockerEnvList;

        public List<String> getDockerEnvList(){return this.dockerEnvList;}


        private List<String> fuzzyDockerEnv;

        public List<String> getFuzzyDockerEnv(){return this.fuzzyDockerEnv;}

        private List<String> rightFuzzyDockerEnv;

        public List<String> getRightFuzzyDockerEnv(){return this.rightFuzzyDockerEnv;}
        private List<Integer> deployModeList;

        public List<Integer> getDeployModeList(){return this.deployModeList;}

        private Integer deployModeSt;

        private Integer deployModeEd;

        public Integer getDeployModeSt(){return this.deployModeSt;}

        public Integer getDeployModeEd(){return this.deployModeEd;}

        private List<String> containerNameList;

        public List<String> getContainerNameList(){return this.containerNameList;}


        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName(){return this.fuzzyContainerName;}

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName(){return this.rightFuzzyContainerName;}
        private List<String> gitBranchList;

        public List<String> getGitBranchList(){return this.gitBranchList;}


        private List<String> fuzzyGitBranch;

        public List<String> getFuzzyGitBranch(){return this.fuzzyGitBranch;}

        private List<String> rightFuzzyGitBranch;

        public List<String> getRightFuzzyGitBranch(){return this.rightFuzzyGitBranch;}
        private List<String> nexusTargetUrlList;

        public List<String> getNexusTargetUrlList(){return this.nexusTargetUrlList;}


        private List<String> fuzzyNexusTargetUrl;

        public List<String> getFuzzyNexusTargetUrl(){return this.fuzzyNexusTargetUrl;}

        private List<String> rightFuzzyNexusTargetUrl;

        public List<String> getRightFuzzyNexusTargetUrl(){return this.rightFuzzyNexusTargetUrl;}
        private List<String> dockerImageNameList;

        public List<String> getDockerImageNameList(){return this.dockerImageNameList;}


        private List<String> fuzzyDockerImageName;

        public List<String> getFuzzyDockerImageName(){return this.fuzzyDockerImageName;}

        private List<String> rightFuzzyDockerImageName;

        public List<String> getRightFuzzyDockerImageName(){return this.rightFuzzyDockerImageName;}
        private List<String> entrypointList;

        public List<String> getEntrypointList(){return this.entrypointList;}


        private List<String> fuzzyEntrypoint;

        public List<String> getFuzzyEntrypoint(){return this.fuzzyEntrypoint;}

        private List<String> rightFuzzyEntrypoint;

        public List<String> getRightFuzzyEntrypoint(){return this.rightFuzzyEntrypoint;}
        private List<String> dockerMountList;

        public List<String> getDockerMountList(){return this.dockerMountList;}


        private List<String> fuzzyDockerMount;

        public List<String> getFuzzyDockerMount(){return this.fuzzyDockerMount;}

        private List<String> rightFuzzyDockerMount;

        public List<String> getRightFuzzyDockerMount(){return this.rightFuzzyDockerMount;}
        private List<String> dockerLinkList;

        public List<String> getDockerLinkList(){return this.dockerLinkList;}


        private List<String> fuzzyDockerLink;

        public List<String> getFuzzyDockerLink(){return this.fuzzyDockerLink;}

        private List<String> rightFuzzyDockerLink;

        public List<String> getRightFuzzyDockerLink(){return this.rightFuzzyDockerLink;}
        private List<Integer> isValidList;

        public List<Integer> getIsValidList(){return this.isValidList;}

        private Integer isValidSt;

        private Integer isValidEd;

        public Integer getIsValidSt(){return this.isValidSt;}

        public Integer getIsValidEd(){return this.isValidEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> createUserList;

        public List<String> getCreateUserList(){return this.createUserList;}


        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser(){return this.fuzzyCreateUser;}

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser(){return this.rightFuzzyCreateUser;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> updateUserList;

        public List<String> getUpdateUserList(){return this.updateUserList;}


        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser(){return this.fuzzyUpdateUser;}

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser(){return this.rightFuzzyUpdateUser;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyProjectId (List<String> fuzzyProjectId){
            this.fuzzyProjectId = fuzzyProjectId;
            return this;
        }

        public QueryBuilder fuzzyProjectId (String ... fuzzyProjectId){
            this.fuzzyProjectId = solveNullList(fuzzyProjectId);
            return this;
        }

        public QueryBuilder rightFuzzyProjectId (List<String> rightFuzzyProjectId){
            this.rightFuzzyProjectId = rightFuzzyProjectId;
            return this;
        }

        public QueryBuilder rightFuzzyProjectId (String ... rightFuzzyProjectId){
            this.rightFuzzyProjectId = solveNullList(rightFuzzyProjectId);
            return this;
        }

        public QueryBuilder projectId(String projectId){
            setProjectId(projectId);
            return this;
        }

        public QueryBuilder projectIdList(String ... projectId){
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public QueryBuilder projectIdList(List<String> projectId){
            this.projectIdList = projectId;
            return this;
        }

        public QueryBuilder fetchProjectId(){
            setFetchFields("fetchFields","projectId");
            return this;
        }

        public QueryBuilder excludeProjectId(){
            setFetchFields("excludeFields","projectId");
            return this;
        }

        public QueryBuilder fuzzyHostIp (List<String> fuzzyHostIp){
            this.fuzzyHostIp = fuzzyHostIp;
            return this;
        }

        public QueryBuilder fuzzyHostIp (String ... fuzzyHostIp){
            this.fuzzyHostIp = solveNullList(fuzzyHostIp);
            return this;
        }

        public QueryBuilder rightFuzzyHostIp (List<String> rightFuzzyHostIp){
            this.rightFuzzyHostIp = rightFuzzyHostIp;
            return this;
        }

        public QueryBuilder rightFuzzyHostIp (String ... rightFuzzyHostIp){
            this.rightFuzzyHostIp = solveNullList(rightFuzzyHostIp);
            return this;
        }

        public QueryBuilder hostIp(String hostIp){
            setHostIp(hostIp);
            return this;
        }

        public QueryBuilder hostIpList(String ... hostIp){
            this.hostIpList = solveNullList(hostIp);
            return this;
        }

        public QueryBuilder hostIpList(List<String> hostIp){
            this.hostIpList = hostIp;
            return this;
        }

        public QueryBuilder fetchHostIp(){
            setFetchFields("fetchFields","hostIp");
            return this;
        }

        public QueryBuilder excludeHostIp(){
            setFetchFields("excludeFields","hostIp");
            return this;
        }

        public QueryBuilder fuzzyDockerEnv (List<String> fuzzyDockerEnv){
            this.fuzzyDockerEnv = fuzzyDockerEnv;
            return this;
        }

        public QueryBuilder fuzzyDockerEnv (String ... fuzzyDockerEnv){
            this.fuzzyDockerEnv = solveNullList(fuzzyDockerEnv);
            return this;
        }

        public QueryBuilder rightFuzzyDockerEnv (List<String> rightFuzzyDockerEnv){
            this.rightFuzzyDockerEnv = rightFuzzyDockerEnv;
            return this;
        }

        public QueryBuilder rightFuzzyDockerEnv (String ... rightFuzzyDockerEnv){
            this.rightFuzzyDockerEnv = solveNullList(rightFuzzyDockerEnv);
            return this;
        }

        public QueryBuilder dockerEnv(String dockerEnv){
            setDockerEnv(dockerEnv);
            return this;
        }

        public QueryBuilder dockerEnvList(String ... dockerEnv){
            this.dockerEnvList = solveNullList(dockerEnv);
            return this;
        }

        public QueryBuilder dockerEnvList(List<String> dockerEnv){
            this.dockerEnvList = dockerEnv;
            return this;
        }

        public QueryBuilder fetchDockerEnv(){
            setFetchFields("fetchFields","dockerEnv");
            return this;
        }

        public QueryBuilder excludeDockerEnv(){
            setFetchFields("excludeFields","dockerEnv");
            return this;
        }

        public QueryBuilder deployModeBetWeen(Integer deployModeSt,Integer deployModeEd){
            this.deployModeSt = deployModeSt;
            this.deployModeEd = deployModeEd;
            return this;
        }

        public QueryBuilder deployModeGreaterEqThan(Integer deployModeSt){
            this.deployModeSt = deployModeSt;
            return this;
        }
        public QueryBuilder deployModeLessEqThan(Integer deployModeEd){
            this.deployModeEd = deployModeEd;
            return this;
        }


        public QueryBuilder deployMode(Integer deployMode){
            setDeployMode(deployMode);
            return this;
        }

        public QueryBuilder deployModeList(Integer ... deployMode){
            this.deployModeList = solveNullList(deployMode);
            return this;
        }

        public QueryBuilder deployModeList(List<Integer> deployMode){
            this.deployModeList = deployMode;
            return this;
        }

        public QueryBuilder fetchDeployMode(){
            setFetchFields("fetchFields","deployMode");
            return this;
        }

        public QueryBuilder excludeDeployMode(){
            setFetchFields("excludeFields","deployMode");
            return this;
        }

        public QueryBuilder fuzzyContainerName (List<String> fuzzyContainerName){
            this.fuzzyContainerName = fuzzyContainerName;
            return this;
        }

        public QueryBuilder fuzzyContainerName (String ... fuzzyContainerName){
            this.fuzzyContainerName = solveNullList(fuzzyContainerName);
            return this;
        }

        public QueryBuilder rightFuzzyContainerName (List<String> rightFuzzyContainerName){
            this.rightFuzzyContainerName = rightFuzzyContainerName;
            return this;
        }

        public QueryBuilder rightFuzzyContainerName (String ... rightFuzzyContainerName){
            this.rightFuzzyContainerName = solveNullList(rightFuzzyContainerName);
            return this;
        }

        public QueryBuilder containerName(String containerName){
            setContainerName(containerName);
            return this;
        }

        public QueryBuilder containerNameList(String ... containerName){
            this.containerNameList = solveNullList(containerName);
            return this;
        }

        public QueryBuilder containerNameList(List<String> containerName){
            this.containerNameList = containerName;
            return this;
        }

        public QueryBuilder fetchContainerName(){
            setFetchFields("fetchFields","containerName");
            return this;
        }

        public QueryBuilder excludeContainerName(){
            setFetchFields("excludeFields","containerName");
            return this;
        }

        public QueryBuilder fuzzyGitBranch (List<String> fuzzyGitBranch){
            this.fuzzyGitBranch = fuzzyGitBranch;
            return this;
        }

        public QueryBuilder fuzzyGitBranch (String ... fuzzyGitBranch){
            this.fuzzyGitBranch = solveNullList(fuzzyGitBranch);
            return this;
        }

        public QueryBuilder rightFuzzyGitBranch (List<String> rightFuzzyGitBranch){
            this.rightFuzzyGitBranch = rightFuzzyGitBranch;
            return this;
        }

        public QueryBuilder rightFuzzyGitBranch (String ... rightFuzzyGitBranch){
            this.rightFuzzyGitBranch = solveNullList(rightFuzzyGitBranch);
            return this;
        }

        public QueryBuilder gitBranch(String gitBranch){
            setGitBranch(gitBranch);
            return this;
        }

        public QueryBuilder gitBranchList(String ... gitBranch){
            this.gitBranchList = solveNullList(gitBranch);
            return this;
        }

        public QueryBuilder gitBranchList(List<String> gitBranch){
            this.gitBranchList = gitBranch;
            return this;
        }

        public QueryBuilder fetchGitBranch(){
            setFetchFields("fetchFields","gitBranch");
            return this;
        }

        public QueryBuilder excludeGitBranch(){
            setFetchFields("excludeFields","gitBranch");
            return this;
        }

        public QueryBuilder fuzzyNexusTargetUrl (List<String> fuzzyNexusTargetUrl){
            this.fuzzyNexusTargetUrl = fuzzyNexusTargetUrl;
            return this;
        }

        public QueryBuilder fuzzyNexusTargetUrl (String ... fuzzyNexusTargetUrl){
            this.fuzzyNexusTargetUrl = solveNullList(fuzzyNexusTargetUrl);
            return this;
        }

        public QueryBuilder rightFuzzyNexusTargetUrl (List<String> rightFuzzyNexusTargetUrl){
            this.rightFuzzyNexusTargetUrl = rightFuzzyNexusTargetUrl;
            return this;
        }

        public QueryBuilder rightFuzzyNexusTargetUrl (String ... rightFuzzyNexusTargetUrl){
            this.rightFuzzyNexusTargetUrl = solveNullList(rightFuzzyNexusTargetUrl);
            return this;
        }

        public QueryBuilder nexusTargetUrl(String nexusTargetUrl){
            setNexusTargetUrl(nexusTargetUrl);
            return this;
        }

        public QueryBuilder nexusTargetUrlList(String ... nexusTargetUrl){
            this.nexusTargetUrlList = solveNullList(nexusTargetUrl);
            return this;
        }

        public QueryBuilder nexusTargetUrlList(List<String> nexusTargetUrl){
            this.nexusTargetUrlList = nexusTargetUrl;
            return this;
        }

        public QueryBuilder fetchNexusTargetUrl(){
            setFetchFields("fetchFields","nexusTargetUrl");
            return this;
        }

        public QueryBuilder excludeNexusTargetUrl(){
            setFetchFields("excludeFields","nexusTargetUrl");
            return this;
        }

        public QueryBuilder fuzzyDockerImageName (List<String> fuzzyDockerImageName){
            this.fuzzyDockerImageName = fuzzyDockerImageName;
            return this;
        }

        public QueryBuilder fuzzyDockerImageName (String ... fuzzyDockerImageName){
            this.fuzzyDockerImageName = solveNullList(fuzzyDockerImageName);
            return this;
        }

        public QueryBuilder rightFuzzyDockerImageName (List<String> rightFuzzyDockerImageName){
            this.rightFuzzyDockerImageName = rightFuzzyDockerImageName;
            return this;
        }

        public QueryBuilder rightFuzzyDockerImageName (String ... rightFuzzyDockerImageName){
            this.rightFuzzyDockerImageName = solveNullList(rightFuzzyDockerImageName);
            return this;
        }

        public QueryBuilder dockerImageName(String dockerImageName){
            setDockerImageName(dockerImageName);
            return this;
        }

        public QueryBuilder dockerImageNameList(String ... dockerImageName){
            this.dockerImageNameList = solveNullList(dockerImageName);
            return this;
        }

        public QueryBuilder dockerImageNameList(List<String> dockerImageName){
            this.dockerImageNameList = dockerImageName;
            return this;
        }

        public QueryBuilder fetchDockerImageName(){
            setFetchFields("fetchFields","dockerImageName");
            return this;
        }

        public QueryBuilder excludeDockerImageName(){
            setFetchFields("excludeFields","dockerImageName");
            return this;
        }

        public QueryBuilder fuzzyEntrypoint (List<String> fuzzyEntrypoint){
            this.fuzzyEntrypoint = fuzzyEntrypoint;
            return this;
        }

        public QueryBuilder fuzzyEntrypoint (String ... fuzzyEntrypoint){
            this.fuzzyEntrypoint = solveNullList(fuzzyEntrypoint);
            return this;
        }

        public QueryBuilder rightFuzzyEntrypoint (List<String> rightFuzzyEntrypoint){
            this.rightFuzzyEntrypoint = rightFuzzyEntrypoint;
            return this;
        }

        public QueryBuilder rightFuzzyEntrypoint (String ... rightFuzzyEntrypoint){
            this.rightFuzzyEntrypoint = solveNullList(rightFuzzyEntrypoint);
            return this;
        }

        public QueryBuilder entrypoint(String entrypoint){
            setEntrypoint(entrypoint);
            return this;
        }

        public QueryBuilder entrypointList(String ... entrypoint){
            this.entrypointList = solveNullList(entrypoint);
            return this;
        }

        public QueryBuilder entrypointList(List<String> entrypoint){
            this.entrypointList = entrypoint;
            return this;
        }

        public QueryBuilder fetchEntrypoint(){
            setFetchFields("fetchFields","entrypoint");
            return this;
        }

        public QueryBuilder excludeEntrypoint(){
            setFetchFields("excludeFields","entrypoint");
            return this;
        }

        public QueryBuilder fuzzyDockerMount (List<String> fuzzyDockerMount){
            this.fuzzyDockerMount = fuzzyDockerMount;
            return this;
        }

        public QueryBuilder fuzzyDockerMount (String ... fuzzyDockerMount){
            this.fuzzyDockerMount = solveNullList(fuzzyDockerMount);
            return this;
        }

        public QueryBuilder rightFuzzyDockerMount (List<String> rightFuzzyDockerMount){
            this.rightFuzzyDockerMount = rightFuzzyDockerMount;
            return this;
        }

        public QueryBuilder rightFuzzyDockerMount (String ... rightFuzzyDockerMount){
            this.rightFuzzyDockerMount = solveNullList(rightFuzzyDockerMount);
            return this;
        }

        public QueryBuilder dockerMount(String dockerMount){
            setDockerMount(dockerMount);
            return this;
        }

        public QueryBuilder dockerMountList(String ... dockerMount){
            this.dockerMountList = solveNullList(dockerMount);
            return this;
        }

        public QueryBuilder dockerMountList(List<String> dockerMount){
            this.dockerMountList = dockerMount;
            return this;
        }

        public QueryBuilder fetchDockerMount(){
            setFetchFields("fetchFields","dockerMount");
            return this;
        }

        public QueryBuilder excludeDockerMount(){
            setFetchFields("excludeFields","dockerMount");
            return this;
        }

        public QueryBuilder fuzzyDockerLink (List<String> fuzzyDockerLink){
            this.fuzzyDockerLink = fuzzyDockerLink;
            return this;
        }

        public QueryBuilder fuzzyDockerLink (String ... fuzzyDockerLink){
            this.fuzzyDockerLink = solveNullList(fuzzyDockerLink);
            return this;
        }

        public QueryBuilder rightFuzzyDockerLink (List<String> rightFuzzyDockerLink){
            this.rightFuzzyDockerLink = rightFuzzyDockerLink;
            return this;
        }

        public QueryBuilder rightFuzzyDockerLink (String ... rightFuzzyDockerLink){
            this.rightFuzzyDockerLink = solveNullList(rightFuzzyDockerLink);
            return this;
        }

        public QueryBuilder dockerLink(String dockerLink){
            setDockerLink(dockerLink);
            return this;
        }

        public QueryBuilder dockerLinkList(String ... dockerLink){
            this.dockerLinkList = solveNullList(dockerLink);
            return this;
        }

        public QueryBuilder dockerLinkList(List<String> dockerLink){
            this.dockerLinkList = dockerLink;
            return this;
        }

        public QueryBuilder fetchDockerLink(){
            setFetchFields("fetchFields","dockerLink");
            return this;
        }

        public QueryBuilder excludeDockerLink(){
            setFetchFields("excludeFields","dockerLink");
            return this;
        }

        public QueryBuilder isValidBetWeen(Integer isValidSt,Integer isValidEd){
            this.isValidSt = isValidSt;
            this.isValidEd = isValidEd;
            return this;
        }

        public QueryBuilder isValidGreaterEqThan(Integer isValidSt){
            this.isValidSt = isValidSt;
            return this;
        }
        public QueryBuilder isValidLessEqThan(Integer isValidEd){
            this.isValidEd = isValidEd;
            return this;
        }


        public QueryBuilder isValid(Integer isValid){
            setIsValid(isValid);
            return this;
        }

        public QueryBuilder isValidList(Integer ... isValid){
            this.isValidList = solveNullList(isValid);
            return this;
        }

        public QueryBuilder isValidList(List<Integer> isValid){
            this.isValidList = isValid;
            return this;
        }

        public QueryBuilder fetchIsValid(){
            setFetchFields("fetchFields","isValid");
            return this;
        }

        public QueryBuilder excludeIsValid(){
            setFetchFields("excludeFields","isValid");
            return this;
        }

        public QueryBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public QueryBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public QueryBuilder isDelete(Integer isDelete){
            setIsDelete(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public QueryBuilder fetchIsDelete(){
            setFetchFields("fetchFields","isDelete");
            return this;
        }

        public QueryBuilder excludeIsDelete(){
            setFetchFields("excludeFields","isDelete");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder fuzzyCreateUser (List<String> fuzzyCreateUser){
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public QueryBuilder fuzzyCreateUser (String ... fuzzyCreateUser){
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser (List<String> rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public QueryBuilder rightFuzzyCreateUser (String ... rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public QueryBuilder createUser(String createUser){
            setCreateUser(createUser);
            return this;
        }

        public QueryBuilder createUserList(String ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public QueryBuilder createUserList(List<String> createUser){
            this.createUserList = createUser;
            return this;
        }

        public QueryBuilder fetchCreateUser(){
            setFetchFields("fetchFields","createUser");
            return this;
        }

        public QueryBuilder excludeCreateUser(){
            setFetchFields("excludeFields","createUser");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }

        public QueryBuilder fuzzyUpdateUser (List<String> fuzzyUpdateUser){
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public QueryBuilder fuzzyUpdateUser (String ... fuzzyUpdateUser){
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser (List<String> rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUser (String ... rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public QueryBuilder updateUser(String updateUser){
            setUpdateUser(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(String ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public QueryBuilder updateUserList(List<String> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        public QueryBuilder fetchUpdateUser(){
            setFetchFields("fetchFields","updateUser");
            return this;
        }

        public QueryBuilder excludeUpdateUser(){
            setFetchFields("excludeFields","updateUser");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ProjectDeployInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> projectIdList;

        public List<String> getProjectIdList(){return this.projectIdList;}


        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId(){return this.fuzzyProjectId;}

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId(){return this.rightFuzzyProjectId;}
        private List<String> hostIpList;

        public List<String> getHostIpList(){return this.hostIpList;}


        private List<String> fuzzyHostIp;

        public List<String> getFuzzyHostIp(){return this.fuzzyHostIp;}

        private List<String> rightFuzzyHostIp;

        public List<String> getRightFuzzyHostIp(){return this.rightFuzzyHostIp;}
        private List<String> dockerEnvList;

        public List<String> getDockerEnvList(){return this.dockerEnvList;}


        private List<String> fuzzyDockerEnv;

        public List<String> getFuzzyDockerEnv(){return this.fuzzyDockerEnv;}

        private List<String> rightFuzzyDockerEnv;

        public List<String> getRightFuzzyDockerEnv(){return this.rightFuzzyDockerEnv;}
        private List<Integer> deployModeList;

        public List<Integer> getDeployModeList(){return this.deployModeList;}

        private Integer deployModeSt;

        private Integer deployModeEd;

        public Integer getDeployModeSt(){return this.deployModeSt;}

        public Integer getDeployModeEd(){return this.deployModeEd;}

        private List<String> containerNameList;

        public List<String> getContainerNameList(){return this.containerNameList;}


        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName(){return this.fuzzyContainerName;}

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName(){return this.rightFuzzyContainerName;}
        private List<String> gitBranchList;

        public List<String> getGitBranchList(){return this.gitBranchList;}


        private List<String> fuzzyGitBranch;

        public List<String> getFuzzyGitBranch(){return this.fuzzyGitBranch;}

        private List<String> rightFuzzyGitBranch;

        public List<String> getRightFuzzyGitBranch(){return this.rightFuzzyGitBranch;}
        private List<String> nexusTargetUrlList;

        public List<String> getNexusTargetUrlList(){return this.nexusTargetUrlList;}


        private List<String> fuzzyNexusTargetUrl;

        public List<String> getFuzzyNexusTargetUrl(){return this.fuzzyNexusTargetUrl;}

        private List<String> rightFuzzyNexusTargetUrl;

        public List<String> getRightFuzzyNexusTargetUrl(){return this.rightFuzzyNexusTargetUrl;}
        private List<String> dockerImageNameList;

        public List<String> getDockerImageNameList(){return this.dockerImageNameList;}


        private List<String> fuzzyDockerImageName;

        public List<String> getFuzzyDockerImageName(){return this.fuzzyDockerImageName;}

        private List<String> rightFuzzyDockerImageName;

        public List<String> getRightFuzzyDockerImageName(){return this.rightFuzzyDockerImageName;}
        private List<String> entrypointList;

        public List<String> getEntrypointList(){return this.entrypointList;}


        private List<String> fuzzyEntrypoint;

        public List<String> getFuzzyEntrypoint(){return this.fuzzyEntrypoint;}

        private List<String> rightFuzzyEntrypoint;

        public List<String> getRightFuzzyEntrypoint(){return this.rightFuzzyEntrypoint;}
        private List<String> dockerMountList;

        public List<String> getDockerMountList(){return this.dockerMountList;}


        private List<String> fuzzyDockerMount;

        public List<String> getFuzzyDockerMount(){return this.fuzzyDockerMount;}

        private List<String> rightFuzzyDockerMount;

        public List<String> getRightFuzzyDockerMount(){return this.rightFuzzyDockerMount;}
        private List<String> dockerLinkList;

        public List<String> getDockerLinkList(){return this.dockerLinkList;}


        private List<String> fuzzyDockerLink;

        public List<String> getFuzzyDockerLink(){return this.fuzzyDockerLink;}

        private List<String> rightFuzzyDockerLink;

        public List<String> getRightFuzzyDockerLink(){return this.rightFuzzyDockerLink;}
        private List<Integer> isValidList;

        public List<Integer> getIsValidList(){return this.isValidList;}

        private Integer isValidSt;

        private Integer isValidEd;

        public Integer getIsValidSt(){return this.isValidSt;}

        public Integer getIsValidEd(){return this.isValidEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> createUserList;

        public List<String> getCreateUserList(){return this.createUserList;}


        private List<String> fuzzyCreateUser;

        public List<String> getFuzzyCreateUser(){return this.fuzzyCreateUser;}

        private List<String> rightFuzzyCreateUser;

        public List<String> getRightFuzzyCreateUser(){return this.rightFuzzyCreateUser;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private List<String> updateUserList;

        public List<String> getUpdateUserList(){return this.updateUserList;}


        private List<String> fuzzyUpdateUser;

        public List<String> getFuzzyUpdateUser(){return this.fuzzyUpdateUser;}

        private List<String> rightFuzzyUpdateUser;

        public List<String> getRightFuzzyUpdateUser(){return this.rightFuzzyUpdateUser;}

        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyProjectId (List<String> fuzzyProjectId){
            this.fuzzyProjectId = fuzzyProjectId;
            return this;
        }

        public ConditionBuilder fuzzyProjectId (String ... fuzzyProjectId){
            this.fuzzyProjectId = solveNullList(fuzzyProjectId);
            return this;
        }

        public ConditionBuilder rightFuzzyProjectId (List<String> rightFuzzyProjectId){
            this.rightFuzzyProjectId = rightFuzzyProjectId;
            return this;
        }

        public ConditionBuilder rightFuzzyProjectId (String ... rightFuzzyProjectId){
            this.rightFuzzyProjectId = solveNullList(rightFuzzyProjectId);
            return this;
        }

        public ConditionBuilder projectIdList(String ... projectId){
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public ConditionBuilder projectIdList(List<String> projectId){
            this.projectIdList = projectId;
            return this;
        }

        public ConditionBuilder fuzzyHostIp (List<String> fuzzyHostIp){
            this.fuzzyHostIp = fuzzyHostIp;
            return this;
        }

        public ConditionBuilder fuzzyHostIp (String ... fuzzyHostIp){
            this.fuzzyHostIp = solveNullList(fuzzyHostIp);
            return this;
        }

        public ConditionBuilder rightFuzzyHostIp (List<String> rightFuzzyHostIp){
            this.rightFuzzyHostIp = rightFuzzyHostIp;
            return this;
        }

        public ConditionBuilder rightFuzzyHostIp (String ... rightFuzzyHostIp){
            this.rightFuzzyHostIp = solveNullList(rightFuzzyHostIp);
            return this;
        }

        public ConditionBuilder hostIpList(String ... hostIp){
            this.hostIpList = solveNullList(hostIp);
            return this;
        }

        public ConditionBuilder hostIpList(List<String> hostIp){
            this.hostIpList = hostIp;
            return this;
        }

        public ConditionBuilder fuzzyDockerEnv (List<String> fuzzyDockerEnv){
            this.fuzzyDockerEnv = fuzzyDockerEnv;
            return this;
        }

        public ConditionBuilder fuzzyDockerEnv (String ... fuzzyDockerEnv){
            this.fuzzyDockerEnv = solveNullList(fuzzyDockerEnv);
            return this;
        }

        public ConditionBuilder rightFuzzyDockerEnv (List<String> rightFuzzyDockerEnv){
            this.rightFuzzyDockerEnv = rightFuzzyDockerEnv;
            return this;
        }

        public ConditionBuilder rightFuzzyDockerEnv (String ... rightFuzzyDockerEnv){
            this.rightFuzzyDockerEnv = solveNullList(rightFuzzyDockerEnv);
            return this;
        }

        public ConditionBuilder dockerEnvList(String ... dockerEnv){
            this.dockerEnvList = solveNullList(dockerEnv);
            return this;
        }

        public ConditionBuilder dockerEnvList(List<String> dockerEnv){
            this.dockerEnvList = dockerEnv;
            return this;
        }

        public ConditionBuilder deployModeBetWeen(Integer deployModeSt,Integer deployModeEd){
            this.deployModeSt = deployModeSt;
            this.deployModeEd = deployModeEd;
            return this;
        }

        public ConditionBuilder deployModeGreaterEqThan(Integer deployModeSt){
            this.deployModeSt = deployModeSt;
            return this;
        }
        public ConditionBuilder deployModeLessEqThan(Integer deployModeEd){
            this.deployModeEd = deployModeEd;
            return this;
        }


        public ConditionBuilder deployModeList(Integer ... deployMode){
            this.deployModeList = solveNullList(deployMode);
            return this;
        }

        public ConditionBuilder deployModeList(List<Integer> deployMode){
            this.deployModeList = deployMode;
            return this;
        }

        public ConditionBuilder fuzzyContainerName (List<String> fuzzyContainerName){
            this.fuzzyContainerName = fuzzyContainerName;
            return this;
        }

        public ConditionBuilder fuzzyContainerName (String ... fuzzyContainerName){
            this.fuzzyContainerName = solveNullList(fuzzyContainerName);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerName (List<String> rightFuzzyContainerName){
            this.rightFuzzyContainerName = rightFuzzyContainerName;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerName (String ... rightFuzzyContainerName){
            this.rightFuzzyContainerName = solveNullList(rightFuzzyContainerName);
            return this;
        }

        public ConditionBuilder containerNameList(String ... containerName){
            this.containerNameList = solveNullList(containerName);
            return this;
        }

        public ConditionBuilder containerNameList(List<String> containerName){
            this.containerNameList = containerName;
            return this;
        }

        public ConditionBuilder fuzzyGitBranch (List<String> fuzzyGitBranch){
            this.fuzzyGitBranch = fuzzyGitBranch;
            return this;
        }

        public ConditionBuilder fuzzyGitBranch (String ... fuzzyGitBranch){
            this.fuzzyGitBranch = solveNullList(fuzzyGitBranch);
            return this;
        }

        public ConditionBuilder rightFuzzyGitBranch (List<String> rightFuzzyGitBranch){
            this.rightFuzzyGitBranch = rightFuzzyGitBranch;
            return this;
        }

        public ConditionBuilder rightFuzzyGitBranch (String ... rightFuzzyGitBranch){
            this.rightFuzzyGitBranch = solveNullList(rightFuzzyGitBranch);
            return this;
        }

        public ConditionBuilder gitBranchList(String ... gitBranch){
            this.gitBranchList = solveNullList(gitBranch);
            return this;
        }

        public ConditionBuilder gitBranchList(List<String> gitBranch){
            this.gitBranchList = gitBranch;
            return this;
        }

        public ConditionBuilder fuzzyNexusTargetUrl (List<String> fuzzyNexusTargetUrl){
            this.fuzzyNexusTargetUrl = fuzzyNexusTargetUrl;
            return this;
        }

        public ConditionBuilder fuzzyNexusTargetUrl (String ... fuzzyNexusTargetUrl){
            this.fuzzyNexusTargetUrl = solveNullList(fuzzyNexusTargetUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyNexusTargetUrl (List<String> rightFuzzyNexusTargetUrl){
            this.rightFuzzyNexusTargetUrl = rightFuzzyNexusTargetUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyNexusTargetUrl (String ... rightFuzzyNexusTargetUrl){
            this.rightFuzzyNexusTargetUrl = solveNullList(rightFuzzyNexusTargetUrl);
            return this;
        }

        public ConditionBuilder nexusTargetUrlList(String ... nexusTargetUrl){
            this.nexusTargetUrlList = solveNullList(nexusTargetUrl);
            return this;
        }

        public ConditionBuilder nexusTargetUrlList(List<String> nexusTargetUrl){
            this.nexusTargetUrlList = nexusTargetUrl;
            return this;
        }

        public ConditionBuilder fuzzyDockerImageName (List<String> fuzzyDockerImageName){
            this.fuzzyDockerImageName = fuzzyDockerImageName;
            return this;
        }

        public ConditionBuilder fuzzyDockerImageName (String ... fuzzyDockerImageName){
            this.fuzzyDockerImageName = solveNullList(fuzzyDockerImageName);
            return this;
        }

        public ConditionBuilder rightFuzzyDockerImageName (List<String> rightFuzzyDockerImageName){
            this.rightFuzzyDockerImageName = rightFuzzyDockerImageName;
            return this;
        }

        public ConditionBuilder rightFuzzyDockerImageName (String ... rightFuzzyDockerImageName){
            this.rightFuzzyDockerImageName = solveNullList(rightFuzzyDockerImageName);
            return this;
        }

        public ConditionBuilder dockerImageNameList(String ... dockerImageName){
            this.dockerImageNameList = solveNullList(dockerImageName);
            return this;
        }

        public ConditionBuilder dockerImageNameList(List<String> dockerImageName){
            this.dockerImageNameList = dockerImageName;
            return this;
        }

        public ConditionBuilder fuzzyEntrypoint (List<String> fuzzyEntrypoint){
            this.fuzzyEntrypoint = fuzzyEntrypoint;
            return this;
        }

        public ConditionBuilder fuzzyEntrypoint (String ... fuzzyEntrypoint){
            this.fuzzyEntrypoint = solveNullList(fuzzyEntrypoint);
            return this;
        }

        public ConditionBuilder rightFuzzyEntrypoint (List<String> rightFuzzyEntrypoint){
            this.rightFuzzyEntrypoint = rightFuzzyEntrypoint;
            return this;
        }

        public ConditionBuilder rightFuzzyEntrypoint (String ... rightFuzzyEntrypoint){
            this.rightFuzzyEntrypoint = solveNullList(rightFuzzyEntrypoint);
            return this;
        }

        public ConditionBuilder entrypointList(String ... entrypoint){
            this.entrypointList = solveNullList(entrypoint);
            return this;
        }

        public ConditionBuilder entrypointList(List<String> entrypoint){
            this.entrypointList = entrypoint;
            return this;
        }

        public ConditionBuilder fuzzyDockerMount (List<String> fuzzyDockerMount){
            this.fuzzyDockerMount = fuzzyDockerMount;
            return this;
        }

        public ConditionBuilder fuzzyDockerMount (String ... fuzzyDockerMount){
            this.fuzzyDockerMount = solveNullList(fuzzyDockerMount);
            return this;
        }

        public ConditionBuilder rightFuzzyDockerMount (List<String> rightFuzzyDockerMount){
            this.rightFuzzyDockerMount = rightFuzzyDockerMount;
            return this;
        }

        public ConditionBuilder rightFuzzyDockerMount (String ... rightFuzzyDockerMount){
            this.rightFuzzyDockerMount = solveNullList(rightFuzzyDockerMount);
            return this;
        }

        public ConditionBuilder dockerMountList(String ... dockerMount){
            this.dockerMountList = solveNullList(dockerMount);
            return this;
        }

        public ConditionBuilder dockerMountList(List<String> dockerMount){
            this.dockerMountList = dockerMount;
            return this;
        }

        public ConditionBuilder fuzzyDockerLink (List<String> fuzzyDockerLink){
            this.fuzzyDockerLink = fuzzyDockerLink;
            return this;
        }

        public ConditionBuilder fuzzyDockerLink (String ... fuzzyDockerLink){
            this.fuzzyDockerLink = solveNullList(fuzzyDockerLink);
            return this;
        }

        public ConditionBuilder rightFuzzyDockerLink (List<String> rightFuzzyDockerLink){
            this.rightFuzzyDockerLink = rightFuzzyDockerLink;
            return this;
        }

        public ConditionBuilder rightFuzzyDockerLink (String ... rightFuzzyDockerLink){
            this.rightFuzzyDockerLink = solveNullList(rightFuzzyDockerLink);
            return this;
        }

        public ConditionBuilder dockerLinkList(String ... dockerLink){
            this.dockerLinkList = solveNullList(dockerLink);
            return this;
        }

        public ConditionBuilder dockerLinkList(List<String> dockerLink){
            this.dockerLinkList = dockerLink;
            return this;
        }

        public ConditionBuilder isValidBetWeen(Integer isValidSt,Integer isValidEd){
            this.isValidSt = isValidSt;
            this.isValidEd = isValidEd;
            return this;
        }

        public ConditionBuilder isValidGreaterEqThan(Integer isValidSt){
            this.isValidSt = isValidSt;
            return this;
        }
        public ConditionBuilder isValidLessEqThan(Integer isValidEd){
            this.isValidEd = isValidEd;
            return this;
        }


        public ConditionBuilder isValidList(Integer ... isValid){
            this.isValidList = solveNullList(isValid);
            return this;
        }

        public ConditionBuilder isValidList(List<Integer> isValid){
            this.isValidList = isValid;
            return this;
        }

        public ConditionBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public ConditionBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public ConditionBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public ConditionBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser (List<String> fuzzyCreateUser){
            this.fuzzyCreateUser = fuzzyCreateUser;
            return this;
        }

        public ConditionBuilder fuzzyCreateUser (String ... fuzzyCreateUser){
            this.fuzzyCreateUser = solveNullList(fuzzyCreateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser (List<String> rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = rightFuzzyCreateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateUser (String ... rightFuzzyCreateUser){
            this.rightFuzzyCreateUser = solveNullList(rightFuzzyCreateUser);
            return this;
        }

        public ConditionBuilder createUserList(String ... createUser){
            this.createUserList = solveNullList(createUser);
            return this;
        }

        public ConditionBuilder createUserList(List<String> createUser){
            this.createUserList = createUser;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser (List<String> fuzzyUpdateUser){
            this.fuzzyUpdateUser = fuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUser (String ... fuzzyUpdateUser){
            this.fuzzyUpdateUser = solveNullList(fuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser (List<String> rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = rightFuzzyUpdateUser;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUser (String ... rightFuzzyUpdateUser){
            this.rightFuzzyUpdateUser = solveNullList(rightFuzzyUpdateUser);
            return this;
        }

        public ConditionBuilder updateUserList(String ... updateUser){
            this.updateUserList = solveNullList(updateUser);
            return this;
        }

        public ConditionBuilder updateUserList(List<String> updateUser){
            this.updateUserList = updateUser;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ProjectDeployInfo obj;

        public Builder(){
            this.obj = new ProjectDeployInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder projectId(String projectId){
            this.obj.setProjectId(projectId);
            return this;
        }
        public Builder hostIp(String hostIp){
            this.obj.setHostIp(hostIp);
            return this;
        }
        public Builder dockerEnv(String dockerEnv){
            this.obj.setDockerEnv(dockerEnv);
            return this;
        }
        public Builder deployMode(Integer deployMode){
            this.obj.setDeployMode(deployMode);
            return this;
        }
        public Builder containerName(String containerName){
            this.obj.setContainerName(containerName);
            return this;
        }
        public Builder gitBranch(String gitBranch){
            this.obj.setGitBranch(gitBranch);
            return this;
        }
        public Builder nexusTargetUrl(String nexusTargetUrl){
            this.obj.setNexusTargetUrl(nexusTargetUrl);
            return this;
        }
        public Builder dockerImageName(String dockerImageName){
            this.obj.setDockerImageName(dockerImageName);
            return this;
        }
        public Builder entrypoint(String entrypoint){
            this.obj.setEntrypoint(entrypoint);
            return this;
        }
        public Builder dockerMount(String dockerMount){
            this.obj.setDockerMount(dockerMount);
            return this;
        }
        public Builder dockerLink(String dockerLink){
            this.obj.setDockerLink(dockerLink);
            return this;
        }
        public Builder isValid(Integer isValid){
            this.obj.setIsValid(isValid);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder createUser(String createUser){
            this.obj.setCreateUser(createUser);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public Builder updateUser(String updateUser){
            this.obj.setUpdateUser(updateUser);
            return this;
        }
        public ProjectDeployInfo build(){return obj;}
    }

}
