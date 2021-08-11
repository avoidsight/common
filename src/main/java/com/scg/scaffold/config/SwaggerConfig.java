package com.scg.scaffold.config;

import com.scg.scaffold.common.swagger.BaseSwaggerConfig;
import com.scg.scaffold.common.swagger.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/27/21 3:36 PM
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.scg.scaffold.controller")
                .title("盘扣式脚手架系统")
                .description("盘扣式脚手架系统相关接口文档")
                .contactName("查鹏")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
