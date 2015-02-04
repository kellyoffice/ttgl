/**
 * Date:2014年8月10日下午9:31:06
 * mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.servlet.propertyeditor;

import java.beans.PropertyEditorManager;
import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2014年8月10日 下午9:31:06 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.6
 * @see 
 */
public class RegisterEditorServlet extends HttpServlet {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 4252948717176058692L;
	public void init() throws ServletException {
		PropertyEditorManager.registerEditor(Date.class, DatePropertyEditor.class);  
	}
	class DatePropertyEditor extends PropertyEditorSupport{
		private Date date;  
		 private final SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd");
		 public void setAsText(String str) {  
			  try {  
				   date = format.parse(str);  
			  } catch(Exception e) {  
				  date = null;  
			  }
		 }
		 public Date getValue() {  
			 return date;
		 }
	}
}
