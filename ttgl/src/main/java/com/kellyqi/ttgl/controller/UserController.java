/**
 * Date:2014年8月7日下午11:01:31
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kellyqi.ttgl.entity.ResultState;
import com.kellyqi.ttgl.model.User;
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
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="register.do")
	@ResponseBody
	public ResultState register(HttpSession httpSession,User user){
		logger.debug("insert into user,name is :" + user.getName() );
		int i = userService.insertUser(user);
		if(i == 0){
			return new ResultState(false,"用户注册失败");
		}else{
			httpSession.setAttribute("user", user);
			httpSession.setMaxInactiveInterval(3600);
			return new ResultState(true,"用户注册成功");
		}
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
	@ResponseBody
	public ResultState login(User user,HttpSession httpSession){
		logger.debug("login :" + user.getName());
		User u = userService.findUserByMail(user.getMail());
		if(u == null){
			return new ResultState(false,"\""+user.getMail()+"\"这个用户不存在");
		}
		if(u.getPassword().equalsIgnoreCase(user.getPassword())){
			httpSession.setAttribute("user", u);
			httpSession.setMaxInactiveInterval(3600);
			return new ResultState(true,"登陆成功");
		}else{
			return new ResultState(false,"密码不正确");
		}
	}
	
}
