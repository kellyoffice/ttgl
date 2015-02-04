/**
 * Date:2014年8月7日下午11:01:31
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.controller.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kellyqi.ttgl.entity.Msg;
import com.kellyqi.ttgl.model.User;
import com.kellyqi.ttgl.service.login.UserService;

/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月7日 下午11:01:31 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.7
 * @see 
 */
@Controller
@RequestMapping(value="userController")
public class UserController {
	@Autowired 
	private UserService userService;
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="addUser.do")
	@ResponseBody
	public Msg register(HttpSession httpSession,User user){
		logger.debug("insert into user,name is :" + user.getName() );
		int i = userService.insertUser(user);
		if(i == 0){
			return new Msg(false,"用户注册失败");
		}else{
			httpSession.setAttribute("user", user);
			httpSession.setMaxInactiveInterval(3600);
			return new Msg(true,"用户注册成功");
		}
	}
	
	@RequestMapping(value="listUsers.do")
	@ResponseBody
	public User[] listUser(ModelMap map){
		logger.debug("list users~");
		List<User> users = userService.findAllUser();
		User[] a = new User[users.size()];
		users.toArray(a);
		return a;
	/*	map.addAttribute("users", users);
		return "userManager/listUsers";*/
	}
	
	@RequestMapping(value="deleteUser.do")
	public String deleteUser(Integer id){
		logger.debug("deleteUser :"+ id);
		userService.deleteUserById(id);
		return "redirect:listUsers.do";
	}
	@RequestMapping(value="updateUser.do")
	@ResponseBody
	public Msg updateUser(User user){
		logger.debug("updateUser :" + user.getId());
		boolean b = userService.updateUser(user);
		if(b)
			return new Msg(true,"更新成功");
		else
			return new Msg(false,"更新失败");
	}
	
	@RequestMapping(value="login.do")
	@ResponseBody
	public Msg login(User user,HttpSession httpSession){
		logger.debug("login :" + user.getName());
		User u = userService.findUserByMail(user.getMail());
		if(u == null){
			return new Msg(false,"\""+user.getMail()+"\"这个用户不存在");
		}
		if(u.getPassword().equalsIgnoreCase(user.getPassword())){
			httpSession.setAttribute("user", u);
			httpSession.setMaxInactiveInterval(3600);
			return new Msg(true,"登陆成功");
		}else{
			return new Msg(false,"密码不正确");
		}
	}
	
	@RequestMapping(value="main.do")
	public String mainJsp(HttpSession httpSession){
		Object user = httpSession.getAttribute("user");
		if(user == null){
			httpSession.setAttribute("sessionWithoutUser", "请先登陆");
			return "redirect:relogin.do";
		}else{
			return "userManager/main";
		}
			
	}
	
	@RequestMapping(value="relogin.do")
	public String relogin(){
		return "redirect:/userManager/login.jsp";
	}
	
	@RequestMapping(value="logout.do")
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("user");
		return "redirect:/userManager/login.jsp";
	}
}
