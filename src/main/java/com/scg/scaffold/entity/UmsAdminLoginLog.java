package com.scg.scaffold.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 3:05 PM
 */
@Data
@Entity
public class UmsAdminLoginLog implements Serializable {
    @Id
    @GenericGenerator(name="idGenerator" ,strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    private String adminId;

    private Date createTime;

    private String ip;

    private String address;

    @ApiModelProperty(value = "浏览器登录类型")
    private String userAgent;
}
