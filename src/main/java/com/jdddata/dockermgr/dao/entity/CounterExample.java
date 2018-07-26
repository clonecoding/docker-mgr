package com.jdddata.dockermgr.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class CounterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounterExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupIsNull() {
            addCriterion("pipelineGroup is null");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupIsNotNull() {
            addCriterion("pipelineGroup is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupEqualTo(String value) {
            addCriterion("pipelineGroup =", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupNotEqualTo(String value) {
            addCriterion("pipelineGroup <>", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupGreaterThan(String value) {
            addCriterion("pipelineGroup >", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupGreaterThanOrEqualTo(String value) {
            addCriterion("pipelineGroup >=", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupLessThan(String value) {
            addCriterion("pipelineGroup <", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupLessThanOrEqualTo(String value) {
            addCriterion("pipelineGroup <=", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupLike(String value) {
            addCriterion("pipelineGroup like", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupNotLike(String value) {
            addCriterion("pipelineGroup not like", value, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupIn(List<String> values) {
            addCriterion("pipelineGroup in", values, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupNotIn(List<String> values) {
            addCriterion("pipelineGroup not in", values, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupBetween(String value1, String value2) {
            addCriterion("pipelineGroup between", value1, value2, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinegroupNotBetween(String value1, String value2) {
            addCriterion("pipelineGroup not between", value1, value2, "pipelinegroup");
            return (Criteria) this;
        }

        public Criteria andPipelinenameIsNull() {
            addCriterion("pipelineName is null");
            return (Criteria) this;
        }

        public Criteria andPipelinenameIsNotNull() {
            addCriterion("pipelineName is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinenameEqualTo(String value) {
            addCriterion("pipelineName =", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameNotEqualTo(String value) {
            addCriterion("pipelineName <>", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameGreaterThan(String value) {
            addCriterion("pipelineName >", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameGreaterThanOrEqualTo(String value) {
            addCriterion("pipelineName >=", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameLessThan(String value) {
            addCriterion("pipelineName <", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameLessThanOrEqualTo(String value) {
            addCriterion("pipelineName <=", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameLike(String value) {
            addCriterion("pipelineName like", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameNotLike(String value) {
            addCriterion("pipelineName not like", value, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameIn(List<String> values) {
            addCriterion("pipelineName in", values, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameNotIn(List<String> values) {
            addCriterion("pipelineName not in", values, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameBetween(String value1, String value2) {
            addCriterion("pipelineName between", value1, value2, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinenameNotBetween(String value1, String value2) {
            addCriterion("pipelineName not between", value1, value2, "pipelinename");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterIsNull() {
            addCriterion("pipelineCounter is null");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterIsNotNull() {
            addCriterion("pipelineCounter is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterEqualTo(String value) {
            addCriterion("pipelineCounter =", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterNotEqualTo(String value) {
            addCriterion("pipelineCounter <>", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterGreaterThan(String value) {
            addCriterion("pipelineCounter >", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterGreaterThanOrEqualTo(String value) {
            addCriterion("pipelineCounter >=", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterLessThan(String value) {
            addCriterion("pipelineCounter <", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterLessThanOrEqualTo(String value) {
            addCriterion("pipelineCounter <=", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterLike(String value) {
            addCriterion("pipelineCounter like", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterNotLike(String value) {
            addCriterion("pipelineCounter not like", value, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterIn(List<String> values) {
            addCriterion("pipelineCounter in", values, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterNotIn(List<String> values) {
            addCriterion("pipelineCounter not in", values, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterBetween(String value1, String value2) {
            addCriterion("pipelineCounter between", value1, value2, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andPipelinecounterNotBetween(String value1, String value2) {
            addCriterion("pipelineCounter not between", value1, value2, "pipelinecounter");
            return (Criteria) this;
        }

        public Criteria andStagenameIsNull() {
            addCriterion("stageName is null");
            return (Criteria) this;
        }

        public Criteria andStagenameIsNotNull() {
            addCriterion("stageName is not null");
            return (Criteria) this;
        }

        public Criteria andStagenameEqualTo(String value) {
            addCriterion("stageName =", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameNotEqualTo(String value) {
            addCriterion("stageName <>", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameGreaterThan(String value) {
            addCriterion("stageName >", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameGreaterThanOrEqualTo(String value) {
            addCriterion("stageName >=", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameLessThan(String value) {
            addCriterion("stageName <", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameLessThanOrEqualTo(String value) {
            addCriterion("stageName <=", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameLike(String value) {
            addCriterion("stageName like", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameNotLike(String value) {
            addCriterion("stageName not like", value, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameIn(List<String> values) {
            addCriterion("stageName in", values, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameNotIn(List<String> values) {
            addCriterion("stageName not in", values, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameBetween(String value1, String value2) {
            addCriterion("stageName between", value1, value2, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagenameNotBetween(String value1, String value2) {
            addCriterion("stageName not between", value1, value2, "stagename");
            return (Criteria) this;
        }

        public Criteria andStagecounterIsNull() {
            addCriterion("stageCounter is null");
            return (Criteria) this;
        }

        public Criteria andStagecounterIsNotNull() {
            addCriterion("stageCounter is not null");
            return (Criteria) this;
        }

        public Criteria andStagecounterEqualTo(String value) {
            addCriterion("stageCounter =", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterNotEqualTo(String value) {
            addCriterion("stageCounter <>", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterGreaterThan(String value) {
            addCriterion("stageCounter >", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterGreaterThanOrEqualTo(String value) {
            addCriterion("stageCounter >=", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterLessThan(String value) {
            addCriterion("stageCounter <", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterLessThanOrEqualTo(String value) {
            addCriterion("stageCounter <=", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterLike(String value) {
            addCriterion("stageCounter like", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterNotLike(String value) {
            addCriterion("stageCounter not like", value, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterIn(List<String> values) {
            addCriterion("stageCounter in", values, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterNotIn(List<String> values) {
            addCriterion("stageCounter not in", values, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterBetween(String value1, String value2) {
            addCriterion("stageCounter between", value1, value2, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andStagecounterNotBetween(String value1, String value2) {
            addCriterion("stageCounter not between", value1, value2, "stagecounter");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andClassfilerIsNull() {
            addCriterion("classfiler is null");
            return (Criteria) this;
        }

        public Criteria andClassfilerIsNotNull() {
            addCriterion("classfiler is not null");
            return (Criteria) this;
        }

        public Criteria andClassfilerEqualTo(String value) {
            addCriterion("classfiler =", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerNotEqualTo(String value) {
            addCriterion("classfiler <>", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerGreaterThan(String value) {
            addCriterion("classfiler >", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerGreaterThanOrEqualTo(String value) {
            addCriterion("classfiler >=", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerLessThan(String value) {
            addCriterion("classfiler <", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerLessThanOrEqualTo(String value) {
            addCriterion("classfiler <=", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerLike(String value) {
            addCriterion("classfiler like", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerNotLike(String value) {
            addCriterion("classfiler not like", value, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerIn(List<String> values) {
            addCriterion("classfiler in", values, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerNotIn(List<String> values) {
            addCriterion("classfiler not in", values, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerBetween(String value1, String value2) {
            addCriterion("classfiler between", value1, value2, "classfiler");
            return (Criteria) this;
        }

        public Criteria andClassfilerNotBetween(String value1, String value2) {
            addCriterion("classfiler not between", value1, value2, "classfiler");
            return (Criteria) this;
        }

        public Criteria andImagepushedIsNull() {
            addCriterion("imagePushed is null");
            return (Criteria) this;
        }

        public Criteria andImagepushedIsNotNull() {
            addCriterion("imagePushed is not null");
            return (Criteria) this;
        }

        public Criteria andImagepushedEqualTo(Boolean value) {
            addCriterion("imagePushed =", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedNotEqualTo(Boolean value) {
            addCriterion("imagePushed <>", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedGreaterThan(Boolean value) {
            addCriterion("imagePushed >", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("imagePushed >=", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedLessThan(Boolean value) {
            addCriterion("imagePushed <", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedLessThanOrEqualTo(Boolean value) {
            addCriterion("imagePushed <=", value, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedIn(List<Boolean> values) {
            addCriterion("imagePushed in", values, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedNotIn(List<Boolean> values) {
            addCriterion("imagePushed not in", values, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedBetween(Boolean value1, Boolean value2) {
            addCriterion("imagePushed between", value1, value2, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andImagepushedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("imagePushed not between", value1, value2, "imagepushed");
            return (Criteria) this;
        }

        public Criteria andEnvidIsNull() {
            addCriterion("envId is null");
            return (Criteria) this;
        }

        public Criteria andEnvidIsNotNull() {
            addCriterion("envId is not null");
            return (Criteria) this;
        }

        public Criteria andEnvidEqualTo(String value) {
            addCriterion("envId =", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotEqualTo(String value) {
            addCriterion("envId <>", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidGreaterThan(String value) {
            addCriterion("envId >", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidGreaterThanOrEqualTo(String value) {
            addCriterion("envId >=", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidLessThan(String value) {
            addCriterion("envId <", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidLessThanOrEqualTo(String value) {
            addCriterion("envId <=", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidLike(String value) {
            addCriterion("envId like", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotLike(String value) {
            addCriterion("envId not like", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidIn(List<String> values) {
            addCriterion("envId in", values, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotIn(List<String> values) {
            addCriterion("envId not in", values, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidBetween(String value1, String value2) {
            addCriterion("envId between", value1, value2, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotBetween(String value1, String value2) {
            addCriterion("envId not between", value1, value2, "envid");
            return (Criteria) this;
        }

        public Criteria andImagemgridIsNull() {
            addCriterion("imageMgrId is null");
            return (Criteria) this;
        }

        public Criteria andImagemgridIsNotNull() {
            addCriterion("imageMgrId is not null");
            return (Criteria) this;
        }

        public Criteria andImagemgridEqualTo(String value) {
            addCriterion("imageMgrId =", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridNotEqualTo(String value) {
            addCriterion("imageMgrId <>", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridGreaterThan(String value) {
            addCriterion("imageMgrId >", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridGreaterThanOrEqualTo(String value) {
            addCriterion("imageMgrId >=", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridLessThan(String value) {
            addCriterion("imageMgrId <", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridLessThanOrEqualTo(String value) {
            addCriterion("imageMgrId <=", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridLike(String value) {
            addCriterion("imageMgrId like", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridNotLike(String value) {
            addCriterion("imageMgrId not like", value, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridIn(List<String> values) {
            addCriterion("imageMgrId in", values, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridNotIn(List<String> values) {
            addCriterion("imageMgrId not in", values, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridBetween(String value1, String value2) {
            addCriterion("imageMgrId between", value1, value2, "imagemgrid");
            return (Criteria) this;
        }

        public Criteria andImagemgridNotBetween(String value1, String value2) {
            addCriterion("imageMgrId not between", value1, value2, "imagemgrid");
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