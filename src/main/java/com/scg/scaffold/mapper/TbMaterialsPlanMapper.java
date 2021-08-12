package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbMaterialsPlan;
import com.scg.scaffold.model.TbMaterialsPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaterialsPlanMapper {
    int countByExample(TbMaterialsPlanExample example);

    int deleteByExample(TbMaterialsPlanExample example);

    int insert(TbMaterialsPlan record);

    int insertSelective(TbMaterialsPlan record);

    List<TbMaterialsPlan> selectByExample(TbMaterialsPlanExample example);

    int updateByExampleSelective(@Param("record") TbMaterialsPlan record, @Param("example") TbMaterialsPlanExample example);

    int updateByExample(@Param("record") TbMaterialsPlan record, @Param("example") TbMaterialsPlanExample example);
}