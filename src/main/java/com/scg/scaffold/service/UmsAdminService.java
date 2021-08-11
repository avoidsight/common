package com.scg.scaffold.service;

import com.scg.scaffold.dto.UmsAdminParam;
import com.scg.scaffold.entity.UmsAdmin;
import com.scg.scaffold.entity.UmsResource;
import com.scg.scaffold.entity.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 1:36 PM
 */
public interface UmsAdminService {
    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    UserDetails loadUserByUsername(String username);

    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 获取用户对应角色
     */
    List<UmsRole> getRoleList(String adminId);

    /**
     * 获取资源列表
     */
    List<UmsResource> getResourceList(String adminId);
}
