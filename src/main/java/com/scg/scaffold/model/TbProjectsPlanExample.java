package com.scg.scaffold.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProjectsPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProjectsPlanExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andUpBarIsNull() {
            addCriterion("up_bar is null");
            return (Criteria) this;
        }

        public Criteria andUpBarIsNotNull() {
            addCriterion("up_bar is not null");
            return (Criteria) this;
        }

        public Criteria andUpBarEqualTo(BigDecimal value) {
            addCriterion("up_bar =", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarNotEqualTo(BigDecimal value) {
            addCriterion("up_bar <>", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarGreaterThan(BigDecimal value) {
            addCriterion("up_bar >", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("up_bar >=", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarLessThan(BigDecimal value) {
            addCriterion("up_bar <", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("up_bar <=", value, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarIn(List<BigDecimal> values) {
            addCriterion("up_bar in", values, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarNotIn(List<BigDecimal> values) {
            addCriterion("up_bar not in", values, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_bar between", value1, value2, "upBar");
            return (Criteria) this;
        }

        public Criteria andUpBarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("up_bar not between", value1, value2, "upBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarIsNull() {
            addCriterion("horizontal_bar is null");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarIsNotNull() {
            addCriterion("horizontal_bar is not null");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarEqualTo(BigDecimal value) {
            addCriterion("horizontal_bar =", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarNotEqualTo(BigDecimal value) {
            addCriterion("horizontal_bar <>", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarGreaterThan(BigDecimal value) {
            addCriterion("horizontal_bar >", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("horizontal_bar >=", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarLessThan(BigDecimal value) {
            addCriterion("horizontal_bar <", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("horizontal_bar <=", value, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarIn(List<BigDecimal> values) {
            addCriterion("horizontal_bar in", values, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarNotIn(List<BigDecimal> values) {
            addCriterion("horizontal_bar not in", values, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("horizontal_bar between", value1, value2, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andHorizontalBarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("horizontal_bar not between", value1, value2, "horizontalBar");
            return (Criteria) this;
        }

        public Criteria andVerticalRampIsNull() {
            addCriterion("vertical_ramp is null");
            return (Criteria) this;
        }

        public Criteria andVerticalRampIsNotNull() {
            addCriterion("vertical_ramp is not null");
            return (Criteria) this;
        }

        public Criteria andVerticalRampEqualTo(BigDecimal value) {
            addCriterion("vertical_ramp =", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampNotEqualTo(BigDecimal value) {
            addCriterion("vertical_ramp <>", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampGreaterThan(BigDecimal value) {
            addCriterion("vertical_ramp >", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vertical_ramp >=", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampLessThan(BigDecimal value) {
            addCriterion("vertical_ramp <", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vertical_ramp <=", value, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampIn(List<BigDecimal> values) {
            addCriterion("vertical_ramp in", values, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampNotIn(List<BigDecimal> values) {
            addCriterion("vertical_ramp not in", values, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vertical_ramp between", value1, value2, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andVerticalRampNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vertical_ramp not between", value1, value2, "verticalRamp");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(BigDecimal value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(BigDecimal value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(BigDecimal value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(BigDecimal value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<BigDecimal> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<BigDecimal> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeIsNull() {
            addCriterion("enter_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeIsNotNull() {
            addCriterion("enter_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeEqualTo(Date value) {
            addCriterion("enter_end_time =", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeNotEqualTo(Date value) {
            addCriterion("enter_end_time <>", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeGreaterThan(Date value) {
            addCriterion("enter_end_time >", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_end_time >=", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeLessThan(Date value) {
            addCriterion("enter_end_time <", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_end_time <=", value, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeIn(List<Date> values) {
            addCriterion("enter_end_time in", values, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeNotIn(List<Date> values) {
            addCriterion("enter_end_time not in", values, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeBetween(Date value1, Date value2) {
            addCriterion("enter_end_time between", value1, value2, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_end_time not between", value1, value2, "enterEndTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeIsNull() {
            addCriterion("enter_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeIsNotNull() {
            addCriterion("enter_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeEqualTo(Date value) {
            addCriterion("enter_start_time =", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeNotEqualTo(Date value) {
            addCriterion("enter_start_time <>", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeGreaterThan(Date value) {
            addCriterion("enter_start_time >", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_start_time >=", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeLessThan(Date value) {
            addCriterion("enter_start_time <", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_start_time <=", value, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeIn(List<Date> values) {
            addCriterion("enter_start_time in", values, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeNotIn(List<Date> values) {
            addCriterion("enter_start_time not in", values, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeBetween(Date value1, Date value2) {
            addCriterion("enter_start_time between", value1, value2, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andEnterStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_start_time not between", value1, value2, "enterStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeIsNull() {
            addCriterion("exit_start_time is null");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeIsNotNull() {
            addCriterion("exit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeEqualTo(Date value) {
            addCriterion("exit_start_time =", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeNotEqualTo(Date value) {
            addCriterion("exit_start_time <>", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeGreaterThan(Date value) {
            addCriterion("exit_start_time >", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_start_time >=", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeLessThan(Date value) {
            addCriterion("exit_start_time <", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("exit_start_time <=", value, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeIn(List<Date> values) {
            addCriterion("exit_start_time in", values, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeNotIn(List<Date> values) {
            addCriterion("exit_start_time not in", values, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeBetween(Date value1, Date value2) {
            addCriterion("exit_start_time between", value1, value2, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("exit_start_time not between", value1, value2, "exitStartTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeIsNull() {
            addCriterion("exit_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeIsNotNull() {
            addCriterion("exit_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeEqualTo(Date value) {
            addCriterion("exit_end_time =", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeNotEqualTo(Date value) {
            addCriterion("exit_end_time <>", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeGreaterThan(Date value) {
            addCriterion("exit_end_time >", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_end_time >=", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeLessThan(Date value) {
            addCriterion("exit_end_time <", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("exit_end_time <=", value, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeIn(List<Date> values) {
            addCriterion("exit_end_time in", values, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeNotIn(List<Date> values) {
            addCriterion("exit_end_time not in", values, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeBetween(Date value1, Date value2) {
            addCriterion("exit_end_time between", value1, value2, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andExitEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("exit_end_time not between", value1, value2, "exitEndTime");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNull() {
            addCriterion("created_on is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIsNotNull() {
            addCriterion("created_on is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOnEqualTo(Date value) {
            addCriterion("created_on =", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotEqualTo(Date value) {
            addCriterion("created_on <>", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThan(Date value) {
            addCriterion("created_on >", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("created_on >=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThan(Date value) {
            addCriterion("created_on <", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnLessThanOrEqualTo(Date value) {
            addCriterion("created_on <=", value, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnIn(List<Date> values) {
            addCriterion("created_on in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotIn(List<Date> values) {
            addCriterion("created_on not in", values, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnBetween(Date value1, Date value2) {
            addCriterion("created_on between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedOnNotBetween(Date value1, Date value2) {
            addCriterion("created_on not between", value1, value2, "createdOn");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andModifiedOnIsNull() {
            addCriterion("modified_on is null");
            return (Criteria) this;
        }

        public Criteria andModifiedOnIsNotNull() {
            addCriterion("modified_on is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedOnEqualTo(Date value) {
            addCriterion("modified_on =", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnNotEqualTo(Date value) {
            addCriterion("modified_on <>", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnGreaterThan(Date value) {
            addCriterion("modified_on >", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_on >=", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnLessThan(Date value) {
            addCriterion("modified_on <", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnLessThanOrEqualTo(Date value) {
            addCriterion("modified_on <=", value, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnIn(List<Date> values) {
            addCriterion("modified_on in", values, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnNotIn(List<Date> values) {
            addCriterion("modified_on not in", values, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnBetween(Date value1, Date value2) {
            addCriterion("modified_on between", value1, value2, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedOnNotBetween(Date value1, Date value2) {
            addCriterion("modified_on not between", value1, value2, "modifiedOn");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("modified_by is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("modified_by =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("modified_by <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("modified_by >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("modified_by >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("modified_by <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("modified_by <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("modified_by like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("modified_by not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("modified_by in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("modified_by not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("modified_by between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("modified_by not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNull() {
            addCriterion("created_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNotNull() {
            addCriterion("created_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameEqualTo(String value) {
            addCriterion("created_name =", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotEqualTo(String value) {
            addCriterion("created_name <>", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThan(String value) {
            addCriterion("created_name >", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThanOrEqualTo(String value) {
            addCriterion("created_name >=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThan(String value) {
            addCriterion("created_name <", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThanOrEqualTo(String value) {
            addCriterion("created_name <=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLike(String value) {
            addCriterion("created_name like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotLike(String value) {
            addCriterion("created_name not like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIn(List<String> values) {
            addCriterion("created_name in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotIn(List<String> values) {
            addCriterion("created_name not in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameBetween(String value1, String value2) {
            addCriterion("created_name between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotBetween(String value1, String value2) {
            addCriterion("created_name not between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameIsNull() {
            addCriterion("modified_name is null");
            return (Criteria) this;
        }

        public Criteria andModifiedNameIsNotNull() {
            addCriterion("modified_name is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedNameEqualTo(String value) {
            addCriterion("modified_name =", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameNotEqualTo(String value) {
            addCriterion("modified_name <>", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameGreaterThan(String value) {
            addCriterion("modified_name >", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameGreaterThanOrEqualTo(String value) {
            addCriterion("modified_name >=", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameLessThan(String value) {
            addCriterion("modified_name <", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameLessThanOrEqualTo(String value) {
            addCriterion("modified_name <=", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameLike(String value) {
            addCriterion("modified_name like", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameNotLike(String value) {
            addCriterion("modified_name not like", value, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameIn(List<String> values) {
            addCriterion("modified_name in", values, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameNotIn(List<String> values) {
            addCriterion("modified_name not in", values, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameBetween(String value1, String value2) {
            addCriterion("modified_name between", value1, value2, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andModifiedNameNotBetween(String value1, String value2) {
            addCriterion("modified_name not between", value1, value2, "modifiedName");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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