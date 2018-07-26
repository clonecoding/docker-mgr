package com.jdddata.dockermgr.dao.modle;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zhangheng
*/
public class ProjectMgr implements Serializable {

    private static final long serialVersionUID = 1532590761822L;


    /**
    * 主键
    * 自增ID
    * isNullAble:0
    */
    private Long id;

    /**
    * 项目名称
    * isNullAble:1,defaultVal:
    */
    private String projectName;

    /**
    * 项目组名
    * isNullAble:1,defaultVal:
    */
    private String projectGroup;

    /**
    * 联系人名称
    * isNullAble:1,defaultVal:
    */
    private String contactName;

    /**
    * 联系人手机
    * isNullAble:1,defaultVal:
    */
    private String contactMobile;

    /**
    * 联系人邮箱
    * isNullAble:1,defaultVal:
    */
    private String contactEmail;

    /**
    * 报警邮件地址
    * isNullAble:1,defaultVal:
    */
    private String alarmEmailAddress;

    /**
    * git地址
    * isNullAble:1,defaultVal:
    */
    private String gitUrl;

    /**
    * 是否删除
    * isNullAble:1,defaultVal:0
    */
    private Integer isDelete;

    /**
    * 创建时间
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.time.LocalDateTime createTime;

    /**
    * 创建人
    * isNullAble:1
    */
    private String createUser;

    /**
    * 更新时间
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.time.LocalDateTime updateTime;

    /**
    * 更新人
    * isNullAble:1
    */
    private String updateUser;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProjectName(String projectName){this.projectName = projectName;}

    public String getProjectName(){return this.projectName;}

    public void setProjectGroup(String projectGroup){this.projectGroup = projectGroup;}

    public String getProjectGroup(){return this.projectGroup;}

    public void setContactName(String contactName){this.contactName = contactName;}

    public String getContactName(){return this.contactName;}

    public void setContactMobile(String contactMobile){this.contactMobile = contactMobile;}

    public String getContactMobile(){return this.contactMobile;}

    public void setContactEmail(String contactEmail){this.contactEmail = contactEmail;}

    public String getContactEmail(){return this.contactEmail;}

    public void setAlarmEmailAddress(String alarmEmailAddress){this.alarmEmailAddress = alarmEmailAddress;}

    public String getAlarmEmailAddress(){return this.alarmEmailAddress;}

    public void setGitUrl(String gitUrl){this.gitUrl = gitUrl;}

    public String getGitUrl(){return this.gitUrl;}

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
        return "ProjectMgr{" +
                "id='" + id + '\'' +
                "projectName='" + projectName + '\'' +
                "projectGroup='" + projectGroup + '\'' +
                "contactName='" + contactName + '\'' +
                "contactMobile='" + contactMobile + '\'' +
                "contactEmail='" + contactEmail + '\'' +
                "alarmEmailAddress='" + alarmEmailAddress + '\'' +
                "gitUrl='" + gitUrl + '\'' +
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

