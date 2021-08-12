package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbMaterialSpecs;
import com.scg.scaffold.model.TbMaterialSpecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaterialSpecsMapper {
    int countByExample(TbMaterialSpecsExample example);

    int deleteByExample(TbMaterialSpecsExample example);

    int insert(TbMaterialSpecs record);

    int insertSelective(TbMaterialSpecs record);

    List<TbMaterialSpecs> selectByExample(TbMaterialSpecsExample example);

    int updateByExampleSelective(@Param("record") TbMaterialSpecs record, @Param("example") TbMaterialSpecsExample example);

    int updateByExample(@Param("record") TbMaterialSpecs record, @Param("example") TbMaterialSpecsExample example);
}