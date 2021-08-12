package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbRealtimeOrderSure;
import com.scg.scaffold.model.TbRealtimeOrderSureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRealtimeOrderSureMapper {
    int countByExample(TbRealtimeOrderSureExample example);

    int deleteByExample(TbRealtimeOrderSureExample example);

    int insert(TbRealtimeOrderSure record);

    int insertSelective(TbRealtimeOrderSure record);

    List<TbRealtimeOrderSure> selectByExample(TbRealtimeOrderSureExample example);

    int updateByExampleSelective(@Param("record") TbRealtimeOrderSure record, @Param("example") TbRealtimeOrderSureExample example);

    int updateByExample(@Param("record") TbRealtimeOrderSure record, @Param("example") TbRealtimeOrderSureExample example);
}