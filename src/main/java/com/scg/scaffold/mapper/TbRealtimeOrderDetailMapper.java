package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbRealtimeOrderDetail;
import com.scg.scaffold.model.TbRealtimeOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRealtimeOrderDetailMapper {
    int countByExample(TbRealtimeOrderDetailExample example);

    int deleteByExample(TbRealtimeOrderDetailExample example);

    int insert(TbRealtimeOrderDetail record);

    int insertSelective(TbRealtimeOrderDetail record);

    List<TbRealtimeOrderDetail> selectByExample(TbRealtimeOrderDetailExample example);

    int updateByExampleSelective(@Param("record") TbRealtimeOrderDetail record, @Param("example") TbRealtimeOrderDetailExample example);

    int updateByExample(@Param("record") TbRealtimeOrderDetail record, @Param("example") TbRealtimeOrderDetailExample example);
}