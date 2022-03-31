package com.xjtlu.wiki.mapper;

import com.xjtlu.wiki.entity.Test4;
import com.xjtlu.wiki.entity.Test4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test4Mapper {
    long countByExample(Test4Example example);

    int deleteByExample(Test4Example example);

    int insert(Test4 record);

    int insertSelective(Test4 record);

    List<Test4> selectByExample(Test4Example example);

    int updateByExampleSelective(@Param("record") Test4 record, @Param("example") Test4Example example);

    int updateByExample(@Param("record") Test4 record, @Param("example") Test4Example example);
}