        private ProjectMgr set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProjectMgr set){
            this.set = set;
            return this;
        }

        public ProjectMgr getSet(){
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

    public static class QueryBuilder extends ProjectMgr{
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

        private List<String> projectNameList;

        public List<String> getProjectNameList(){return this.projectNameList;}


        private List<String> fuzzyProjectName;

        public List<String> getFuzzyProjectName(){return this.fuzzyProjectName;}

        private List<String> rightFuzzyProjectName;

        public List<String> getRightFuzzyProjectName(){return this.rightFuzzyProjectName;}
        private List<String> projectGroupList;

        public List<String> getProjectGroupList(){return this.projectGroupList;}


        private List<String> fuzzyProjectGroup;

        public List<String> getFuzzyProjectGroup(){return this.fuzzyProjectGroup;}

        private List<String> rightFuzzyProjectGroup;

        public List<String> getRightFuzzyProjectGroup(){return this.rightFuzzyProjectGroup;}
        private List<String> contactNameList;

        public List<String> getContactNameList(){return this.contactNameList;}


        private List<String> fuzzyContactName;

        public List<String> getFuzzyContactName(){return this.fuzzyContactName;}

        private List<String> rightFuzzyContactName;

        public List<String> getRightFuzzyContactName(){return this.rightFuzzyContactName;}
        private List<String> contactMobileList;

        public List<String> getContactMobileList(){return this.contactMobileList;}


        private List<String> fuzzyContactMobile;

        public List<String> getFuzzyContactMobile(){return this.fuzzyContactMobile;}

        private List<String> rightFuzzyContactMobile;

        public List<String> getRightFuzzyContactMobile(){return this.rightFuzzyContactMobile;}
        private List<String> contactEmailList;

        public List<String> getContactEmailList(){return this.contactEmailList;}


        private List<String> fuzzyContactEmail;

        public List<String> getFuzzyContactEmail(){return this.fuzzyContactEmail;}

        private List<String> rightFuzzyContactEmail;

        public List<String> getRightFuzzyContactEmail(){return this.rightFuzzyContactEmail;}
        private List<String> alarmEmailAddressList;

        public List<String> getAlarmEmailAddressList(){return this.alarmEmailAddressList;}


        private List<String> fuzzyAlarmEmailAddress;

        public List<String> getFuzzyAlarmEmailAddress(){return this.fuzzyAlarmEmailAddress;}

        private List<String> rightFuzzyAlarmEmailAddress;

        public List<String> getRightFuzzyAlarmEmailAddress(){return this.rightFuzzyAlarmEmailAddress;}
        private List<String> gitUrlList;

        public List<String> getGitUrlList(){return this.gitUrlList;}


        private List<String> fuzzyGitUrl;

        public List<String> getFuzzyGitUrl(){return this.fuzzyGitUrl;}

        private List<String> rightFuzzyGitUrl;

        public List<String> getRightFuzzyGitUrl(){return this.rightFuzzyGitUrl;}
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

        public QueryBuilder fuzzyProjectName (List<String> fuzzyProjectName){
            this.fuzzyProjectName = fuzzyProjectName;
            return this;
        }

        public QueryBuilder fuzzyProjectName (String ... fuzzyProjectName){
            this.fuzzyProjectName = solveNullList(fuzzyProjectName);
            return this;
        }

        public QueryBuilder rightFuzzyProjectName (List<String> rightFuzzyProjectName){
            this.rightFuzzyProjectName = rightFuzzyProjectName;
            return this;
        }

        public QueryBuilder rightFuzzyProjectName (String ... rightFuzzyProjectName){
            this.rightFuzzyProjectName = solveNullList(rightFuzzyProjectName);
            return this;
        }

        public QueryBuilder projectName(String projectName){
            setProjectName(projectName);
            return this;
        }

        public QueryBuilder projectNameList(String ... projectName){
            this.projectNameList = solveNullList(projectName);
            return this;
        }

        public QueryBuilder projectNameList(List<String> projectName){
            this.projectNameList = projectName;
            return this;
        }

        public QueryBuilder fetchProjectName(){
            setFetchFields("fetchFields","projectName");
            return this;
        }

        public QueryBuilder excludeProjectName(){
            setFetchFields("excludeFields","projectName");
            return this;
        }

        public QueryBuilder fuzzyProjectGroup (List<String> fuzzyProjectGroup){
            this.fuzzyProjectGroup = fuzzyProjectGroup;
            return this;
        }

        public QueryBuilder fuzzyProjectGroup (String ... fuzzyProjectGroup){
            this.fuzzyProjectGroup = solveNullList(fuzzyProjectGroup);
            return this;
        }

        public QueryBuilder rightFuzzyProjectGroup (List<String> rightFuzzyProjectGroup){
            this.rightFuzzyProjectGroup = rightFuzzyProjectGroup;
            return this;
        }

        public QueryBuilder rightFuzzyProjectGroup (String ... rightFuzzyProjectGroup){
            this.rightFuzzyProjectGroup = solveNullList(rightFuzzyProjectGroup);
            return this;
        }

        public QueryBuilder projectGroup(String projectGroup){
            setProjectGroup(projectGroup);
            return this;
        }

        public QueryBuilder projectGroupList(String ... projectGroup){
            this.projectGroupList = solveNullList(projectGroup);
            return this;
        }

        public QueryBuilder projectGroupList(List<String> projectGroup){
            this.projectGroupList = projectGroup;
            return this;
        }

        public QueryBuilder fetchProjectGroup(){
            setFetchFields("fetchFields","projectGroup");
            return this;
        }

        public QueryBuilder excludeProjectGroup(){
            setFetchFields("excludeFields","projectGroup");
            return this;
        }

        public QueryBuilder fuzzyContactName (List<String> fuzzyContactName){
            this.fuzzyContactName = fuzzyContactName;
            return this;
        }

        public QueryBuilder fuzzyContactName (String ... fuzzyContactName){
            this.fuzzyContactName = solveNullList(fuzzyContactName);
            return this;
        }

        public QueryBuilder rightFuzzyContactName (List<String> rightFuzzyContactName){
            this.rightFuzzyContactName = rightFuzzyContactName;
            return this;
        }

        public QueryBuilder rightFuzzyContactName (String ... rightFuzzyContactName){
            this.rightFuzzyContactName = solveNullList(rightFuzzyContactName);
            return this;
        }

        public QueryBuilder contactName(String contactName){
            setContactName(contactName);
            return this;
        }

        public QueryBuilder contactNameList(String ... contactName){
            this.contactNameList = solveNullList(contactName);
            return this;
        }

        public QueryBuilder contactNameList(List<String> contactName){
            this.contactNameList = contactName;
            return this;
        }

        public QueryBuilder fetchContactName(){
            setFetchFields("fetchFields","contactName");
            return this;
        }

        public QueryBuilder excludeContactName(){
            setFetchFields("excludeFields","contactName");
            return this;
        }

        public QueryBuilder fuzzyContactMobile (List<String> fuzzyContactMobile){
            this.fuzzyContactMobile = fuzzyContactMobile;
            return this;
        }

        public QueryBuilder fuzzyContactMobile (String ... fuzzyContactMobile){
            this.fuzzyContactMobile = solveNullList(fuzzyContactMobile);
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (List<String> rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = rightFuzzyContactMobile;
            return this;
        }

        public QueryBuilder rightFuzzyContactMobile (String ... rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = solveNullList(rightFuzzyContactMobile);
            return this;
        }

        public QueryBuilder contactMobile(String contactMobile){
            setContactMobile(contactMobile);
            return this;
        }

        public QueryBuilder contactMobileList(String ... contactMobile){
            this.contactMobileList = solveNullList(contactMobile);
            return this;
        }

        public QueryBuilder contactMobileList(List<String> contactMobile){
            this.contactMobileList = contactMobile;
            return this;
        }

        public QueryBuilder fetchContactMobile(){
            setFetchFields("fetchFields","contactMobile");
            return this;
        }

        public QueryBuilder excludeContactMobile(){
            setFetchFields("excludeFields","contactMobile");
            return this;
        }

        public QueryBuilder fuzzyContactEmail (List<String> fuzzyContactEmail){
            this.fuzzyContactEmail = fuzzyContactEmail;
            return this;
        }

        public QueryBuilder fuzzyContactEmail (String ... fuzzyContactEmail){
            this.fuzzyContactEmail = solveNullList(fuzzyContactEmail);
            return this;
        }

        public QueryBuilder rightFuzzyContactEmail (List<String> rightFuzzyContactEmail){
            this.rightFuzzyContactEmail = rightFuzzyContactEmail;
            return this;
        }

        public QueryBuilder rightFuzzyContactEmail (String ... rightFuzzyContactEmail){
            this.rightFuzzyContactEmail = solveNullList(rightFuzzyContactEmail);
            return this;
        }

        public QueryBuilder contactEmail(String contactEmail){
            setContactEmail(contactEmail);
            return this;
        }

        public QueryBuilder contactEmailList(String ... contactEmail){
            this.contactEmailList = solveNullList(contactEmail);
            return this;
        }

        public QueryBuilder contactEmailList(List<String> contactEmail){
            this.contactEmailList = contactEmail;
            return this;
        }

        public QueryBuilder fetchContactEmail(){
            setFetchFields("fetchFields","contactEmail");
            return this;
        }

        public QueryBuilder excludeContactEmail(){
            setFetchFields("excludeFields","contactEmail");
            return this;
        }

        public QueryBuilder fuzzyAlarmEmailAddress (List<String> fuzzyAlarmEmailAddress){
            this.fuzzyAlarmEmailAddress = fuzzyAlarmEmailAddress;
            return this;
        }

        public QueryBuilder fuzzyAlarmEmailAddress (String ... fuzzyAlarmEmailAddress){
            this.fuzzyAlarmEmailAddress = solveNullList(fuzzyAlarmEmailAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAlarmEmailAddress (List<String> rightFuzzyAlarmEmailAddress){
            this.rightFuzzyAlarmEmailAddress = rightFuzzyAlarmEmailAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAlarmEmailAddress (String ... rightFuzzyAlarmEmailAddress){
            this.rightFuzzyAlarmEmailAddress = solveNullList(rightFuzzyAlarmEmailAddress);
            return this;
        }

        public QueryBuilder alarmEmailAddress(String alarmEmailAddress){
            setAlarmEmailAddress(alarmEmailAddress);
            return this;
        }

        public QueryBuilder alarmEmailAddressList(String ... alarmEmailAddress){
            this.alarmEmailAddressList = solveNullList(alarmEmailAddress);
            return this;
        }

        public QueryBuilder alarmEmailAddressList(List<String> alarmEmailAddress){
            this.alarmEmailAddressList = alarmEmailAddress;
            return this;
        }

        public QueryBuilder fetchAlarmEmailAddress(){
            setFetchFields("fetchFields","alarmEmailAddress");
            return this;
        }

        public QueryBuilder excludeAlarmEmailAddress(){
            setFetchFields("excludeFields","alarmEmailAddress");
            return this;
        }

        public QueryBuilder fuzzyGitUrl (List<String> fuzzyGitUrl){
            this.fuzzyGitUrl = fuzzyGitUrl;
            return this;
        }

        public QueryBuilder fuzzyGitUrl (String ... fuzzyGitUrl){
            this.fuzzyGitUrl = solveNullList(fuzzyGitUrl);
            return this;
        }

        public QueryBuilder rightFuzzyGitUrl (List<String> rightFuzzyGitUrl){
            this.rightFuzzyGitUrl = rightFuzzyGitUrl;
            return this;
        }

        public QueryBuilder rightFuzzyGitUrl (String ... rightFuzzyGitUrl){
            this.rightFuzzyGitUrl = solveNullList(rightFuzzyGitUrl);
            return this;
        }

        public QueryBuilder gitUrl(String gitUrl){
            setGitUrl(gitUrl);
            return this;
        }

        public QueryBuilder gitUrlList(String ... gitUrl){
            this.gitUrlList = solveNullList(gitUrl);
            return this;
        }

        public QueryBuilder gitUrlList(List<String> gitUrl){
            this.gitUrlList = gitUrl;
            return this;
        }

        public QueryBuilder fetchGitUrl(){
            setFetchFields("fetchFields","gitUrl");
            return this;
        }

        public QueryBuilder excludeGitUrl(){
            setFetchFields("excludeFields","gitUrl");
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

        public ProjectMgr build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> projectNameList;

        public List<String> getProjectNameList(){return this.projectNameList;}


        private List<String> fuzzyProjectName;

        public List<String> getFuzzyProjectName(){return this.fuzzyProjectName;}

        private List<String> rightFuzzyProjectName;

        public List<String> getRightFuzzyProjectName(){return this.rightFuzzyProjectName;}
        private List<String> projectGroupList;

        public List<String> getProjectGroupList(){return this.projectGroupList;}


        private List<String> fuzzyProjectGroup;

        public List<String> getFuzzyProjectGroup(){return this.fuzzyProjectGroup;}

        private List<String> rightFuzzyProjectGroup;

        public List<String> getRightFuzzyProjectGroup(){return this.rightFuzzyProjectGroup;}
        private List<String> contactNameList;

        public List<String> getContactNameList(){return this.contactNameList;}


        private List<String> fuzzyContactName;

        public List<String> getFuzzyContactName(){return this.fuzzyContactName;}

        private List<String> rightFuzzyContactName;

        public List<String> getRightFuzzyContactName(){return this.rightFuzzyContactName;}
        private List<String> contactMobileList;

        public List<String> getContactMobileList(){return this.contactMobileList;}


        private List<String> fuzzyContactMobile;

        public List<String> getFuzzyContactMobile(){return this.fuzzyContactMobile;}

        private List<String> rightFuzzyContactMobile;

        public List<String> getRightFuzzyContactMobile(){return this.rightFuzzyContactMobile;}
        private List<String> contactEmailList;

        public List<String> getContactEmailList(){return this.contactEmailList;}


        private List<String> fuzzyContactEmail;

        public List<String> getFuzzyContactEmail(){return this.fuzzyContactEmail;}

        private List<String> rightFuzzyContactEmail;

        public List<String> getRightFuzzyContactEmail(){return this.rightFuzzyContactEmail;}
        private List<String> alarmEmailAddressList;

        public List<String> getAlarmEmailAddressList(){return this.alarmEmailAddressList;}


        private List<String> fuzzyAlarmEmailAddress;

        public List<String> getFuzzyAlarmEmailAddress(){return this.fuzzyAlarmEmailAddress;}

        private List<String> rightFuzzyAlarmEmailAddress;

        public List<String> getRightFuzzyAlarmEmailAddress(){return this.rightFuzzyAlarmEmailAddress;}
        private List<String> gitUrlList;

        public List<String> getGitUrlList(){return this.gitUrlList;}


        private List<String> fuzzyGitUrl;

        public List<String> getFuzzyGitUrl(){return this.fuzzyGitUrl;}

        private List<String> rightFuzzyGitUrl;

        public List<String> getRightFuzzyGitUrl(){return this.rightFuzzyGitUrl;}
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

        public ConditionBuilder fuzzyProjectName (List<String> fuzzyProjectName){
            this.fuzzyProjectName = fuzzyProjectName;
            return this;
        }

        public ConditionBuilder fuzzyProjectName (String ... fuzzyProjectName){
            this.fuzzyProjectName = solveNullList(fuzzyProjectName);
            return this;
        }

        public ConditionBuilder rightFuzzyProjectName (List<String> rightFuzzyProjectName){
            this.rightFuzzyProjectName = rightFuzzyProjectName;
            return this;
        }

        public ConditionBuilder rightFuzzyProjectName (String ... rightFuzzyProjectName){
            this.rightFuzzyProjectName = solveNullList(rightFuzzyProjectName);
            return this;
        }

        public ConditionBuilder projectNameList(String ... projectName){
            this.projectNameList = solveNullList(projectName);
            return this;
        }

        public ConditionBuilder projectNameList(List<String> projectName){
            this.projectNameList = projectName;
            return this;
        }

        public ConditionBuilder fuzzyProjectGroup (List<String> fuzzyProjectGroup){
            this.fuzzyProjectGroup = fuzzyProjectGroup;
            return this;
        }

        public ConditionBuilder fuzzyProjectGroup (String ... fuzzyProjectGroup){
            this.fuzzyProjectGroup = solveNullList(fuzzyProjectGroup);
            return this;
        }

        public ConditionBuilder rightFuzzyProjectGroup (List<String> rightFuzzyProjectGroup){
            this.rightFuzzyProjectGroup = rightFuzzyProjectGroup;
            return this;
        }

        public ConditionBuilder rightFuzzyProjectGroup (String ... rightFuzzyProjectGroup){
            this.rightFuzzyProjectGroup = solveNullList(rightFuzzyProjectGroup);
            return this;
        }

        public ConditionBuilder projectGroupList(String ... projectGroup){
            this.projectGroupList = solveNullList(projectGroup);
            return this;
        }

        public ConditionBuilder projectGroupList(List<String> projectGroup){
            this.projectGroupList = projectGroup;
            return this;
        }

        public ConditionBuilder fuzzyContactName (List<String> fuzzyContactName){
            this.fuzzyContactName = fuzzyContactName;
            return this;
        }

        public ConditionBuilder fuzzyContactName (String ... fuzzyContactName){
            this.fuzzyContactName = solveNullList(fuzzyContactName);
            return this;
        }

        public ConditionBuilder rightFuzzyContactName (List<String> rightFuzzyContactName){
            this.rightFuzzyContactName = rightFuzzyContactName;
            return this;
        }

        public ConditionBuilder rightFuzzyContactName (String ... rightFuzzyContactName){
            this.rightFuzzyContactName = solveNullList(rightFuzzyContactName);
            return this;
        }

        public ConditionBuilder contactNameList(String ... contactName){
            this.contactNameList = solveNullList(contactName);
            return this;
        }

        public ConditionBuilder contactNameList(List<String> contactName){
            this.contactNameList = contactName;
            return this;
        }

        public ConditionBuilder fuzzyContactMobile (List<String> fuzzyContactMobile){
            this.fuzzyContactMobile = fuzzyContactMobile;
            return this;
        }

        public ConditionBuilder fuzzyContactMobile (String ... fuzzyContactMobile){
            this.fuzzyContactMobile = solveNullList(fuzzyContactMobile);
            return this;
        }

        public ConditionBuilder rightFuzzyContactMobile (List<String> rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = rightFuzzyContactMobile;
            return this;
        }

        public ConditionBuilder rightFuzzyContactMobile (String ... rightFuzzyContactMobile){
            this.rightFuzzyContactMobile = solveNullList(rightFuzzyContactMobile);
            return this;
        }

        public ConditionBuilder contactMobileList(String ... contactMobile){
            this.contactMobileList = solveNullList(contactMobile);
            return this;
        }

        public ConditionBuilder contactMobileList(List<String> contactMobile){
            this.contactMobileList = contactMobile;
            return this;
        }

        public ConditionBuilder fuzzyContactEmail (List<String> fuzzyContactEmail){
            this.fuzzyContactEmail = fuzzyContactEmail;
            return this;
        }

        public ConditionBuilder fuzzyContactEmail (String ... fuzzyContactEmail){
            this.fuzzyContactEmail = solveNullList(fuzzyContactEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyContactEmail (List<String> rightFuzzyContactEmail){
            this.rightFuzzyContactEmail = rightFuzzyContactEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyContactEmail (String ... rightFuzzyContactEmail){
            this.rightFuzzyContactEmail = solveNullList(rightFuzzyContactEmail);
            return this;
        }

        public ConditionBuilder contactEmailList(String ... contactEmail){
            this.contactEmailList = solveNullList(contactEmail);
            return this;
        }

        public ConditionBuilder contactEmailList(List<String> contactEmail){
            this.contactEmailList = contactEmail;
            return this;
        }

        public ConditionBuilder fuzzyAlarmEmailAddress (List<String> fuzzyAlarmEmailAddress){
            this.fuzzyAlarmEmailAddress = fuzzyAlarmEmailAddress;
            return this;
        }

        public ConditionBuilder fuzzyAlarmEmailAddress (String ... fuzzyAlarmEmailAddress){
            this.fuzzyAlarmEmailAddress = solveNullList(fuzzyAlarmEmailAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAlarmEmailAddress (List<String> rightFuzzyAlarmEmailAddress){
            this.rightFuzzyAlarmEmailAddress = rightFuzzyAlarmEmailAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAlarmEmailAddress (String ... rightFuzzyAlarmEmailAddress){
            this.rightFuzzyAlarmEmailAddress = solveNullList(rightFuzzyAlarmEmailAddress);
            return this;
        }

        public ConditionBuilder alarmEmailAddressList(String ... alarmEmailAddress){
            this.alarmEmailAddressList = solveNullList(alarmEmailAddress);
            return this;
        }

        public ConditionBuilder alarmEmailAddressList(List<String> alarmEmailAddress){
            this.alarmEmailAddressList = alarmEmailAddress;
            return this;
        }

        public ConditionBuilder fuzzyGitUrl (List<String> fuzzyGitUrl){
            this.fuzzyGitUrl = fuzzyGitUrl;
            return this;
        }

        public ConditionBuilder fuzzyGitUrl (String ... fuzzyGitUrl){
            this.fuzzyGitUrl = solveNullList(fuzzyGitUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyGitUrl (List<String> rightFuzzyGitUrl){
            this.rightFuzzyGitUrl = rightFuzzyGitUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyGitUrl (String ... rightFuzzyGitUrl){
            this.rightFuzzyGitUrl = solveNullList(rightFuzzyGitUrl);
            return this;
        }

        public ConditionBuilder gitUrlList(String ... gitUrl){
            this.gitUrlList = solveNullList(gitUrl);
            return this;
        }

        public ConditionBuilder gitUrlList(List<String> gitUrl){
            this.gitUrlList = gitUrl;
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

        private ProjectMgr obj;

        public Builder(){
            this.obj = new ProjectMgr();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder projectName(String projectName){
            this.obj.setProjectName(projectName);
            return this;
        }
        public Builder projectGroup(String projectGroup){
            this.obj.setProjectGroup(projectGroup);
            return this;
        }
        public Builder contactName(String contactName){
            this.obj.setContactName(contactName);
            return this;
        }
        public Builder contactMobile(String contactMobile){
            this.obj.setContactMobile(contactMobile);
            return this;
        }
        public Builder contactEmail(String contactEmail){
            this.obj.setContactEmail(contactEmail);
            return this;
        }
        public Builder alarmEmailAddress(String alarmEmailAddress){
            this.obj.setAlarmEmailAddress(alarmEmailAddress);
            return this;
        }
        public Builder gitUrl(String gitUrl){
            this.obj.setGitUrl(gitUrl);
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
        public ProjectMgr build(){return obj;}
    }

}
