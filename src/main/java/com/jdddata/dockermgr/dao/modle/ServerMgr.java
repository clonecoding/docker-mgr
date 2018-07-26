package com.jdddata.dockermgr.dao.modle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author gzw
*/
public class ServerMgr implements Serializable {

    private static final long serialVersionUID = 1532342075170L;


    /**
    * 
    * isNullAble:1
    */
    private String id;

    /**
    * 
    * isNullAble:1
    */
    private String typeName;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime addTime;

    /**
    * 基础组.加工组.接口组.中间件.公共组
    * isNullAble:1
    */
    private String belong;

    /**
    * 
    * isNullAble:1
    */
    private String ip;

    /**
    * 
    * isNullAble:1
    */
    private Integer port;

    /**
    * 
    * isNullAble:1
    */
    private String username;

    /**
    * 
    * isNullAble:1
    */
    private String password;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setTypeName(String typeName){this.typeName = typeName;}

    public String getTypeName(){return this.typeName;}

    public void setAddTime(java.time.LocalDateTime addTime){this.addTime = addTime;}

    public java.time.LocalDateTime getAddTime(){return this.addTime;}

    public void setBelong(String belong){this.belong = belong;}

    public String getBelong(){return this.belong;}

    public void setIp(String ip){this.ip = ip;}

    public String getIp(){return this.ip;}

    public void setPort(Integer port){this.port = port;}

