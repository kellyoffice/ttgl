/**
 * Date:2014年8月7日下午11:01:31
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.controller.login;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kellyqi.ttgl.demo.controller.Log4JTest;

/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月7日 下午11:01:31 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.6
 * @see 
 */
@Controller
@RequestMapping(value="login")
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="registerview.do")
	public void registertojsp(){
		logger.debug("用户跳转到注册页面");
	}
	@RequestMapping(value="register.do")
	public void register(){
		logger.info("insert into user~");
	}
}
