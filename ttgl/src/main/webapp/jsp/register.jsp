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
   <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="ttgl">
<meta http-equiv="description" content="注册页面">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>注册</title>

<%@ include file="/jsp/common/linkBootstraphead.jsp"%>

<base href="<%=basePath%>">

</head>
<body>
	<div class="container">

		<section class="row">

			<div class="col-xs-12">
				<h2 class="well title text-primary">注册</h2>
			</div>
			<div class="col-md-6">

				<form action="user/register.do" method="POST">
					<!-- 家庭名 -->
					<span class="glyphicons glyphicons-family"></span>
					<div class="form-group clearfix">
						<label for="familyName" class="control-label">家庭名:</label>
						<div class="input-group clearfix">
							<span class="input-group-addon" id="familySpan"><span
								class="glyphicon glyphicon-home"></span></span> <input tabindex="0"
								class="form-control" type="text" id="familyName"
								name="familyName" placeholder="Family Name"
								data-container="body" data-toggle="popover" data-trigger="focus"
								title="家庭名字" data-placement="right"
								data-content="快点来一个高端大气的家庭名字吧。支持中文、英文、特殊字符">
						</div>
					</div>
					<!-- 家庭密码 -->
					<div class="form-group clearfix">
						<label for="password">家庭密码:</label>
						<div class="input-group clearfix">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-lock"></span></span> <input tabindex="1"
								class="form-control" type="password" id="password"
								name="password" placeholder="Password" data-container="body"
								data-toggle="popover" data-trigger="focus" title="家庭密码"
								data-placement="right"
								data-content="设置家庭密码，首次注册所有家庭成员密码一致，每位成员登陆后可设置自己的密码">
						</div>

						<div class="form-group clearfix">
							<label for="username" class="control-label">用户名:</label>
							<div class="input-group clearfix">
								<span class="input-group-addon" id="usernamespan"><span
									class="glyphicon glyphicon-user"></span></span> <input tabindex="2"
									class="form-control" type="text" id="username" name="username"
									placeholder="Username" data-container="body"
									data-toggle="popover" data-trigger="focus" title="用户名字"
									data-placement="right"
									data-content="快告诉我你的名字，其余的家庭成员名字为：你的名字+称谓">
							</div>
						</div>
						
						<div class="form-group clearfix">
							<label for="mail" class="control-label">邮箱:</label>
							<div class="input-group clearfix">
								<span class="input-group-addon" id="mailspan"><span
									class="glyphicon glyphicon-envelope"></span></span> <input tabindex="3"
									class="form-control" type="text" id="mail" name="mail"
									placeholder="email" data-container="body"
									data-toggle="popover" data-trigger="focus"
									data-placement="right"
									data-content="输入自己的邮箱地址。">
							</div>
						</div>

						<div class="form-group clearfix">
							<label for="username" class="control-label">请选择家庭成员</label>
							<div class="checkbox">
								<label class="col-md-3" for="father"> <input
									type="checkbox" id="father" name="relations" value="1" />父亲
								</label> <label class="col-md-3" for="mother"> <input
									type="checkbox" id="mother" name="relations" value="2" />母亲
								</label> <label class="col-md-3" for="husband"> <input
									type="checkbox" id="husband" name="relations" value="3" />丈夫
								</label><label class="col-md-3" for="wife"> <input
									type="checkbox" id="wife" name="relations" value="4" />妻子
								</label>
								
							</div>
						</div>
						<input class="btn btn-block btn-success btn-lg" type="submit"
							id="submit" name="submit" value="注册" />
				</form>

				<hr>
			</div>

		</section>

	</div>
	<!-- /container -->

	<%@ include file="/jsp/common/linkBootstrapfooter.jsp"%>

	<script type="text/javascript">
		$(document).ready(function() {
			$('[data-toggle="popover"]').popover();

		});
	</script>
</body>
</html>

<!-- https://packagist.org/login/ -->