package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbRealtimeOrder;
import com.scg.scaffold.model.TbRealtimeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRealtimeOrderMapper {
    int countByExample(TbRealtimeOrderExample example);

    int deleteByExample(TbRealtimeOrderExample example);

    int insert(TbRealtimeOrder record);

    int insertSelective(TbRealtimeOrder record);

    List<TbRealtimeOrder> selectByExample(TbRealtimeOrderExample example);

    int updateByExampleSelective(@Param("record") TbRealtimeOrder record, @Param("example") TbRealtimeOrderExample example);

    int updateByExample(@Param("record") TbRealtimeOrder record, @Param("example") TbRealtimeOrderExample example);
}