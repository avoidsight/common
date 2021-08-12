package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbWarehouseAccess;
import com.scg.scaffold.model.TbWarehouseAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWarehouseAccessMapper {
    int countByExample(TbWarehouseAccessExample example);

    int deleteByExample(TbWarehouseAccessExample example);

    int insert(TbWarehouseAccess record);

    int insertSelective(TbWarehouseAccess record);

    List<TbWarehouseAccess> selectByExample(TbWarehouseAccessExample example);

    int updateByExampleSelective(@Param("record") TbWarehouseAccess record, @Param("example") TbWarehouseAccessExample example);

    int updateByExample(@Param("record") TbWarehouseAccess record, @Param("example") TbWarehouseAccessExample example);
}