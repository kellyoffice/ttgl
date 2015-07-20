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
<meta http-equiv="keywords" content="ttgl">
<meta http-equiv="description" content="注册页面">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>登陆</title>

<%@ include file="/jsp/common/linkBootstraphead.jsp"%>

<base href="<%=basePath%>">
</head>
<body>
	<div class="container">

		<section class="row">

			<div class="col-xs-12">
				<h2 class="well title text-primary">用户名密码登陆</h2>
			</div>
			<div class="col-md-6">

				<form action="user/login.do" method="POST">
					<div class="form-group clearfix">
						<label for="name">用户名:</label>
						<div class="input-group clearfix">
							<span class="input-group-addon" id="basic-addon1"><span
								class="glyphicon glyphicon-user"></span></span> <input tabindex="0"
								class="form-control" type="text" id="name" name="name"
								placeholder="Username" aria-describedby="basic-addon1">

						</div>
					</div>

					<div class="form-group clearfix">
						<label for="password">密码:</label>
						<div class="input-group clearfix">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-lock"></span></span> <input tabindex="1"
								class="form-control" type="password" id="password"
								name="password" placeholder="Password">
						</div>
					</div>

					<div class="checkbox">
						<a class="pull-right" href="/resetting/request">Forgot
							password?</a> <label for="remember_me"> <input
							type="checkbox" id="remember_me" name="_remember_me" value="on"
							checked="checked" />Remember me
						</label>
					</div>

					<input type="hidden" name="_target_path"
						value="https://packagist.org/" /> <input
						class="btn btn-block btn-success btn-lg" type="submit"
						id="_submit" name="_submit" value="登录" />
				</form>

				<hr>
			</div>

		</section>

	</div>
	<!-- /container -->

	<%@ include file="/jsp/common/linkBootstrapfooter.jsp"%>
</body>
</html>

<!-- https://packagist.org/login/ -->