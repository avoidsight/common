package com.scg.scaffold.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 11:26 AM
 */
@Data
@Entity
public class UmsAdmin implements Serializable {
    @Id
    @GenericGenerator(name="idGenerator" ,strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    private String username;

    @JsonIgnore
    private String password;

    @ApiModelProperty(value = "头像")
    @Lob
    private String icon;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "姓名")
    private String realName;

    @ApiModelProperty(value = "备注信息")
    private String note;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
    private Integer status;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", realName=").append(realName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}