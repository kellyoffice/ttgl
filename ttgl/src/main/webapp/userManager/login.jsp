<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML">
<html>
<head>
<base href="<%=basePath%>">

<title>用户登陆</title>
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
<script type="text/javascript"	src="/ttgl/js/userManager/login.js"></script>
</head>

<body >
	<c:if test="${! empty sessionWithoutUser}">
	<script type="text/javascript">
	Ext.Msg.alert('提示信息', '${sessionWithoutUser}');
	</script>
	<c:remove var="sessionWithoutUser" scope="session"/>
	</c:if>
	<c:if test="${!empty user}">
	<script type="text/javascript">
	window.location.href = '/ttgl/userController/main.do';
	</script>
	</c:if>
	<div id="form" class="center"></div>
</body>
</html>
