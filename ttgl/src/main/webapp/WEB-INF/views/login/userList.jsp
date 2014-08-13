<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table>
		<caption>用户列表</caption>
		<thead>
			<tr>
				<td>ID</td>
				<td>姓名</td>
				<td>性别</td>
				<td>邮箱</td>
				<td>生日</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr><td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.sex}</td>
					<td>${user.mail}</td>
					<td>${user.birthday}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
