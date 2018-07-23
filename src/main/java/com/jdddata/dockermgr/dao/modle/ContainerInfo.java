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
public class ContainerInfo implements Serializable {

    private static final long serialVersionUID = 1532324390946L;


    /**
    * 主键
    * 自增ID
    * isNullAble:0
    */
    private Long id;

    /**
    * 部署Id信息
    * isNullAble:1
    */
    private Long deployId;

    /**
    * 容器ID
    * isNullAble:1
    */
    private String containerId;

    /**
    * 容器名称
    * isNullAble:1
    */
    private String containerName;

    /**
    * 镜像名称
    * isNullAble:1
    */
    private String imageName;

    /**
    * 镜像tag
    * isNullAble:1
    */
    private String imageTag;

    /**
    * 镜像ID
    * isNullAble:1
    */
    private String imageId;

    /**
    * 执行命令
    * isNullAble:1
    */
    private String command;

    /**
    * 容器创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime containerCreateTime;

    /**
    * 容器开放端口情况
    * isNullAble:1
    */
    private String contianerPorts;

    /**
    * 运行情况
    * isNullAble:1
    */
    private String state;

    /**
    * 运行情况
    * isNullAble:1
    */
    private String status;

    /**
    * 网络类型
    * isNullAble:1
    */
    private String networkMode;

