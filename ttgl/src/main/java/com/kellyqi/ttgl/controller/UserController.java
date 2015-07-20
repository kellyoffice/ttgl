/**
 * Date:2014年8月7日下午11:01:31
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kellyqi.ttgl.Utils.Constant;
import com.kellyqi.ttgl.entity.RegisterInfo;
import com.kellyqi.ttgl.entity.ResultState;
import com.kellyqi.ttgl.model.Family;
import com.kellyqi.ttgl.model.Role;
import com.kellyqi.ttgl.model.User;
import com.kellyqi.ttgl.service.FamilyService;
import com.kellyqi.ttgl.service.RoleService;
import com.kellyqi.ttgl.service.UserService;

/** 
 * Function: 用于接受http请求。用户注册、登陆。 <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月7日 下午11:01:31 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.7
 * @see 
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired 
	private UserService userService;
	@Autowired
	private FamilyService familyService;
	@Autowired
	private RoleService roleService;
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="register.do")
	public ResultState register(HttpSession httpSession,RegisterInfo registerInfo){
		logger.debug("insert into user,name is :" + registerInfo.getUsername() );
		//建立家庭
		Family family = new Family();
		family.setName(registerInfo.getFamilyName());
		familyService.saveFamily(family);
		logger.debug("Family("+registerInfo.getFamilyName()+") build success!" );
		
		//建立用户
		int[] relations = registerInfo.getRelations();
		//加自己一共要建立userSize个用户
		int userSize = relations.length+1;
		User user = null;
		for (int i = 0; i < userSize; i++) {
			user = new User();
			int roleid = 0;
			if(i==relations.length){
				//建立自己账户
				user.setName(registerInfo.getUsername());
				roleid = Role.I;
				user.setMail(registerInfo.getMail());
			}else{
				Role role = roleService.findRoleByID(relations[i]);
				user.setName(registerInfo.getUsername()+role.getName());
				roleid = relations[i];
			}
			user.setPassword(registerInfo.getPassword());
			userService.insertUser(user);
			userService.saveFamilyRelation(user.getId(),family.getId(),1000,roleid);
		}
		/*httpSession.setAttribute("user", user);
		httpSession.setMaxInactiveInterval(3600);*/
		logger.info("Success register user:"+ registerInfo.getUsername());
		return new ResultState(true,"用户注册成功");
	}
	
	@RequestMapping(value="updateUser.do")
	@ResponseBody
	public ResultState updateUser(User user){
		logger.debug("updateUser :" + user.getId());
		boolean b = userService.updateUser(user);
		if(b)
			return new ResultState(true,"更新成功");
		else
			return new ResultState(false,"更新失败");
	}
	
	@RequestMapping(value="login.do")
	public String login(User user,HttpSession httpSession){
		logger.debug("login :" + user.getName());
		User u = userService.findUserByName(user.getName());
		if(u == null){
			logger.error("Fail get user ("+user.getName()+")");
			return "用户不存在！";
		}
		if(u.getPassword().equalsIgnoreCase(user.getPassword())){
			httpSession.setAttribute(Constant.SESSION_USER, u);
			httpSession.setMaxInactiveInterval(3600);
			logger.info("Success login user:"+ user.getName());
			return "homepage";
		}else{
			logger.error("Fail login user:"+ user.getName()+",password is wrong !");
			return "密码不正确";
		}
	}
	
}
