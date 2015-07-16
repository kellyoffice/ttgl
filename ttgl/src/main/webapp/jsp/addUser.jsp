<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML">
<html>
<head>
<base href="<%=basePath%>">

<title>用户注册</title>
<style>
.center {
  position: absolute;
  left: 40%;
  top: 20%;
}
body
  { background-color: #FFF0F5
  }
</style>
<link href="/ttgl/js/extjs-4.24/resources/ext-theme-classic/ext-theme-classic-all.css" rel="stylesheet" />
<script src="/ttgl/js/extjs-4.24/bootstrap.js"></script>
<script src="/ttgl/js/extjs-4.24/locale/ext-lang-zh_CN.js"></script>
<script type="text/javascript"	src="/ttgl/js/userManager/addUser.js"></script>

</head>

<body >
	<div id="form" class="center"></div>
</body>
</html>
