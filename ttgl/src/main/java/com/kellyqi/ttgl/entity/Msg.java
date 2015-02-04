/**
 * Date:2014年8月20日下午11:15:16
 * Mail:zhaoqi19880624@163.com 
 * Copyright (c) 2014 by ZhaoQi , All Rights Reserved .
 */

package com.kellyqi.ttgl.entity;
/** 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2014年8月20日 下午11:15:16 <br/>
 * @author   ZhaoQi 
 * @version  1.0 
 * @since    JDK 1.7
 * @see 
 */
public class Msg {
	private boolean success;
	private String msg;
	
	public Msg(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
