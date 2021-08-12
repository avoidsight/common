package com.scg.scaffold.mapper;

import com.scg.scaffold.model.TbProjectInoutDetail;
import com.scg.scaffold.model.TbProjectInoutDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProjectInoutDetailMapper {
    int countByExample(TbProjectInoutDetailExample example);

    int deleteByExample(TbProjectInoutDetailExample example);

    int insert(TbProjectInoutDetail record);

    int insertSelective(TbProjectInoutDetail record);

    List<TbProjectInoutDetail> selectByExample(TbProjectInoutDetailExample example);

    int updateByExampleSelective(@Param("record") TbProjectInoutDetail record, @Param("example") TbProjectInoutDetailExample example);

    int updateByExample(@Param("record") TbProjectInoutDetail record, @Param("example") TbProjectInoutDetailExample example);
}