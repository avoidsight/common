package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbRentalUnits;
import com.scg.scaffold.model.TbRentalUnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRentalUnitsMapper {
    int countByExample(TbRentalUnitsExample example);

    int deleteByExample(TbRentalUnitsExample example);

    int insert(TbRentalUnits record);

    int insertSelective(TbRentalUnits record);

    List<TbRentalUnits> selectByExample(TbRentalUnitsExample example);

    int updateByExampleSelective(@Param("record") TbRentalUnits record, @Param("example") TbRentalUnitsExample example);

    int updateByExample(@Param("record") TbRentalUnits record, @Param("example") TbRentalUnitsExample example);
}