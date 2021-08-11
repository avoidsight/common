package com.scg.scaffold.mapper;

import com.scg.scaffold.log.WebLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/27/21 2:58 PM
 */
public interface WebLogMapper extends JpaRepository<WebLog, String> {
}
