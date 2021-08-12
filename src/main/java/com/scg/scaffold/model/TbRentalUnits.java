package com.scg.scaffold.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbRentalUnits implements Serializable {
    private String id;

    private String unitsName;

    private String unitsAddress;

    private String unitsStatus;

    private String legal;

    private BigDecimal registFunds;

    private String contact;

    private String contactUs;

    private String remarks;

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

    public String getUnitsName() {
        return unitsName;
    }

    public void setUnitsName(String unitsName) {
        this.unitsName = unitsName;
    }

    public String getUnitsAddress() {
        return unitsAddress;
    }

    public void setUnitsAddress(String unitsAddress) {
        this.unitsAddress = unitsAddress;
    }

    public String getUnitsStatus() {
        return unitsStatus;
    }

    public void setUnitsStatus(String unitsStatus) {
        this.unitsStatus = unitsStatus;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public BigDecimal getRegistFunds() {
        return registFunds;
    }

    public void setRegistFunds(BigDecimal registFunds) {
        this.registFunds = registFunds;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactUs() {
        return contactUs;
    }

    public void setContactUs(String contactUs) {
        this.contactUs = contactUs;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        sb.append(", unitsName=").append(unitsName);
        sb.append(", unitsAddress=").append(unitsAddress);
        sb.append(", unitsStatus=").append(unitsStatus);
        sb.append(", legal=").append(legal);
        sb.append(", registFunds=").append(registFunds);
        sb.append(", contact=").append(contact);
        sb.append(", contactUs=").append(contactUs);
        sb.append(", remarks=").append(remarks);
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