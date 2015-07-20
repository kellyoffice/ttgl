/**
 * Date:2015年7月19日下午12:00:43
 * Mail:zhaoqi19880624@163.com
 * Copyright (c) 2015 by ZhaoQi , All Rights Reserved .
 *
*/

package com.kellyqi.ttgl.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kellyqi.ttgl.Utils.Constant;
import com.kellyqi.ttgl.model.User;

/**
 * Function: 记账，账单 相关功能<br/>
 * Date:     2015年7月19日 下午12:00:43 <br/>
 * @author   ZhaoQi
 * @version  enclosing_typetags
 * @since    JDK 1.7
 * @see 	 
 */
@Controller
@RequestMapping(value="bill")
public class BillController {
	
	private static Logger logger = Logger.getLogger(BillController.class);
	
	@RequestMapping(value="tally.do")
	public String tally(HttpSession session){
		User user = (User)session.getAttribute(Constant.SESSION_USER);
		if(user == null){
			return "redirect:"+Constant.JSP_LOGIN;
		}
		logger.debug("tally :" + user.getName());
		
		return "tally";
	}
}

