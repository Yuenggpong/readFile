package com.readFile.mapper;

import com.readFile.po.hotel2000w;
import com.readFile.po.hotel2000wExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface hotel2000wMapper {
    long countByExample(hotel2000wExample example);

    int deleteByExample(hotel2000wExample example);

    int deleteByPrimaryKey(String id);

    int insert(hotel2000w record);

    int insertBatch(List<hotel2000w> record);

    int insertSelective(hotel2000w record);

    List<hotel2000w> selectByExample(hotel2000wExample example);

    hotel2000w selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") hotel2000w record, @Param("example") hotel2000wExample example);

    int updateByExample(@Param("record") hotel2000w record, @Param("example") hotel2000wExample example);

    int updateByPrimaryKeySelective(hotel2000w record);

    int updateByPrimaryKey(hotel2000w record);

    List<hotel2000w> selectAllHotel();
}