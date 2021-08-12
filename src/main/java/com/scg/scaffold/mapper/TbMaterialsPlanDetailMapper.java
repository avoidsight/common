package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbMaterialsPlanDetail;
import com.scg.scaffold.model.TbMaterialsPlanDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaterialsPlanDetailMapper {
    int countByExample(TbMaterialsPlanDetailExample example);

    int deleteByExample(TbMaterialsPlanDetailExample example);

    int insert(TbMaterialsPlanDetail record);

    int insertSelective(TbMaterialsPlanDetail record);

    List<TbMaterialsPlanDetail> selectByExample(TbMaterialsPlanDetailExample example);

    int updateByExampleSelective(@Param("record") TbMaterialsPlanDetail record, @Param("example") TbMaterialsPlanDetailExample example);

    int updateByExample(@Param("record") TbMaterialsPlanDetail record, @Param("example") TbMaterialsPlanDetailExample example);
}