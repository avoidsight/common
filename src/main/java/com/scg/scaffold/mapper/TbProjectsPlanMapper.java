package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbProjectsPlan;
import com.scg.scaffold.model.TbProjectsPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectsPlanMapper {
    int countByExample(TbProjectsPlanExample example);

    int deleteByExample(TbProjectsPlanExample example);

    int insert(TbProjectsPlan record);

    int insertSelective(TbProjectsPlan record);

    List<TbProjectsPlan> selectByExample(TbProjectsPlanExample example);

    int updateByExampleSelective(@Param("record") TbProjectsPlan record, @Param("example") TbProjectsPlanExample example);

    int updateByExample(@Param("record") TbProjectsPlan record, @Param("example") TbProjectsPlanExample example);
}