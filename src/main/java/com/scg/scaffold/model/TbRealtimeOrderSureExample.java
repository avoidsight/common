package com.scg.scaffold.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRealtimeOrderSureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRealtimeOrderSureExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionIsNull() {
            addCriterion("invoice_direction is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionIsNotNull() {
            addCriterion("invoice_direction is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionEqualTo(String value) {
            addCriterion("invoice_direction =", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionNotEqualTo(String value) {
            addCriterion("invoice_direction <>", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionGreaterThan(String value) {
            addCriterion("invoice_direction >", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_direction >=", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionLessThan(String value) {
            addCriterion("invoice_direction <", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionLessThanOrEqualTo(String value) {
            addCriterion("invoice_direction <=", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionLike(String value) {
            addCriterion("invoice_direction like", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionNotLike(String value) {
            addCriterion("invoice_direction not like", value, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionIn(List<String> values) {
            addCriterion("invoice_direction in", values, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionNotIn(List<String> values) {
            addCriterion("invoice_direction not in", values, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionBetween(String value1, String value2) {
            addCriterion("invoice_direction between", value1, value2, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceDirectionNotBetween(String value1, String value2) {
            addCriterion("invoice_direction not between", value1, value2, "invoiceDirection");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("invoice_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("invoice_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(BigDecimal value) {
            addCriterion("invoice_amount =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(BigDecimal value) {
            addCriterion("invoice_amount <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(BigDecimal value) {
            addCriterion("invoice_amount >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_amount >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(BigDecimal value) {
            addCriterion("invoice_amount <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_amount <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<BigDecimal> values) {
            addCriterion("invoice_amount in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<BigDecimal> values) {
            addCriterion("invoice_amount not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_amount between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_amount not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNull() {
            addCriterion("invoice_time is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIsNotNull() {
            addCriterion("invoice_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeEqualTo(Date value) {
            addCriterion("invoice_time =", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotEqualTo(Date value) {
            addCriterion("invoice_time <>", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThan(Date value) {
            addCriterion("invoice_time >", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invoice_time >=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThan(Date value) {
            addCriterion("invoice_time <", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("invoice_time <=", value, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeIn(List<Date> values) {
            addCriterion("invoice_time in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotIn(List<Date> values) {
            addCriterion("invoice_time not in", values, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeBetween(Date value1, Date value2) {
            addCriterion("invoice_time between", value1, value2, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("invoice_time not between", value1, value2, "invoiceTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceByIsNull() {
            addCriterion("invoice_by is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceByIsNotNull() {
            addCriterion("invoice_by is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceByEqualTo(String value) {
            addCriterion("invoice_by =", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByNotEqualTo(String value) {
            addCriterion("invoice_by <>", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByGreaterThan(String value) {
            addCriterion("invoice_by >", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_by >=", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByLessThan(String value) {
            addCriterion("invoice_by <", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByLessThanOrEqualTo(String value) {
            addCriterion("invoice_by <=", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByLike(String value) {
            addCriterion("invoice_by like", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByNotLike(String value) {
            addCriterion("invoice_by not like", value, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByIn(List<String> values) {
            addCriterion("invoice_by in", values, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByNotIn(List<String> values) {
            addCriterion("invoice_by not in", values, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByBetween(String value1, String value2) {
            addCriterion("invoice_by between", value1, value2, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andInvoiceByNotBetween(String value1, String value2) {
            addCriterion("invoice_by not between", value1, value2, "invoiceBy");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Date value) {
            addCriterion("receipt_time =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Date value) {
            addCriterion("receipt_time <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Date value) {
            addCriterion("receipt_time >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receipt_time >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Date value) {
            addCriterion("receipt_time <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("receipt_time <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Date> values) {
            addCriterion("receipt_time in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Date> values) {
            addCriterion("receipt_time not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("receipt_time between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("receipt_time not between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptByIsNull() {
            addCriterion("receipt_by is null");
            return (Criteria) this;
        }

        public Criteria andReceiptByIsNotNull() {
            addCriterion("receipt_by is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptByEqualTo(String value) {
            addCriterion("receipt_by =", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByNotEqualTo(String value) {
            addCriterion("receipt_by <>", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByGreaterThan(String value) {
            addCriterion("receipt_by >", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_by >=", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByLessThan(String value) {
            addCriterion("receipt_by <", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByLessThanOrEqualTo(String value) {
            addCriterion("receipt_by <=", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByLike(String value) {
            addCriterion("receipt_by like", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByNotLike(String value) {
            addCriterion("receipt_by not like", value, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByIn(List<String> values) {
            addCriterion("receipt_by in", values, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByNotIn(List<String> values) {
            addCriterion("receipt_by not in", values, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByBetween(String value1, String value2) {
            addCriterion("receipt_by between", value1, value2, "receiptBy");
            return (Criteria) this;
        }

        public Criteria andReceiptByNotBetween(String value1, String value2) {
            addCriterion("receipt_by not between", value1, value2, "receiptBy");
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

        public Criteria andTotalsIsNull() {
            addCriterion("totals is null");
            return (Criteria) this;
        }

        public Criteria andTotalsIsNotNull() {
            addCriterion("totals is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsEqualTo(BigDecimal value) {
            addCriterion("totals =", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotEqualTo(BigDecimal value) {
            addCriterion("totals <>", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThan(BigDecimal value) {
            addCriterion("totals >", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totals >=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThan(BigDecimal value) {
            addCriterion("totals <", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totals <=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsIn(List<BigDecimal> values) {
            addCriterion("totals in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotIn(List<BigDecimal> values) {
            addCriterion("totals not in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totals between", value1, value2, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totals not between", value1, value2, "totals");
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