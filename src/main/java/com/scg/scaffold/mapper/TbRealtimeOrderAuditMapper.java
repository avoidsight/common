package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbRealtimeOrderAudit;
import com.scg.scaffold.model.TbRealtimeOrderAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRealtimeOrderAuditMapper {
    int countByExample(TbRealtimeOrderAuditExample example);

    int deleteByExample(TbRealtimeOrderAuditExample example);

    int insert(TbRealtimeOrderAudit record);

    int insertSelective(TbRealtimeOrderAudit record);

    List<TbRealtimeOrderAudit> selectByExample(TbRealtimeOrderAuditExample example);

    int updateByExampleSelective(@Param("record") TbRealtimeOrderAudit record, @Param("example") TbRealtimeOrderAuditExample example);

    int updateByExample(@Param("record") TbRealtimeOrderAudit record, @Param("example") TbRealtimeOrderAuditExample example);
}