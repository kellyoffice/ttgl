package com.kellyqi.ttgl.dao;

import com.kellyqi.ttgl.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    //=================扩展==============================
    int findIDByRelation(String name);
}