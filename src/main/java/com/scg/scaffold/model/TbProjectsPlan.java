package com.scg.scaffold.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbProjectsPlan implements Serializable {
    private String id;

    private String proId;

    private BigDecimal upBar;

    private BigDecimal horizontalBar;

    private BigDecimal verticalRamp;

    private BigDecimal others;

    private BigDecimal total;

    private Date enterEndTime;

    private Date enterStartTime;

    private Date exitStartTime;

    private Date exitEndTime;

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

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getEnterEndTime() {
        return enterEndTime;
    }

    public void setEnterEndTime(Date enterEndTime) {
        this.enterEndTime = enterEndTime;
    }

    public Date getEnterStartTime() {
        return enterStartTime;
    }

    public void setEnterStartTime(Date enterStartTime) {
        this.enterStartTime = enterStartTime;
    }

    public Date getExitStartTime() {
        return exitStartTime;
    }

    public void setExitStartTime(Date exitStartTime) {
        this.exitStartTime = exitStartTime;
    }

    public Date getExitEndTime() {
        return exitEndTime;
    }

    public void setExitEndTime(Date exitEndTime) {
        this.exitEndTime = exitEndTime;
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
        sb.append(", proId=").append(proId);
        sb.append(", upBar=").append(upBar);
        sb.append(", horizontalBar=").append(horizontalBar);
        sb.append(", verticalRamp=").append(verticalRamp);
        sb.append(", others=").append(others);
        sb.append(", total=").append(total);
        sb.append(", enterEndTime=").append(enterEndTime);
        sb.append(", enterStartTime=").append(enterStartTime);
        sb.append(", exitStartTime=").append(exitStartTime);
        sb.append(", exitEndTime=").append(exitEndTime);
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