package com.scg.scaffold.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbRealtimeOrderSure implements Serializable {
    private String id;

    private String orderId;

    private String invoiceNumber;

    private String invoiceDirection;

    private BigDecimal invoiceAmount;

    private Date invoiceTime;

    private String invoiceBy;

    private Date receiptTime;

    private String receiptBy;

    private BigDecimal upBar;

    private BigDecimal horizontalBar;

    private BigDecimal verticalRamp;

    private BigDecimal others;

    private BigDecimal totals;

    private Date createdOn;

    private String createdBy;

    private Date modifiedOn;

    private String modifiedBy;

    private String createdName;

    private String modifiedName;

    private String isDeleted;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDirection() {
        return invoiceDirection;
    }

    public void setInvoiceDirection(String invoiceDirection) {
        this.invoiceDirection = invoiceDirection;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getInvoiceBy() {
        return invoiceBy;
    }

    public void setInvoiceBy(String invoiceBy) {
        this.invoiceBy = invoiceBy;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public String getReceiptBy() {
        return receiptBy;
    }

    public void setReceiptBy(String receiptBy) {
        this.receiptBy = receiptBy;
    }

    public BigDecimal getUpBar() {
        return upBar;
    }

    public void setUpBar(BigDecimal upBar) {
        this.upBar = upBar;
    }

    public BigDecimal getHorizontalBar() {
        return horizontalBar;
    }

    public void setHorizontalBar(BigDecimal horizontalBar) {
        this.horizontalBar = horizontalBar;
    }

    public BigDecimal getVerticalRamp() {
        return verticalRamp;
    }

    public void setVerticalRamp(BigDecimal verticalRamp) {
        this.verticalRamp = verticalRamp;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    public BigDecimal getTotals() {
        return totals;
    }

    public void setTotals(BigDecimal totals) {
        this.totals = totals;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    public String getModifiedName() {
        return modifiedName;
    }

    public void setModifiedName(String modifiedName) {
        this.modifiedName = modifiedName;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", invoiceDirection=").append(invoiceDirection);
        sb.append(", invoiceAmount=").append(invoiceAmount);
        sb.append(", invoiceTime=").append(invoiceTime);
        sb.append(", invoiceBy=").append(invoiceBy);
        sb.append(", receiptTime=").append(receiptTime);
        sb.append(", receiptBy=").append(receiptBy);
        sb.append(", upBar=").append(upBar);
        sb.append(", horizontalBar=").append(horizontalBar);
        sb.append(", verticalRamp=").append(verticalRamp);
        sb.append(", others=").append(others);
        sb.append(", totals=").append(totals);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", createdName=").append(createdName);
        sb.append(", modifiedName=").append(modifiedName);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}