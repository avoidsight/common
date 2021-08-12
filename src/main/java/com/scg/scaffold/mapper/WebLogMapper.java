package com.scg.scaffold.mapper;

import com.scg.scaffold.model.WebLog;
import com.scg.scaffold.model.WebLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebLogMapper {
    int countByExample(WebLogExample example);

    int deleteByExample(WebLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(WebLog record);

    int insertSelective(WebLog record);

    List<WebLog> selectByExampleWithBLOBs(WebLogExample example);

    List<WebLog> selectByExample(WebLogExample example);

    WebLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByExampleWithBLOBs(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByExample(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByPrimaryKeySelective(WebLog record);

    int updateByPrimaryKeyWithBLOBs(WebLog record);

    int updateByPrimaryKey(WebLog record);
}