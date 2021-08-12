package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbWarehouseDetail;
import com.scg.scaffold.model.TbWarehouseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWarehouseDetailMapper {
    int countByExample(TbWarehouseDetailExample example);

    int deleteByExample(TbWarehouseDetailExample example);

    int insert(TbWarehouseDetail record);

    int insertSelective(TbWarehouseDetail record);

    List<TbWarehouseDetail> selectByExample(TbWarehouseDetailExample example);

    int updateByExampleSelective(@Param("record") TbWarehouseDetail record, @Param("example") TbWarehouseDetailExample example);

    int updateByExample(@Param("record") TbWarehouseDetail record, @Param("example") TbWarehouseDetailExample example);
}