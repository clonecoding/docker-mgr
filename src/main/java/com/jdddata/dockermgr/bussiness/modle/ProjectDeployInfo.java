package com.jdddata.dockermgr.bussiness.modle;

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

    private static final long serialVersionUID = 1532324403260L;


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


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setProjectId(String projectId){this.projectId = projectId;}

    public String getProjectId(){return this.projectId;}

    public void setContainerIp(String containerIp){this.containerIp = containerIp;}

    public String getContainerIp(){return this.containerIp;}

    public void setEnv(String env){this.env = env;}

    public String getEnv(){return this.env;}
    @Override
    public String toString() {
        return "ProjectDeployInfo{" +
                "id='" + id + '\'' +
                "projectId='" + projectId + '\'' +
                "containerIp='" + containerIp + '\'' +
                "env='" + env + '\'' +
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
        private List<String> containerIpList;

        public List<String> getContainerIpList(){return this.containerIpList;}


        private List<String> fuzzyContainerIp;

        public List<String> getFuzzyContainerIp(){return this.fuzzyContainerIp;}

        private List<String> rightFuzzyContainerIp;

        public List<String> getRightFuzzyContainerIp(){return this.rightFuzzyContainerIp;}
        private List<String> envList;

        public List<String> getEnvList(){return this.envList;}


        private List<String> fuzzyEnv;

        public List<String> getFuzzyEnv(){return this.fuzzyEnv;}

        private List<String> rightFuzzyEnv;

        public List<String> getRightFuzzyEnv(){return this.rightFuzzyEnv;}
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

        public QueryBuilder fuzzyContainerIp (List<String> fuzzyContainerIp){
            this.fuzzyContainerIp = fuzzyContainerIp;
            return this;
        }

        public QueryBuilder fuzzyContainerIp (String ... fuzzyContainerIp){
            this.fuzzyContainerIp = solveNullList(fuzzyContainerIp);
            return this;
        }

        public QueryBuilder rightFuzzyContainerIp (List<String> rightFuzzyContainerIp){
            this.rightFuzzyContainerIp = rightFuzzyContainerIp;
            return this;
        }

        public QueryBuilder rightFuzzyContainerIp (String ... rightFuzzyContainerIp){
            this.rightFuzzyContainerIp = solveNullList(rightFuzzyContainerIp);
            return this;
        }

        public QueryBuilder containerIp(String containerIp){
            setContainerIp(containerIp);
            return this;
        }

        public QueryBuilder containerIpList(String ... containerIp){
            this.containerIpList = solveNullList(containerIp);
            return this;
        }

        public QueryBuilder containerIpList(List<String> containerIp){
            this.containerIpList = containerIp;
            return this;
        }

        public QueryBuilder fetchContainerIp(){
            setFetchFields("fetchFields","containerIp");
            return this;
        }

        public QueryBuilder excludeContainerIp(){
            setFetchFields("excludeFields","containerIp");
            return this;
        }

        public QueryBuilder fuzzyEnv (List<String> fuzzyEnv){
            this.fuzzyEnv = fuzzyEnv;
            return this;
        }

        public QueryBuilder fuzzyEnv (String ... fuzzyEnv){
            this.fuzzyEnv = solveNullList(fuzzyEnv);
            return this;
        }

        public QueryBuilder rightFuzzyEnv (List<String> rightFuzzyEnv){
            this.rightFuzzyEnv = rightFuzzyEnv;
            return this;
        }

        public QueryBuilder rightFuzzyEnv (String ... rightFuzzyEnv){
            this.rightFuzzyEnv = solveNullList(rightFuzzyEnv);
            return this;
        }

        public QueryBuilder env(String env){
            setEnv(env);
            return this;
        }

        public QueryBuilder envList(String ... env){
            this.envList = solveNullList(env);
            return this;
        }

        public QueryBuilder envList(List<String> env){
            this.envList = env;
            return this;
        }

        public QueryBuilder fetchEnv(){
            setFetchFields("fetchFields","env");
            return this;
        }

        public QueryBuilder excludeEnv(){
            setFetchFields("excludeFields","env");
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
        private List<String> containerIpList;

        public List<String> getContainerIpList(){return this.containerIpList;}


        private List<String> fuzzyContainerIp;

        public List<String> getFuzzyContainerIp(){return this.fuzzyContainerIp;}

        private List<String> rightFuzzyContainerIp;

        public List<String> getRightFuzzyContainerIp(){return this.rightFuzzyContainerIp;}
        private List<String> envList;

        public List<String> getEnvList(){return this.envList;}


        private List<String> fuzzyEnv;

        public List<String> getFuzzyEnv(){return this.fuzzyEnv;}

        private List<String> rightFuzzyEnv;

        public List<String> getRightFuzzyEnv(){return this.rightFuzzyEnv;}

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

        public ConditionBuilder fuzzyContainerIp (List<String> fuzzyContainerIp){
            this.fuzzyContainerIp = fuzzyContainerIp;
            return this;
        }

        public ConditionBuilder fuzzyContainerIp (String ... fuzzyContainerIp){
            this.fuzzyContainerIp = solveNullList(fuzzyContainerIp);
            return this;
        }

        public ConditionBuilder rightFuzzyContainerIp (List<String> rightFuzzyContainerIp){
            this.rightFuzzyContainerIp = rightFuzzyContainerIp;
            return this;
        }

        public ConditionBuilder rightFuzzyContainerIp (String ... rightFuzzyContainerIp){
            this.rightFuzzyContainerIp = solveNullList(rightFuzzyContainerIp);
            return this;
        }

        public ConditionBuilder containerIpList(String ... containerIp){
            this.containerIpList = solveNullList(containerIp);
            return this;
        }

        public ConditionBuilder containerIpList(List<String> containerIp){
            this.containerIpList = containerIp;
            return this;
        }

        public ConditionBuilder fuzzyEnv (List<String> fuzzyEnv){
            this.fuzzyEnv = fuzzyEnv;
            return this;
        }

        public ConditionBuilder fuzzyEnv (String ... fuzzyEnv){
            this.fuzzyEnv = solveNullList(fuzzyEnv);
            return this;
        }

        public ConditionBuilder rightFuzzyEnv (List<String> rightFuzzyEnv){
            this.rightFuzzyEnv = rightFuzzyEnv;
            return this;
        }

        public ConditionBuilder rightFuzzyEnv (String ... rightFuzzyEnv){
            this.rightFuzzyEnv = solveNullList(rightFuzzyEnv);
            return this;
        }

        public ConditionBuilder envList(String ... env){
            this.envList = solveNullList(env);
            return this;
        }

        public ConditionBuilder envList(List<String> env){
            this.envList = env;
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
        public Builder containerIp(String containerIp){
            this.obj.setContainerIp(containerIp);
            return this;
        }
        public Builder env(String env){
            this.obj.setEnv(env);
            return this;
        }
        public ProjectDeployInfo build(){return obj;}
    }

}
