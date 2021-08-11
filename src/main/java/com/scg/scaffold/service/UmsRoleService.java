package com.scg.scaffold.service;

import com.scg.scaffold.entity.UmsMenu;

import java.util.List;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 1:37 PM
 */
public interface UmsRoleService {
    /**
     * 根据管理员ID获取对应菜单
     * @param adminId 用户id
     * @return 菜单列表
     */
    List<UmsMenu> getMenuList(String adminId);
}
