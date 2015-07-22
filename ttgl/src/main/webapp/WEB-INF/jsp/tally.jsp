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
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="记账">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>记账</title>

<%@ include file="/jsp/common/linkBootstraphead.jsp"%>

<base href="<%=basePath%>">

</head>
<body>
	<jsp:include page="nav.jsp" flush="true">
		<jsp:param name="pageName" value="tally" />
	</jsp:include>
	
<div class="page-header">
  <h1>记账 <small>留住生活的点点滴滴</small></h1>
</div>

	<div class="container">
		<section class="row">
			<form class="form-horizontal" action="bill/tally.do" method="POST">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-2">
						<input type="email" class="form-control" id="inputEmail3"
							placeholder="Email">
					</div>
				</div>
			</form>
		</section>
		</form>
	</div>
	<%@ include file="/jsp/common/linkBootstrapfooter.jsp"%>
</body>
</html>