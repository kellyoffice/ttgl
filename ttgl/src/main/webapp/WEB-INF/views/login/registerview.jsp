<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/my97/WdatePicker.js"></script>
  </head>
  
  <body>
    <form action="login/register.do">
    	用户名：<input	name="name"></br>
    	密码：<input type="password" name="password" ></br>
    	性别：男<input type="radio" name="sex" value="男" checked="checked">
    		女<input type="radio" name="sex" value="女"></br>
    	mail:<input name="mail"></br>
    	生日:<input name="date"  readonly="readonly" onfocus="WdatePicker({isShowWeek:true})" /> </br>
		<input type="submit" value="确定">
    </form>
  </body>
</html>
