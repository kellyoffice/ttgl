/**
 * Date:2014年8月9日下午5:55:05
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.service.login.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellyqi.ttgl.dao.UserMapper;
import com.kellyqi.ttgl.model.User;
import com.kellyqi.ttgl.service.login.UserService;

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
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userMapper.findAllUser();
	}
}
