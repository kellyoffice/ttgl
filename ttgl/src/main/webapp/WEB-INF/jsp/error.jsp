<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8" isErrorPage="true" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Exception - 异常信息</title>

<%@ include file="/jsp/common/linkBootstraphead.jsp"%>

<base href="<%=basePath%>">
</head>
<body>
	<div class="container">
		<div class="row">
		<div class="col-md-6 col-md-offset-3">
		<h1>出错了……</h1>
		</div>
		</div>
	</div>

	<%@ include file="/jsp/common/linkBootstrapfooter.jsp"%>
</body>
</html>