package com.scg.scaffold.dao;

import com.scg.scaffold.entity.UmsAdminLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 3:06 PM
 */
public interface UmsAdminLoginLogDao extends JpaRepository<UmsAdminLoginLog, String> {
}
