<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>

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
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>家庭账-主页</title>

<%@ include file="/jsp/common/linkBootstraphead.jsp"%>

<base href="<%=basePath%>">
</head>
<body class="skin-blue sidebar-mini">
	<div class="wrapper">
		<jsp:include page="nav.jsp" flush="false" />
		<jsp:include page="aside.jsp" flush="false" />
		<jsp:include page="../content/dashboard.jsp" flush="false" />
		<jsp:include page="footer.jsp" flush="false" />
		<jsp:include page="sidebar.jsp" flush="false" />
	</div>

	<%@ include file="/jsp/common/linkBootstrapfooter.jsp"%>
</body>
</html>