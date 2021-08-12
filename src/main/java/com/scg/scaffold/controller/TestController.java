package com.scg.scaffold.controller;

import com.scg.scaffold.common.api.CommonResult;
import com.scg.scaffold.mapper.UmsAdminMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/23/21 1:20 PM
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/api/v1.0/health")
public class TestController {

    @Resource
    UmsAdminMapper umsAdminMapper;

    @GetMapping("/check")
    @ApiOperation("测试")
    public CommonResult test() {
        return CommonResult.success("success");
    }

    @GetMapping("/user/{id}")
    @ApiOperation("获取用户信息")
    public CommonResult getUserInfo(@PathVariable Long id) {
        return CommonResult.success(null);
    }
}
