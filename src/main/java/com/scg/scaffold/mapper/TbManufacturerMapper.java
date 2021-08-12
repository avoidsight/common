package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbManufacturer;
import com.scg.scaffold.model.TbManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbManufacturerMapper {
    int countByExample(TbManufacturerExample example);

    int deleteByExample(TbManufacturerExample example);

    int insert(TbManufacturer record);

    int insertSelective(TbManufacturer record);

    List<TbManufacturer> selectByExample(TbManufacturerExample example);

    int updateByExampleSelective(@Param("record") TbManufacturer record, @Param("example") TbManufacturerExample example);

    int updateByExample(@Param("record") TbManufacturer record, @Param("example") TbManufacturerExample example);
}