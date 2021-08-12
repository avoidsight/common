package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbProjectsInout;
import com.scg.scaffold.model.TbProjectsInoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectsInoutMapper {
    int countByExample(TbProjectsInoutExample example);

    int deleteByExample(TbProjectsInoutExample example);

    int insert(TbProjectsInout record);

    int insertSelective(TbProjectsInout record);

    List<TbProjectsInout> selectByExample(TbProjectsInoutExample example);

    int updateByExampleSelective(@Param("record") TbProjectsInout record, @Param("example") TbProjectsInoutExample example);

    int updateByExample(@Param("record") TbProjectsInout record, @Param("example") TbProjectsInoutExample example);
}