<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html lang="zh-cn">
  <head>
    <base href="<%=basePath%>">
    
    <title>帐号登录</title>
    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="ttgl,天天规律">
	<meta http-equiv="description" content="天天规律登陆页面">
	<link rel="icon" href="favicon.ico">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- Bootstrap -->
    <link href="js/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index/signin.css" rel="stylesheet">
	<!--[if lt IE 9]>
      <script src="js/assert/html5shiv.min.js"></script>
      <script src="js/assert/respond.min.js"></script>
    <![endif]-->

  </head>
  
  <body>
      <div class="container">

      <form class="form-signin" action="userController/login.do" method="post">
        <h2 class="form-signin-heading">帐号登录</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="mail" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住账号
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>

    </div> <!-- /container -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery/jquery-1.11.2.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap-3.3.2/js/bootstrap.min.js"></script>
  </body>
</html>
