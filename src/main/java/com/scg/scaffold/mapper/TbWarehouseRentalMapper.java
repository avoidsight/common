package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbWarehouseRental;
import com.scg.scaffold.model.TbWarehouseRentalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWarehouseRentalMapper {
    int countByExample(TbWarehouseRentalExample example);

    int deleteByExample(TbWarehouseRentalExample example);

    int insert(TbWarehouseRental record);

    int insertSelective(TbWarehouseRental record);

    List<TbWarehouseRental> selectByExample(TbWarehouseRentalExample example);

    int updateByExampleSelective(@Param("record") TbWarehouseRental record, @Param("example") TbWarehouseRentalExample example);

    int updateByExample(@Param("record") TbWarehouseRental record, @Param("example") TbWarehouseRentalExample example);
}