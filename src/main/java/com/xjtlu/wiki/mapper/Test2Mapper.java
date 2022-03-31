package com.xjtlu.wiki.mapper;

import com.xjtlu.wiki.entity.Test2;
import com.xjtlu.wiki.entity.Test2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Test2Mapper {
    long countByExample(Test2Example example);

    int deleteByExample(Test2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Test2 record);

    int insertSelective(Test2 record);

    List<Test2> selectByExample(Test2Example example);

    Test2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Test2 record, @Param("example") Test2Example example);

    int updateByExample(@Param("record") Test2 record, @Param("example") Test2Example example);

    int updateByPrimaryKeySelective(Test2 record);

    int updateByPrimaryKey(Test2 record);
}