package com.kellyqi.ttgl.dao;

import java.util.List;

import com.kellyqi.ttgl.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
  //---------------------Ext  扩展---------------------------
    
    public List<User> findAllUser();
    
    public User findUserByName(String name);
    public User findUserByMail(String mail);
}