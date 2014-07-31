package com.kellyqi.ttgl.demo.controller;

import org.apache.log4j.Logger;

public class Log4JTest {
	private static Logger logger = Logger.getLogger(Log4JTest.class);

	public static void main(String[] args) {
		// 记录debug级别的信息
		logger.debug("This is debug message.");
		// 记录info级别的信息
		logger.info("This is info message.");
		// 记录error级别的信息
		logger.error("This is error message.");

	}

}
