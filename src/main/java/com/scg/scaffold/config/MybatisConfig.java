package com.scg.scaffold.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author menmenz
 * @version 1.0
 * @date 8/12/21 3:31 PM
 */
@Configuration
@MapperScan({"com.scg.scaffold.mapper", "com.scg.scaffold.dao"})
public class MybatisConfig {
}
