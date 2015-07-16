/**
 * Date:2014年8月9日下午5:55:05
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellyqi.ttgl.dao.UserMapper;
import com.kellyqi.ttgl.model.User;
import com.kellyqi.ttgl.service.UserService;

/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月9日 下午5:55:05 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.6
 * @see 
 */
@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserMapper userMapper;

	public int insertUser(User user){
		return userMapper.insert(user);
	}
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userMapper.findAllUser();
	}
	public boolean deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		int i = userMapper.deleteByPrimaryKey(id);
		if(i == 1)
			return true;
		else
			return false;
	}
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		int i = userMapper.updateByPrimaryKey(user);
		if(i == 1)
			return true;
		else
			return false;
	}
	public User findUserByName(String name) {
		return userMapper.findUserByName(name);
	}
	@Override
	public User findUserByMail(String mail) {
		return userMapper.findUserByMail(mail);
	}
}
