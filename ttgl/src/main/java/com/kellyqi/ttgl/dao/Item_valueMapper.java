package com.kellyqi.ttgl.dao;

import com.kellyqi.ttgl.model.Item_value;

public interface Item_valueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item_value record);

    int insertSelective(Item_value record);

    Item_value selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item_value record);

    int updateByPrimaryKey(Item_value record);
}