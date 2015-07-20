/**
 * Date:2014年8月9日下午5:55:05
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.service;

import java.util.List;

import com.kellyqi.ttgl.model.User;

/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月9日 下午5:55:05 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.7
 * @see 
 */
public interface UserService {
	public int insertUser(User user);
	public List<User> findAllUser();
	public boolean deleteUserById(Integer id);
	public boolean updateUser(User user);
	public User findUserByName(String name);
	public User findUserByMail(String mail);
	public void saveFamilyRelation(int userid, int familyID, float buget,int roleid);
}
