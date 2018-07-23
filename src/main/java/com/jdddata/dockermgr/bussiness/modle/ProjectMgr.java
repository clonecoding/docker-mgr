package com.jdddata.dockermgr.bussiness.modle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class ProjectMgr implements Serializable {

    private static final long serialVersionUID = 1532314048179L;


    /**
    * 主键
    * 自增ID
    * isNullAble:0
    */
    private Long id;

    /**
    * 项目Id
    * isNullAble:0
    */
    private String projectId;

    /**
    * 项目名称
    * isNullAble:1
    */
    private String projectName;

    /**
    * 项目组名
    * isNullAble:1
    */
    private String projectGroup;

    /**
    * 联系人名称
    * isNullAble:1
    */
    private String contactName;

    /**
    * 联系人手机
    * isNullAble:1
    */
    private String contactMobile;

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

    public void setProjectId(String projectId){this.projectId = projectId;}

    public String getProjectId(){return this.projectId;}

    public void setProjectName(String projectName){this.projectName = projectName;}

    public String getProjectName(){return this.projectName;}

    public void setProjectGroup(String projectGroup){this.projectGroup = projectGroup;}

    public String getProjectGroup(){return this.projectGroup;}

    public void setContactName(String contactName){this.contactName = contactName;}

    public String getContactName(){return this.contactName;}

    public void setContactMobile(String contactMobile){this.contactMobile = contactMobile;}

    public String getContactMobile(){return this.contactMobile;}

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
        return "com.jdddata.dockermgr.bussiness.modle.ProjectMgr{" +
                "id='" + id + '\'' +
                "projectId='" + projectId + '\'' +
                "projectName='" + projectName + '\'' +
                "projectGroup='" + projectGroup + '\'' +
                "contactName='" + contactName + '\'' +
                "contactMobile='" + contactMobile + '\'' +
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

        private List<String> projectIdList;

        public List<String> getProjectIdList(){return this.projectIdList;}


        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId(){return this.fuzzyProjectId;}

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId(){return this.rightFuzzyProjectId;}
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

        private List<String> projectIdList;

        public List<String> getProjectIdList(){return this.projectIdList;}


        private List<String> fuzzyProjectId;

        public List<String> getFuzzyProjectId(){return this.fuzzyProjectId;}

        private List<String> rightFuzzyProjectId;

        public List<String> getRightFuzzyProjectId(){return this.rightFuzzyProjectId;}
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
        public Builder projectId(String projectId){
            this.obj.setProjectId(projectId);
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
