package com.scg.scaffold.log;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/27/21 2:55 PM
 */
@Data
@Entity
@TypeDef(name="json", typeClass = JsonStringType.class)
public class WebLog {
    @Id
    @GenericGenerator(name="idGenerator" ,strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;
    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 请求参数
     */
    @Type(type = "json")
    @Column(columnDefinition = "json" )
    private Object parameter;

    /**
     * 返回结果
     */
    @Type(type = "json")
    @Column(columnDefinition = "json" )
    private Object result;
}
