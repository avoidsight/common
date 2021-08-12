package com.scg.scaffold.config;

import com.scg.scaffold.common.swagger.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author menmenz
 * @version 1.0
 * @date 8/12/21 8:32 PM
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
