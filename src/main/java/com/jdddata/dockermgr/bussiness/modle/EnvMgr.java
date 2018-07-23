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
public class EnvMgr implements Serializable {

    private static final long serialVersionUID = 1532082689822L;


    /**
    * 
    * isNullAble:1
    */
    private String id;

    /**
    * 
    * isNullAble:1
    */
    private String serverAddress;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime startTime;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setServerAddress(String serverAddress){this.serverAddress = serverAddress;}

    public String getServerAddress(){return this.serverAddress;}

    public void setStartTime(java.time.LocalDateTime startTime){this.startTime = startTime;}

    public java.time.LocalDateTime getStartTime(){return this.startTime;}
    @Override
    public String toString() {
        return "com.jdddata.dockermgr.bussiness.modle.EnvMgr{" +
                "id='" + id + '\'' +
                "serverAddress='" + serverAddress + '\'' +
                "startTime='" + startTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private EnvMgr set;

        private ConditionBuilder where;

        public UpdateBuilder set(EnvMgr set){
            this.set = set;
            return this;
        }

        public EnvMgr getSet(){
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

    public static class QueryBuilder extends EnvMgr{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> serverAddressList;

        public List<String> getServerAddressList(){return this.serverAddressList;}


        private List<String> fuzzyServerAddress;

        public List<String> getFuzzyServerAddress(){return this.fuzzyServerAddress;}

        private List<String> rightFuzzyServerAddress;

        public List<String> getRightFuzzyServerAddress(){return this.rightFuzzyServerAddress;}
        private List<java.time.LocalDateTime> startTimeList;

        public List<java.time.LocalDateTime> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDateTime startTimeSt;

        private java.time.LocalDateTime startTimeEd;

        public java.time.LocalDateTime getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDateTime getStartTimeEd(){return this.startTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public QueryBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public QueryBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public QueryBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public QueryBuilder id(String id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<String> id){
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

        public QueryBuilder fuzzyServerAddress (List<String> fuzzyServerAddress){
            this.fuzzyServerAddress = fuzzyServerAddress;
            return this;
        }

        public QueryBuilder fuzzyServerAddress (String ... fuzzyServerAddress){
            this.fuzzyServerAddress = solveNullList(fuzzyServerAddress);
            return this;
        }

        public QueryBuilder rightFuzzyServerAddress (List<String> rightFuzzyServerAddress){
            this.rightFuzzyServerAddress = rightFuzzyServerAddress;
            return this;
        }

        public QueryBuilder rightFuzzyServerAddress (String ... rightFuzzyServerAddress){
            this.rightFuzzyServerAddress = solveNullList(rightFuzzyServerAddress);
            return this;
        }

        public QueryBuilder serverAddress(String serverAddress){
            setServerAddress(serverAddress);
            return this;
        }

        public QueryBuilder serverAddressList(String ... serverAddress){
            this.serverAddressList = solveNullList(serverAddress);
            return this;
        }

        public QueryBuilder serverAddressList(List<String> serverAddress){
            this.serverAddressList = serverAddress;
            return this;
        }

        public QueryBuilder fetchServerAddress(){
            setFetchFields("fetchFields","serverAddress");
            return this;
        }

        public QueryBuilder excludeServerAddress(){
            setFetchFields("excludeFields","serverAddress");
            return this;
        }

        public QueryBuilder startTimeBetWeen(java.time.LocalDateTime startTimeSt,java.time.LocalDateTime startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public QueryBuilder startTimeGreaterEqThan(java.time.LocalDateTime startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public QueryBuilder startTimeLessEqThan(java.time.LocalDateTime startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public QueryBuilder startTime(java.time.LocalDateTime startTime){
            setStartTime(startTime);
            return this;
        }

        public QueryBuilder startTimeList(java.time.LocalDateTime ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public QueryBuilder startTimeList(List<java.time.LocalDateTime> startTime){
            this.startTimeList = startTime;
            return this;
        }

        public QueryBuilder fetchStartTime(){
            setFetchFields("fetchFields","startTime");
            return this;
        }

        public QueryBuilder excludeStartTime(){
            setFetchFields("excludeFields","startTime");
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

        public EnvMgr build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> serverAddressList;

        public List<String> getServerAddressList(){return this.serverAddressList;}


        private List<String> fuzzyServerAddress;

        public List<String> getFuzzyServerAddress(){return this.fuzzyServerAddress;}

        private List<String> rightFuzzyServerAddress;

        public List<String> getRightFuzzyServerAddress(){return this.rightFuzzyServerAddress;}
        private List<java.time.LocalDateTime> startTimeList;

        public List<java.time.LocalDateTime> getStartTimeList(){return this.startTimeList;}

        private java.time.LocalDateTime startTimeSt;

        private java.time.LocalDateTime startTimeEd;

        public java.time.LocalDateTime getStartTimeSt(){return this.startTimeSt;}

        public java.time.LocalDateTime getStartTimeEd(){return this.startTimeEd;}


        public ConditionBuilder fuzzyId (List<String> fuzzyId){
            this.fuzzyId = fuzzyId;
            return this;
        }

        public ConditionBuilder fuzzyId (String ... fuzzyId){
            this.fuzzyId = solveNullList(fuzzyId);
            return this;
        }

        public ConditionBuilder rightFuzzyId (List<String> rightFuzzyId){
            this.rightFuzzyId = rightFuzzyId;
            return this;
        }

        public ConditionBuilder rightFuzzyId (String ... rightFuzzyId){
            this.rightFuzzyId = solveNullList(rightFuzzyId);
            return this;
        }

        public ConditionBuilder idList(String ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<String> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyServerAddress (List<String> fuzzyServerAddress){
            this.fuzzyServerAddress = fuzzyServerAddress;
            return this;
        }

        public ConditionBuilder fuzzyServerAddress (String ... fuzzyServerAddress){
            this.fuzzyServerAddress = solveNullList(fuzzyServerAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyServerAddress (List<String> rightFuzzyServerAddress){
            this.rightFuzzyServerAddress = rightFuzzyServerAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyServerAddress (String ... rightFuzzyServerAddress){
            this.rightFuzzyServerAddress = solveNullList(rightFuzzyServerAddress);
            return this;
        }

        public ConditionBuilder serverAddressList(String ... serverAddress){
            this.serverAddressList = solveNullList(serverAddress);
            return this;
        }

        public ConditionBuilder serverAddressList(List<String> serverAddress){
            this.serverAddressList = serverAddress;
            return this;
        }

        public ConditionBuilder startTimeBetWeen(java.time.LocalDateTime startTimeSt,java.time.LocalDateTime startTimeEd){
            this.startTimeSt = startTimeSt;
            this.startTimeEd = startTimeEd;
            return this;
        }

        public ConditionBuilder startTimeGreaterEqThan(java.time.LocalDateTime startTimeSt){
            this.startTimeSt = startTimeSt;
            return this;
        }
        public ConditionBuilder startTimeLessEqThan(java.time.LocalDateTime startTimeEd){
            this.startTimeEd = startTimeEd;
            return this;
        }


        public ConditionBuilder startTimeList(java.time.LocalDateTime ... startTime){
            this.startTimeList = solveNullList(startTime);
            return this;
        }

        public ConditionBuilder startTimeList(List<java.time.LocalDateTime> startTime){
            this.startTimeList = startTime;
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

        private EnvMgr obj;

        public Builder(){
            this.obj = new EnvMgr();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder serverAddress(String serverAddress){
            this.obj.setServerAddress(serverAddress);
            return this;
        }
        public Builder startTime(java.time.LocalDateTime startTime){
            this.obj.setStartTime(startTime);
            return this;
        }
        public EnvMgr build(){return obj;}
    }

}