    public Integer getPort(){return this.port;}

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return this.username;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}
    @Override
    public String toString() {
        return "ServerMgr{" +
                "id='" + id + '\'' +
                "typeName='" + typeName + '\'' +
                "addTime='" + addTime + '\'' +
                "belong='" + belong + '\'' +
                "ip='" + ip + '\'' +
                "port='" + port + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ServerMgr set;

        private ConditionBuilder where;

        public UpdateBuilder set(ServerMgr set){
            this.set = set;
            return this;
        }

        public ServerMgr getSet(){
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

    public static class QueryBuilder extends ServerMgr{
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
        private List<String> typeNameList;

        public List<String> getTypeNameList(){return this.typeNameList;}


        private List<String> fuzzyTypeName;

        public List<String> getFuzzyTypeName(){return this.fuzzyTypeName;}

        private List<String> rightFuzzyTypeName;

        public List<String> getRightFuzzyTypeName(){return this.rightFuzzyTypeName;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> belongList;

        public List<String> getBelongList(){return this.belongList;}


        private List<String> fuzzyBelong;

        public List<String> getFuzzyBelong(){return this.fuzzyBelong;}

        private List<String> rightFuzzyBelong;

        public List<String> getRightFuzzyBelong(){return this.rightFuzzyBelong;}
        private List<String> ipList;

        public List<String> getIpList(){return this.ipList;}


        private List<String> fuzzyIp;

        public List<String> getFuzzyIp(){return this.fuzzyIp;}

        private List<String> rightFuzzyIp;

        public List<String> getRightFuzzyIp(){return this.rightFuzzyIp;}
        private List<Integer> portList;

        public List<Integer> getPortList(){return this.portList;}

        private Integer portSt;

        private Integer portEd;

        public Integer getPortSt(){return this.portSt;}

        public Integer getPortEd(){return this.portEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
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

        public QueryBuilder fuzzyTypeName (List<String> fuzzyTypeName){
            this.fuzzyTypeName = fuzzyTypeName;
            return this;
        }

        public QueryBuilder fuzzyTypeName (String ... fuzzyTypeName){
            this.fuzzyTypeName = solveNullList(fuzzyTypeName);
            return this;
        }

        public QueryBuilder rightFuzzyTypeName (List<String> rightFuzzyTypeName){
            this.rightFuzzyTypeName = rightFuzzyTypeName;
            return this;
        }

        public QueryBuilder rightFuzzyTypeName (String ... rightFuzzyTypeName){
            this.rightFuzzyTypeName = solveNullList(rightFuzzyTypeName);
            return this;
        }

        public QueryBuilder typeName(String typeName){
            setTypeName(typeName);
            return this;
        }

        public QueryBuilder typeNameList(String ... typeName){
            this.typeNameList = solveNullList(typeName);
            return this;
        }

        public QueryBuilder typeNameList(List<String> typeName){
            this.typeNameList = typeName;
            return this;
        }

        public QueryBuilder fetchTypeName(){
            setFetchFields("fetchFields","typeName");
            return this;
        }

        public QueryBuilder excludeTypeName(){
            setFetchFields("excludeFields","typeName");
            return this;
        }

        public QueryBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public QueryBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public QueryBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public QueryBuilder addTime(java.time.LocalDateTime addTime){
            setAddTime(addTime);
            return this;
        }

        public QueryBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public QueryBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public QueryBuilder fetchAddTime(){
            setFetchFields("fetchFields","addTime");
            return this;
        }

        public QueryBuilder excludeAddTime(){
            setFetchFields("excludeFields","addTime");
            return this;
        }

        public QueryBuilder fuzzyBelong (List<String> fuzzyBelong){
            this.fuzzyBelong = fuzzyBelong;
            return this;
        }

        public QueryBuilder fuzzyBelong (String ... fuzzyBelong){
            this.fuzzyBelong = solveNullList(fuzzyBelong);
            return this;
        }

        public QueryBuilder rightFuzzyBelong (List<String> rightFuzzyBelong){
            this.rightFuzzyBelong = rightFuzzyBelong;
            return this;
        }

        public QueryBuilder rightFuzzyBelong (String ... rightFuzzyBelong){
            this.rightFuzzyBelong = solveNullList(rightFuzzyBelong);
            return this;
        }

        public QueryBuilder belong(String belong){
            setBelong(belong);
            return this;
        }

        public QueryBuilder belongList(String ... belong){
            this.belongList = solveNullList(belong);
            return this;
        }

        public QueryBuilder belongList(List<String> belong){
            this.belongList = belong;
            return this;
        }

        public QueryBuilder fetchBelong(){
            setFetchFields("fetchFields","belong");
            return this;
        }

        public QueryBuilder excludeBelong(){
            setFetchFields("excludeFields","belong");
            return this;
        }

        public QueryBuilder fuzzyIp (List<String> fuzzyIp){
            this.fuzzyIp = fuzzyIp;
            return this;
        }

        public QueryBuilder fuzzyIp (String ... fuzzyIp){
            this.fuzzyIp = solveNullList(fuzzyIp);
            return this;
        }

        public QueryBuilder rightFuzzyIp (List<String> rightFuzzyIp){
            this.rightFuzzyIp = rightFuzzyIp;
            return this;
        }

        public QueryBuilder rightFuzzyIp (String ... rightFuzzyIp){
            this.rightFuzzyIp = solveNullList(rightFuzzyIp);
            return this;
        }

        public QueryBuilder ip(String ip){
            setIp(ip);
            return this;
        }

        public QueryBuilder ipList(String ... ip){
            this.ipList = solveNullList(ip);
            return this;
        }

        public QueryBuilder ipList(List<String> ip){
            this.ipList = ip;
            return this;
        }

        public QueryBuilder fetchIp(){
            setFetchFields("fetchFields","ip");
            return this;
        }

        public QueryBuilder excludeIp(){
            setFetchFields("excludeFields","ip");
            return this;
        }

        public QueryBuilder portBetWeen(Integer portSt,Integer portEd){
            this.portSt = portSt;
            this.portEd = portEd;
            return this;
        }

        public QueryBuilder portGreaterEqThan(Integer portSt){
            this.portSt = portSt;
            return this;
        }
        public QueryBuilder portLessEqThan(Integer portEd){
            this.portEd = portEd;
            return this;
        }


        public QueryBuilder port(Integer port){
            setPort(port);
            return this;
        }

        public QueryBuilder portList(Integer ... port){
            this.portList = solveNullList(port);
            return this;
        }

        public QueryBuilder portList(List<Integer> port){
            this.portList = port;
            return this;
        }

        public QueryBuilder fetchPort(){
            setFetchFields("fetchFields","port");
            return this;
        }

        public QueryBuilder excludePort(){
            setFetchFields("excludeFields","port");
            return this;
        }

        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
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

        public ServerMgr build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
        private List<String> typeNameList;

        public List<String> getTypeNameList(){return this.typeNameList;}


        private List<String> fuzzyTypeName;

        public List<String> getFuzzyTypeName(){return this.fuzzyTypeName;}

        private List<String> rightFuzzyTypeName;

        public List<String> getRightFuzzyTypeName(){return this.rightFuzzyTypeName;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> belongList;

        public List<String> getBelongList(){return this.belongList;}


        private List<String> fuzzyBelong;

        public List<String> getFuzzyBelong(){return this.fuzzyBelong;}

        private List<String> rightFuzzyBelong;

        public List<String> getRightFuzzyBelong(){return this.rightFuzzyBelong;}
        private List<String> ipList;

        public List<String> getIpList(){return this.ipList;}


        private List<String> fuzzyIp;

        public List<String> getFuzzyIp(){return this.fuzzyIp;}

        private List<String> rightFuzzyIp;

        public List<String> getRightFuzzyIp(){return this.rightFuzzyIp;}
        private List<Integer> portList;

        public List<Integer> getPortList(){return this.portList;}

        private Integer portSt;

        private Integer portEd;

        public Integer getPortSt(){return this.portSt;}

        public Integer getPortEd(){return this.portEd;}

        private List<String> usernameList;

        public List<String> getUsernameList(){return this.usernameList;}


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){return this.fuzzyUsername;}

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){return this.rightFuzzyUsername;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}

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

        public ConditionBuilder fuzzyTypeName (List<String> fuzzyTypeName){
            this.fuzzyTypeName = fuzzyTypeName;
            return this;
        }

        public ConditionBuilder fuzzyTypeName (String ... fuzzyTypeName){
            this.fuzzyTypeName = solveNullList(fuzzyTypeName);
            return this;
        }

        public ConditionBuilder rightFuzzyTypeName (List<String> rightFuzzyTypeName){
            this.rightFuzzyTypeName = rightFuzzyTypeName;
            return this;
        }

        public ConditionBuilder rightFuzzyTypeName (String ... rightFuzzyTypeName){
            this.rightFuzzyTypeName = solveNullList(rightFuzzyTypeName);
            return this;
        }

        public ConditionBuilder typeNameList(String ... typeName){
            this.typeNameList = solveNullList(typeName);
            return this;
        }

        public ConditionBuilder typeNameList(List<String> typeName){
            this.typeNameList = typeName;
            return this;
        }

        public ConditionBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public ConditionBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public ConditionBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public ConditionBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public ConditionBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public ConditionBuilder fuzzyBelong (List<String> fuzzyBelong){
            this.fuzzyBelong = fuzzyBelong;
            return this;
        }

        public ConditionBuilder fuzzyBelong (String ... fuzzyBelong){
            this.fuzzyBelong = solveNullList(fuzzyBelong);
            return this;
        }

        public ConditionBuilder rightFuzzyBelong (List<String> rightFuzzyBelong){
            this.rightFuzzyBelong = rightFuzzyBelong;
            return this;
        }

        public ConditionBuilder rightFuzzyBelong (String ... rightFuzzyBelong){
            this.rightFuzzyBelong = solveNullList(rightFuzzyBelong);
            return this;
        }

        public ConditionBuilder belongList(String ... belong){
            this.belongList = solveNullList(belong);
            return this;
        }

        public ConditionBuilder belongList(List<String> belong){
            this.belongList = belong;
            return this;
        }

        public ConditionBuilder fuzzyIp (List<String> fuzzyIp){
            this.fuzzyIp = fuzzyIp;
            return this;
        }

        public ConditionBuilder fuzzyIp (String ... fuzzyIp){
            this.fuzzyIp = solveNullList(fuzzyIp);
            return this;
        }

        public ConditionBuilder rightFuzzyIp (List<String> rightFuzzyIp){
            this.rightFuzzyIp = rightFuzzyIp;
            return this;
        }

        public ConditionBuilder rightFuzzyIp (String ... rightFuzzyIp){
            this.rightFuzzyIp = solveNullList(rightFuzzyIp);
            return this;
        }

        public ConditionBuilder ipList(String ... ip){
            this.ipList = solveNullList(ip);
            return this;
        }

        public ConditionBuilder ipList(List<String> ip){
            this.ipList = ip;
            return this;
        }

        public ConditionBuilder portBetWeen(Integer portSt,Integer portEd){
            this.portSt = portSt;
            this.portEd = portEd;
            return this;
        }

        public ConditionBuilder portGreaterEqThan(Integer portSt){
            this.portSt = portSt;
            return this;
        }
        public ConditionBuilder portLessEqThan(Integer portEd){
            this.portEd = portEd;
            return this;
        }


        public ConditionBuilder portList(Integer ... port){
            this.portList = solveNullList(port);
            return this;
        }

        public ConditionBuilder portList(List<Integer> port){
            this.portList = port;
            return this;
        }

        public ConditionBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername (String ... fuzzyUsername){
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
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

        private ServerMgr obj;

        public Builder(){
            this.obj = new ServerMgr();
        }

        public Builder id(String id){
            this.obj.setId(id);
            return this;
        }
        public Builder typeName(String typeName){
            this.obj.setTypeName(typeName);
            return this;
        }
        public Builder addTime(java.time.LocalDateTime addTime){
            this.obj.setAddTime(addTime);
            return this;
        }
        public Builder belong(String belong){
            this.obj.setBelong(belong);
            return this;
        }
        public Builder ip(String ip){
            this.obj.setIp(ip);
            return this;
        }
        public Builder port(Integer port){
            this.obj.setPort(port);
            return this;
        }
        public Builder username(String username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public ServerMgr build(){return obj;}
    }

}
