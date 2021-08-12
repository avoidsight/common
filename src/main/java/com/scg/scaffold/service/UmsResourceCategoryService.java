package com.scg.scaffold.service;

import com.scg.scaffold.model.UmsResourceCategory;

import java.util.List;

/**
 * @author menmenz
 * @version 1.0
 * @date 8/12/21 7:21 PM
 */
public interface UmsResourceCategoryService {
    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
