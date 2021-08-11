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
 * @date 7/29/21 1:48 PM
 */
@Data
@Entity
public class UmsRole implements Serializable {
    @Id
    @GenericGenerator(name="idGenerator" ,strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "后台用户数量")
    private Integer adminCount;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;
}
