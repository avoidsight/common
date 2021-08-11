package com.scg.scaffold.dao;

import com.scg.scaffold.entity.UmsAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 2:04 PM
 */
public interface UmsAdminDao extends JpaRepository<UmsAdmin, String> {
    List<UmsAdmin> findByUsername(String username);
}