    /**
    * 是否失效
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


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setDeployId(Long deployId){this.deployId = deployId;}

    public Long getDeployId(){return this.deployId;}

    public void setContainerId(String containerId){this.containerId = containerId;}

    public String getContainerId(){return this.containerId;}

    public void setContainerName(String containerName){this.containerName = containerName;}

    public String getContainerName(){return this.containerName;}

    public void setImageName(String imageName){this.imageName = imageName;}

    public String getImageName(){return this.imageName;}

    public void setImageTag(String imageTag){this.imageTag = imageTag;}

    public String getImageTag(){return this.imageTag;}

    public void setImageId(String imageId){this.imageId = imageId;}

    public String getImageId(){return this.imageId;}

    public void setCommand(String command){this.command = command;}

    public String getCommand(){return this.command;}

    public void setContainerCreateTime(java.time.LocalDateTime containerCreateTime){this.containerCreateTime = containerCreateTime;}

    public java.time.LocalDateTime getContainerCreateTime(){return this.containerCreateTime;}

    public void setContianerPorts(String contianerPorts){this.contianerPorts = contianerPorts;}

    public String getContianerPorts(){return this.contianerPorts;}

    public void setState(String state){this.state = state;}

    public String getState(){return this.state;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return this.status;}

    public void setNetworkMode(String networkMode){this.networkMode = networkMode;}

    public String getNetworkMode(){return this.networkMode;}

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
        return "ContainerInfo{" +
                "id='" + id + '\'' +
                "deployId='" + deployId + '\'' +
                "containerId='" + containerId + '\'' +
                "containerName='" + containerName + '\'' +
                "imageName='" + imageName + '\'' +
                "imageTag='" + imageTag + '\'' +
                "imageId='" + imageId + '\'' +
                "command='" + command + '\'' +
                "containerCreateTime='" + containerCreateTime + '\'' +
                "contianerPorts='" + contianerPorts + '\'' +
                "state='" + state + '\'' +
                "status='" + status + '\'' +
                "networkMode='" + networkMode + '\'' +
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

        private ContainerInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(ContainerInfo set){
            this.set = set;
            return this;
        }

        public ContainerInfo getSet(){
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

    public static class QueryBuilder extends ContainerInfo{
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

        private List<Long> deployIdList;

        public List<Long> getDeployIdList(){return this.deployIdList;}

        private Long deployIdSt;

        private Long deployIdEd;

        public Long getDeployIdSt(){return this.deployIdSt;}

        public Long getDeployIdEd(){return this.deployIdEd;}

        private List<String> containerIdList;

        public List<String> getContainerIdList(){return this.containerIdList;}


        private List<String> fuzzyContainerId;

        public List<String> getFuzzyContainerId(){return this.fuzzyContainerId;}

        private List<String> rightFuzzyContainerId;

        public List<String> getRightFuzzyContainerId(){return this.rightFuzzyContainerId;}
        private List<String> containerNameList;

        public List<String> getContainerNameList(){return this.containerNameList;}


        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName(){return this.fuzzyContainerName;}

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName(){return this.rightFuzzyContainerName;}
        private List<String> imageNameList;

        public List<String> getImageNameList(){return this.imageNameList;}


        private List<String> fuzzyImageName;

        public List<String> getFuzzyImageName(){return this.fuzzyImageName;}

        private List<String> rightFuzzyImageName;

        public List<String> getRightFuzzyImageName(){return this.rightFuzzyImageName;}
        private List<String> imageTagList;

        public List<String> getImageTagList(){return this.imageTagList;}


        private List<String> fuzzyImageTag;

        public List<String> getFuzzyImageTag(){return this.fuzzyImageTag;}

        private List<String> rightFuzzyImageTag;

        public List<String> getRightFuzzyImageTag(){return this.rightFuzzyImageTag;}
        private List<String> imageIdList;

        public List<String> getImageIdList(){return this.imageIdList;}


        private List<String> fuzzyImageId;

        public List<String> getFuzzyImageId(){return this.fuzzyImageId;}

        private List<String> rightFuzzyImageId;

        public List<String> getRightFuzzyImageId(){return this.rightFuzzyImageId;}
        private List<String> commandList;

        public List<String> getCommandList(){return this.commandList;}


        private List<String> fuzzyCommand;

        public List<String> getFuzzyCommand(){return this.fuzzyCommand;}

        private List<String> rightFuzzyCommand;

        public List<String> getRightFuzzyCommand(){return this.rightFuzzyCommand;}
        private List<java.time.LocalDateTime> containerCreateTimeList;

        public List<java.time.LocalDateTime> getContainerCreateTimeList(){return this.containerCreateTimeList;}

        private java.time.LocalDateTime containerCreateTimeSt;

        private java.time.LocalDateTime containerCreateTimeEd;

        public java.time.LocalDateTime getContainerCreateTimeSt(){return this.containerCreateTimeSt;}

        public java.time.LocalDateTime getContainerCreateTimeEd(){return this.containerCreateTimeEd;}

        private List<String> contianerPortsList;

        public List<String> getContianerPortsList(){return this.contianerPortsList;}


        private List<String> fuzzyContianerPorts;

        public List<String> getFuzzyContianerPorts(){return this.fuzzyContianerPorts;}

        private List<String> rightFuzzyContianerPorts;

        public List<String> getRightFuzzyContianerPorts(){return this.rightFuzzyContianerPorts;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<String> networkModeList;

        public List<String> getNetworkModeList(){return this.networkModeList;}


        private List<String> fuzzyNetworkMode;

        public List<String> getFuzzyNetworkMode(){return this.fuzzyNetworkMode;}

        private List<String> rightFuzzyNetworkMode;

        public List<String> getRightFuzzyNetworkMode(){return this.rightFuzzyNetworkMode;}
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

        public QueryBuilder deployIdBetWeen(Long deployIdSt,Long deployIdEd){
            this.deployIdSt = deployIdSt;
            this.deployIdEd = deployIdEd;
            return this;
        }

        public QueryBuilder deployIdGreaterEqThan(Long deployIdSt){
            this.deployIdSt = deployIdSt;
            return this;
        }
        public QueryBuilder deployIdLessEqThan(Long deployIdEd){
            this.deployIdEd = deployIdEd;
            return this;
        }


        public QueryBuilder deployId(Long deployId){
            setDeployId(deployId);
            return this;
        }

        public QueryBuilder deployIdList(Long ... deployId){
            this.deployIdList = solveNullList(deployId);
            return this;
        }

        public QueryBuilder deployIdList(List<Long> deployId){
            this.deployIdList = deployId;
            return this;
        }

        public QueryBuilder fetchDeployId(){
            setFetchFields("fetchFields","deployId");
            return this;
        }

        public QueryBuilder excludeDeployId(){
            setFetchFields("excludeFields","deployId");
            return this;
        }

        public QueryBuilder fuzzyContainerId (List<String> fuzzyContainerId){
            this.fuzzyContainerId = fuzzyContainerId;
            return this;
        }

        public QueryBuilder fuzzyContainerId (String ... fuzzyContainerId){
            this.fuzzyContainerId = solveNullList(fuzzyContainerId);
            return this;
        }

        public QueryBuilder rightFuzzyContainerId (List<String> rightFuzzyContainerId){
            this.rightFuzzyContainerId = rightFuzzyContainerId;
            return this;
        }

        public QueryBuilder rightFuzzyContainerId (String ... rightFuzzyContainerId){
            this.rightFuzzyContainerId = solveNullList(rightFuzzyContainerId);
            return this;
        }

        public QueryBuilder containerId(String containerId){
            setContainerId(containerId);
            return this;
        }

        public QueryBuilder containerIdList(String ... containerId){
            this.containerIdList = solveNullList(containerId);
            return this;
        }

        public QueryBuilder containerIdList(List<String> containerId){
            this.containerIdList = containerId;
            return this;
        }

        public QueryBuilder fetchContainerId(){
            setFetchFields("fetchFields","containerId");
            return this;
        }

        public QueryBuilder excludeContainerId(){
            setFetchFields("excludeFields","containerId");
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

        public QueryBuilder fuzzyImageName (List<String> fuzzyImageName){
            this.fuzzyImageName = fuzzyImageName;
            return this;
        }

        public QueryBuilder fuzzyImageName (String ... fuzzyImageName){
            this.fuzzyImageName = solveNullList(fuzzyImageName);
            return this;
        }

        public QueryBuilder rightFuzzyImageName (List<String> rightFuzzyImageName){
            this.rightFuzzyImageName = rightFuzzyImageName;
            return this;
        }

        public QueryBuilder rightFuzzyImageName (String ... rightFuzzyImageName){
            this.rightFuzzyImageName = solveNullList(rightFuzzyImageName);
            return this;
        }

        public QueryBuilder imageName(String imageName){
            setImageName(imageName);
            return this;
        }

        public QueryBuilder imageNameList(String ... imageName){
            this.imageNameList = solveNullList(imageName);
            return this;
        }

        public QueryBuilder imageNameList(List<String> imageName){
            this.imageNameList = imageName;
            return this;
        }

        public QueryBuilder fetchImageName(){
            setFetchFields("fetchFields","imageName");
            return this;
        }

        public QueryBuilder excludeImageName(){
            setFetchFields("excludeFields","imageName");
            return this;
        }

        public QueryBuilder fuzzyImageTag (List<String> fuzzyImageTag){
            this.fuzzyImageTag = fuzzyImageTag;
            return this;
        }

        public QueryBuilder fuzzyImageTag (String ... fuzzyImageTag){
            this.fuzzyImageTag = solveNullList(fuzzyImageTag);
            return this;
        }

        public QueryBuilder rightFuzzyImageTag (List<String> rightFuzzyImageTag){
            this.rightFuzzyImageTag = rightFuzzyImageTag;
            return this;
        }

        public QueryBuilder rightFuzzyImageTag (String ... rightFuzzyImageTag){
            this.rightFuzzyImageTag = solveNullList(rightFuzzyImageTag);
            return this;
        }

        public QueryBuilder imageTag(String imageTag){
            setImageTag(imageTag);
            return this;
        }

        public QueryBuilder imageTagList(String ... imageTag){
            this.imageTagList = solveNullList(imageTag);
            return this;
        }

        public QueryBuilder imageTagList(List<String> imageTag){
            this.imageTagList = imageTag;
            return this;
        }

        public QueryBuilder fetchImageTag(){
            setFetchFields("fetchFields","imageTag");
            return this;
        }

        public QueryBuilder excludeImageTag(){
            setFetchFields("excludeFields","imageTag");
            return this;
        }

        public QueryBuilder fuzzyImageId (List<String> fuzzyImageId){
            this.fuzzyImageId = fuzzyImageId;
            return this;
        }

        public QueryBuilder fuzzyImageId (String ... fuzzyImageId){
            this.fuzzyImageId = solveNullList(fuzzyImageId);
            return this;
        }

        public QueryBuilder rightFuzzyImageId (List<String> rightFuzzyImageId){
            this.rightFuzzyImageId = rightFuzzyImageId;
            return this;
        }

        public QueryBuilder rightFuzzyImageId (String ... rightFuzzyImageId){
            this.rightFuzzyImageId = solveNullList(rightFuzzyImageId);
            return this;
        }

        public QueryBuilder imageId(String imageId){
            setImageId(imageId);
            return this;
        }

        public QueryBuilder imageIdList(String ... imageId){
            this.imageIdList = solveNullList(imageId);
            return this;
        }

        public QueryBuilder imageIdList(List<String> imageId){
            this.imageIdList = imageId;
            return this;
        }

        public QueryBuilder fetchImageId(){
            setFetchFields("fetchFields","imageId");
            return this;
        }

        public QueryBuilder excludeImageId(){
            setFetchFields("excludeFields","imageId");
            return this;
        }

        public QueryBuilder fuzzyCommand (List<String> fuzzyCommand){
            this.fuzzyCommand = fuzzyCommand;
            return this;
        }

        public QueryBuilder fuzzyCommand (String ... fuzzyCommand){
            this.fuzzyCommand = solveNullList(fuzzyCommand);
            return this;
        }

        public QueryBuilder rightFuzzyCommand (List<String> rightFuzzyCommand){
            this.rightFuzzyCommand = rightFuzzyCommand;
            return this;
        }

        public QueryBuilder rightFuzzyCommand (String ... rightFuzzyCommand){
            this.rightFuzzyCommand = solveNullList(rightFuzzyCommand);
            return this;
        }

        public QueryBuilder command(String command){
            setCommand(command);
            return this;
        }

        public QueryBuilder commandList(String ... command){
            this.commandList = solveNullList(command);
            return this;
        }

        public QueryBuilder commandList(List<String> command){
            this.commandList = command;
            return this;
        }

        public QueryBuilder fetchCommand(){
            setFetchFields("fetchFields","command");
            return this;
        }

        public QueryBuilder excludeCommand(){
            setFetchFields("excludeFields","command");
            return this;
        }

        public QueryBuilder containerCreateTimeBetWeen(java.time.LocalDateTime containerCreateTimeSt,java.time.LocalDateTime containerCreateTimeEd){
            this.containerCreateTimeSt = containerCreateTimeSt;
            this.containerCreateTimeEd = containerCreateTimeEd;
            return this;
        }

        public QueryBuilder containerCreateTimeGreaterEqThan(java.time.LocalDateTime containerCreateTimeSt){
            this.containerCreateTimeSt = containerCreateTimeSt;
            return this;
        }
        public QueryBuilder containerCreateTimeLessEqThan(java.time.LocalDateTime containerCreateTimeEd){
            this.containerCreateTimeEd = containerCreateTimeEd;
            return this;
        }


        public QueryBuilder containerCreateTime(java.time.LocalDateTime containerCreateTime){
            setContainerCreateTime(containerCreateTime);
            return this;
        }

        public QueryBuilder containerCreateTimeList(java.time.LocalDateTime ... containerCreateTime){
            this.containerCreateTimeList = solveNullList(containerCreateTime);
            return this;
        }

        public QueryBuilder containerCreateTimeList(List<java.time.LocalDateTime> containerCreateTime){
            this.containerCreateTimeList = containerCreateTime;
            return this;
        }

        public QueryBuilder fetchContainerCreateTime(){
            setFetchFields("fetchFields","containerCreateTime");
            return this;
        }

        public QueryBuilder excludeContainerCreateTime(){
            setFetchFields("excludeFields","containerCreateTime");
            return this;
        }

        public QueryBuilder fuzzyContianerPorts (List<String> fuzzyContianerPorts){
            this.fuzzyContianerPorts = fuzzyContianerPorts;
            return this;
        }

        public QueryBuilder fuzzyContianerPorts (String ... fuzzyContianerPorts){
            this.fuzzyContianerPorts = solveNullList(fuzzyContianerPorts);
            return this;
        }

        public QueryBuilder rightFuzzyContianerPorts (List<String> rightFuzzyContianerPorts){
            this.rightFuzzyContianerPorts = rightFuzzyContianerPorts;
            return this;
        }

        public QueryBuilder rightFuzzyContianerPorts (String ... rightFuzzyContianerPorts){
            this.rightFuzzyContianerPorts = solveNullList(rightFuzzyContianerPorts);
            return this;
        }

        public QueryBuilder contianerPorts(String contianerPorts){
            setContianerPorts(contianerPorts);
            return this;
        }

        public QueryBuilder contianerPortsList(String ... contianerPorts){
            this.contianerPortsList = solveNullList(contianerPorts);
            return this;
        }

        public QueryBuilder contianerPortsList(List<String> contianerPorts){
            this.contianerPortsList = contianerPorts;
            return this;
        }

        public QueryBuilder fetchContianerPorts(){
            setFetchFields("fetchFields","contianerPorts");
            return this;
        }

        public QueryBuilder excludeContianerPorts(){
            setFetchFields("excludeFields","contianerPorts");
            return this;
        }

        public QueryBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public QueryBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public QueryBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public QueryBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public QueryBuilder state(String state){
            setState(state);
            return this;
        }

        public QueryBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public QueryBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public QueryBuilder fetchState(){
            setFetchFields("fetchFields","state");
            return this;
        }

        public QueryBuilder excludeState(){
            setFetchFields("excludeFields","state");
            return this;
        }

        public QueryBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public QueryBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public QueryBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public QueryBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public QueryBuilder status(String status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder fuzzyNetworkMode (List<String> fuzzyNetworkMode){
            this.fuzzyNetworkMode = fuzzyNetworkMode;
            return this;
        }

        public QueryBuilder fuzzyNetworkMode (String ... fuzzyNetworkMode){
            this.fuzzyNetworkMode = solveNullList(fuzzyNetworkMode);
            return this;
        }

        public QueryBuilder rightFuzzyNetworkMode (List<String> rightFuzzyNetworkMode){
            this.rightFuzzyNetworkMode = rightFuzzyNetworkMode;
            return this;
        }

        public QueryBuilder rightFuzzyNetworkMode (String ... rightFuzzyNetworkMode){
            this.rightFuzzyNetworkMode = solveNullList(rightFuzzyNetworkMode);
            return this;
        }

        public QueryBuilder networkMode(String networkMode){
            setNetworkMode(networkMode);
            return this;
        }

        public QueryBuilder networkModeList(String ... networkMode){
            this.networkModeList = solveNullList(networkMode);
            return this;
        }

        public QueryBuilder networkModeList(List<String> networkMode){
            this.networkModeList = networkMode;
            return this;
        }

        public QueryBuilder fetchNetworkMode(){
            setFetchFields("fetchFields","networkMode");
            return this;
        }

        public QueryBuilder excludeNetworkMode(){
            setFetchFields("excludeFields","networkMode");
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

        public ContainerInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> deployIdList;

        public List<Long> getDeployIdList(){return this.deployIdList;}

        private Long deployIdSt;

        private Long deployIdEd;

        public Long getDeployIdSt(){return this.deployIdSt;}

        public Long getDeployIdEd(){return this.deployIdEd;}

        private List<String> containerIdList;

        public List<String> getContainerIdList(){return this.containerIdList;}


        private List<String> fuzzyContainerId;

        public List<String> getFuzzyContainerId(){return this.fuzzyContainerId;}

        private List<String> rightFuzzyContainerId;

        public List<String> getRightFuzzyContainerId(){return this.rightFuzzyContainerId;}
        private List<String> containerNameList;

        public List<String> getContainerNameList(){return this.containerNameList;}


        private List<String> fuzzyContainerName;

        public List<String> getFuzzyContainerName(){return this.fuzzyContainerName;}

        private List<String> rightFuzzyContainerName;

        public List<String> getRightFuzzyContainerName(){return this.rightFuzzyContainerName;}
        private List<String> imageNameList;

        public List<String> getImageNameList(){return this.imageNameList;}


        private List<String> fuzzyImageName;

        public List<String> getFuzzyImageName(){return this.fuzzyImageName;}

        private List<String> rightFuzzyImageName;

        public List<String> getRightFuzzyImageName(){return this.rightFuzzyImageName;}
        private List<String> imageTagList;

        public List<String> getImageTagList(){return this.imageTagList;}


        private List<String> fuzzyImageTag;

        public List<String> getFuzzyImageTag(){return this.fuzzyImageTag;}

        private List<String> rightFuzzyImageTag;

        public List<String> getRightFuzzyImageTag(){return this.rightFuzzyImageTag;}
        private List<String> imageIdList;

        public List<String> getImageIdList(){return this.imageIdList;}


        private List<String> fuzzyImageId;

        public List<String> getFuzzyImageId(){return this.fuzzyImageId;}

        private List<String> rightFuzzyImageId;

        public List<String> getRightFuzzyImageId(){return this.rightFuzzyImageId;}
        private List<String> commandList;

        public List<String> getCommandList(){return this.commandList;}


        private List<String> fuzzyCommand;

        public List<String> getFuzzyCommand(){return this.fuzzyCommand;}

        private List<String> rightFuzzyCommand;

        public List<String> getRightFuzzyCommand(){return this.rightFuzzyCommand;}
        private List<java.time.LocalDateTime> containerCreateTimeList;

        public List<java.time.LocalDateTime> getContainerCreateTimeList(){return this.containerCreateTimeList;}

        private java.time.LocalDateTime containerCreateTimeSt;

        private java.time.LocalDateTime containerCreateTimeEd;

        public java.time.LocalDateTime getContainerCreateTimeSt(){return this.containerCreateTimeSt;}

        public java.time.LocalDateTime getContainerCreateTimeEd(){return this.containerCreateTimeEd;}

        private List<String> contianerPortsList;

        public List<String> getContianerPortsList(){return this.contianerPortsList;}


        private List<String> fuzzyContianerPorts;

        public List<String> getFuzzyContianerPorts(){return this.fuzzyContianerPorts;}

        private List<String> rightFuzzyContianerPorts;

        public List<String> getRightFuzzyContianerPorts(){return this.rightFuzzyContianerPorts;}
        private List<String> stateList;

        public List<String> getStateList(){return this.stateList;}


        private List<String> fuzzyState;

        public List<String> getFuzzyState(){return this.fuzzyState;}

        private List<String> rightFuzzyState;

        public List<String> getRightFuzzyState(){return this.rightFuzzyState;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private List<String> networkModeList;

        public List<String> getNetworkModeList(){return this.networkModeList;}


        private List<String> fuzzyNetworkMode;

        public List<String> getFuzzyNetworkMode(){return this.fuzzyNetworkMode;}

        private List<String> rightFuzzyNetworkMode;

        public List<String> getRightFuzzyNetworkMode(){return this.rightFuzzyNetworkMode;}
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

        public ConditionBuilder deployIdBetWeen(Long deployIdSt,Long deployIdEd){
            this.deployIdSt = deployIdSt;
            this.deployIdEd = deployIdEd;
            return this;
        }

        public ConditionBuilder deployIdGreaterEqThan(Long deployIdSt){
            this.deployIdSt = deployIdSt;
            return this;
        }
        public ConditionBuilder deployIdLessEqThan(Long deployIdEd){
            this.deployIdEd = deployIdEd;
            return this;
        }


        public ConditionBuilder deployIdList(Long ... deployId){
            this.deployIdList = solveNullList(deployId);
            return this;
        }

        public ConditionBuilder deployIdList(List<Long> deployId){
            this.deployIdList = deployId;
            return this;
        }

        public ConditionBuilder fuzzyContainerId (List<String> fuzzyContainerId){
            this.fuzzyContainerId = fuzzyContainerId;
            return this;
        }

        public ConditionBuilder fuzzyContainerId (String ... fuzzyContainerId){
            this.fuzzyContainerId = solveNullList(fuzzyContainerId);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerId (List<String> rightFuzzyContainerId){
            this.rightFuzzyContainerId = rightFuzzyContainerId;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerId (String ... rightFuzzyContainerId){
            this.rightFuzzyContainerId = solveNullList(rightFuzzyContainerId);
            return this;
        }

        public ConditionBuilder containerIdList(String ... containerId){
            this.containerIdList = solveNullList(containerId);
            return this;
        }

        public ConditionBuilder containerIdList(List<String> containerId){
            this.containerIdList = containerId;
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

        public ConditionBuilder fuzzyImageName (List<String> fuzzyImageName){
            this.fuzzyImageName = fuzzyImageName;
            return this;
        }

        public ConditionBuilder fuzzyImageName (String ... fuzzyImageName){
            this.fuzzyImageName = solveNullList(fuzzyImageName);
            return this;
        }

        public ConditionBuilder rightFuzzyImageName (List<String> rightFuzzyImageName){
            this.rightFuzzyImageName = rightFuzzyImageName;
            return this;
        }

        public ConditionBuilder rightFuzzyImageName (String ... rightFuzzyImageName){
            this.rightFuzzyImageName = solveNullList(rightFuzzyImageName);
            return this;
        }

        public ConditionBuilder imageNameList(String ... imageName){
            this.imageNameList = solveNullList(imageName);
            return this;
        }

        public ConditionBuilder imageNameList(List<String> imageName){
            this.imageNameList = imageName;
            return this;
        }

        public ConditionBuilder fuzzyImageTag (List<String> fuzzyImageTag){
            this.fuzzyImageTag = fuzzyImageTag;
            return this;
        }

        public ConditionBuilder fuzzyImageTag (String ... fuzzyImageTag){
            this.fuzzyImageTag = solveNullList(fuzzyImageTag);
            return this;
        }

        public ConditionBuilder rightFuzzyImageTag (List<String> rightFuzzyImageTag){
            this.rightFuzzyImageTag = rightFuzzyImageTag;
            return this;
        }

        public ConditionBuilder rightFuzzyImageTag (String ... rightFuzzyImageTag){
            this.rightFuzzyImageTag = solveNullList(rightFuzzyImageTag);
            return this;
        }

        public ConditionBuilder imageTagList(String ... imageTag){
            this.imageTagList = solveNullList(imageTag);
            return this;
        }

        public ConditionBuilder imageTagList(List<String> imageTag){
            this.imageTagList = imageTag;
            return this;
        }

        public ConditionBuilder fuzzyImageId (List<String> fuzzyImageId){
            this.fuzzyImageId = fuzzyImageId;
            return this;
        }

        public ConditionBuilder fuzzyImageId (String ... fuzzyImageId){
            this.fuzzyImageId = solveNullList(fuzzyImageId);
            return this;
        }

        public ConditionBuilder rightFuzzyImageId (List<String> rightFuzzyImageId){
            this.rightFuzzyImageId = rightFuzzyImageId;
            return this;
        }

        public ConditionBuilder rightFuzzyImageId (String ... rightFuzzyImageId){
            this.rightFuzzyImageId = solveNullList(rightFuzzyImageId);
            return this;
        }

        public ConditionBuilder imageIdList(String ... imageId){
            this.imageIdList = solveNullList(imageId);
            return this;
        }

        public ConditionBuilder imageIdList(List<String> imageId){
            this.imageIdList = imageId;
            return this;
        }

        public ConditionBuilder fuzzyCommand (List<String> fuzzyCommand){
            this.fuzzyCommand = fuzzyCommand;
            return this;
        }

        public ConditionBuilder fuzzyCommand (String ... fuzzyCommand){
            this.fuzzyCommand = solveNullList(fuzzyCommand);
            return this;
        }

        public ConditionBuilder rightFuzzyCommand (List<String> rightFuzzyCommand){
            this.rightFuzzyCommand = rightFuzzyCommand;
            return this;
        }

        public ConditionBuilder rightFuzzyCommand (String ... rightFuzzyCommand){
            this.rightFuzzyCommand = solveNullList(rightFuzzyCommand);
            return this;
        }

        public ConditionBuilder commandList(String ... command){
            this.commandList = solveNullList(command);
            return this;
        }

        public ConditionBuilder commandList(List<String> command){
            this.commandList = command;
            return this;
        }

        public ConditionBuilder containerCreateTimeBetWeen(java.time.LocalDateTime containerCreateTimeSt,java.time.LocalDateTime containerCreateTimeEd){
            this.containerCreateTimeSt = containerCreateTimeSt;
            this.containerCreateTimeEd = containerCreateTimeEd;
            return this;
        }

        public ConditionBuilder containerCreateTimeGreaterEqThan(java.time.LocalDateTime containerCreateTimeSt){
            this.containerCreateTimeSt = containerCreateTimeSt;
            return this;
        }
        public ConditionBuilder containerCreateTimeLessEqThan(java.time.LocalDateTime containerCreateTimeEd){
            this.containerCreateTimeEd = containerCreateTimeEd;
            return this;
        }


        public ConditionBuilder containerCreateTimeList(java.time.LocalDateTime ... containerCreateTime){
            this.containerCreateTimeList = solveNullList(containerCreateTime);
            return this;
        }

        public ConditionBuilder containerCreateTimeList(List<java.time.LocalDateTime> containerCreateTime){
            this.containerCreateTimeList = containerCreateTime;
            return this;
        }

        public ConditionBuilder fuzzyContianerPorts (List<String> fuzzyContianerPorts){
            this.fuzzyContianerPorts = fuzzyContianerPorts;
            return this;
        }

        public ConditionBuilder fuzzyContianerPorts (String ... fuzzyContianerPorts){
            this.fuzzyContianerPorts = solveNullList(fuzzyContianerPorts);
            return this;
        }

        public ConditionBuilder rightFuzzyContianerPorts (List<String> rightFuzzyContianerPorts){
            this.rightFuzzyContianerPorts = rightFuzzyContianerPorts;
            return this;
        }

        public ConditionBuilder rightFuzzyContianerPorts (String ... rightFuzzyContianerPorts){
            this.rightFuzzyContianerPorts = solveNullList(rightFuzzyContianerPorts);
            return this;
        }

        public ConditionBuilder contianerPortsList(String ... contianerPorts){
            this.contianerPortsList = solveNullList(contianerPorts);
            return this;
        }

        public ConditionBuilder contianerPortsList(List<String> contianerPorts){
            this.contianerPortsList = contianerPorts;
            return this;
        }

        public ConditionBuilder fuzzyState (List<String> fuzzyState){
            this.fuzzyState = fuzzyState;
            return this;
        }

        public ConditionBuilder fuzzyState (String ... fuzzyState){
            this.fuzzyState = solveNullList(fuzzyState);
            return this;
        }

        public ConditionBuilder rightFuzzyState (List<String> rightFuzzyState){
            this.rightFuzzyState = rightFuzzyState;
            return this;
        }

        public ConditionBuilder rightFuzzyState (String ... rightFuzzyState){
            this.rightFuzzyState = solveNullList(rightFuzzyState);
            return this;
        }

        public ConditionBuilder stateList(String ... state){
            this.stateList = solveNullList(state);
            return this;
        }

        public ConditionBuilder stateList(List<String> state){
            this.stateList = state;
            return this;
        }

        public ConditionBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public ConditionBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public ConditionBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder fuzzyNetworkMode (List<String> fuzzyNetworkMode){
            this.fuzzyNetworkMode = fuzzyNetworkMode;
            return this;
        }

        public ConditionBuilder fuzzyNetworkMode (String ... fuzzyNetworkMode){
            this.fuzzyNetworkMode = solveNullList(fuzzyNetworkMode);
            return this;
        }

        public ConditionBuilder rightFuzzyNetworkMode (List<String> rightFuzzyNetworkMode){
            this.rightFuzzyNetworkMode = rightFuzzyNetworkMode;
            return this;
        }

        public ConditionBuilder rightFuzzyNetworkMode (String ... rightFuzzyNetworkMode){
            this.rightFuzzyNetworkMode = solveNullList(rightFuzzyNetworkMode);
            return this;
        }

        public ConditionBuilder networkModeList(String ... networkMode){
            this.networkModeList = solveNullList(networkMode);
            return this;
        }

        public ConditionBuilder networkModeList(List<String> networkMode){
            this.networkModeList = networkMode;
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

        private ContainerInfo obj;

        public Builder(){
            this.obj = new ContainerInfo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder deployId(Long deployId){
            this.obj.setDeployId(deployId);
            return this;
        }
        public Builder containerId(String containerId){
            this.obj.setContainerId(containerId);
            return this;
        }
        public Builder containerName(String containerName){
            this.obj.setContainerName(containerName);
            return this;
        }
        public Builder imageName(String imageName){
            this.obj.setImageName(imageName);
            return this;
        }
        public Builder imageTag(String imageTag){
            this.obj.setImageTag(imageTag);
            return this;
        }
        public Builder imageId(String imageId){
            this.obj.setImageId(imageId);
            return this;
        }
        public Builder command(String command){
            this.obj.setCommand(command);
            return this;
        }
        public Builder containerCreateTime(java.time.LocalDateTime containerCreateTime){
            this.obj.setContainerCreateTime(containerCreateTime);
            return this;
        }
        public Builder contianerPorts(String contianerPorts){
            this.obj.setContianerPorts(contianerPorts);
            return this;
        }
        public Builder state(String state){
            this.obj.setState(state);
            return this;
        }
        public Builder status(String status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder networkMode(String networkMode){
            this.obj.setNetworkMode(networkMode);
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
        public ContainerInfo build(){return obj;}
    }

}
