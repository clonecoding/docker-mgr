package com.jdddata.dockermgr.dao.modle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class ImagesMgr implements Serializable {

    private static final long serialVersionUID = 1532082697109L;


    /**
    * 
    * isNullAble:1
    */
    private String id;

    /**
    * 
    * isNullAble:1
    */
    private String imageName;

    /**
    * 
    * isNullAble:1
    */
    private String imageTag;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;


    public void setId(String id){this.id = id;}

    public String getId(){return this.id;}

    public void setImageName(String imageName){this.imageName = imageName;}

    public String getImageName(){return this.imageName;}

    public void setImageTag(String imageTag){this.imageTag = imageTag;}

    public String getImageTag(){return this.imageTag;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "com.jdddata.dockermgr.dao.modle.ImagesMgr{" +
                "id='" + id + '\'' +
                "imageName='" + imageName + '\'' +
                "imageTag='" + imageTag + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ImagesMgr set;

        private ConditionBuilder where;

        public UpdateBuilder set(ImagesMgr set){
            this.set = set;
            return this;
        }

        public ImagesMgr getSet(){
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

    public static class QueryBuilder extends ImagesMgr{
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
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

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

        public ImagesMgr build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> idList;

        public List<String> getIdList(){return this.idList;}


        private List<String> fuzzyId;

        public List<String> getFuzzyId(){return this.fuzzyId;}

        private List<String> rightFuzzyId;

        public List<String> getRightFuzzyId(){return this.rightFuzzyId;}
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
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


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

        private ImagesMgr obj;

        public Builder(){
            this.obj = new ImagesMgr();
        }

        public Builder id(String id){
            this.obj.setId(id);
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
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public ImagesMgr build(){return obj;}
    }

}
