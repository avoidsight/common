package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbProjects;
import com.scg.scaffold.model.TbProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectsMapper {
    int countByExample(TbProjectsExample example);

    int deleteByExample(TbProjectsExample example);

    int insert(TbProjects record);

    int insertSelective(TbProjects record);

    List<TbProjects> selectByExample(TbProjectsExample example);

    int updateByExampleSelective(@Param("record") TbProjects record, @Param("example") TbProjectsExample example);

    int updateByExample(@Param("record") TbProjects record, @Param("example") TbProjectsExample example);
}