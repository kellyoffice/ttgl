<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>天天规律</title>
<link rel="stylesheet" href="/ttgl/css/layout.css" type="text/css"
	media="screen" />
	<script src="/ttgl/js/userManager/jquery-1.5.2.min.js" type="text/javascript"></script>
	<script src="/ttgl/js/userManager/hideshow.js" type="text/javascript"></script>
	<script type="text/javascript">
	$(document).ready(function() {

		//When page loads...
		$(".tab_content").hide(); //Hide all content
		$("ul.tabs li:first").addClass("active").show(); //Activate first tab
		$(".tab_content:first").show(); //Show first tab content

		//On Click Event
		$("ul.tabs li").click(function() {

			$("ul.tabs li").removeClass("active"); //Remove any "active" class
			$(this).addClass("active"); //Add "active" class to selected tab
			$(".tab_content").hide(); //Hide all tab content

			var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
			$(activeTab).fadeIn(); //Fade in the active ID content
			return false;
		});

	});
	</script>
</head>

<body>
	<header id="header">
		<hgroup>
			<h1 class="site_title">天天规律</h1>
			<h2 class="section_title">Every rule</h2>
			<div class="btn_view_site">
				<a href="/ttgl/userController/logout.do">注销</a>
			</div>
		</hgroup>
	</header>
	<section id="secondary_bar">
		<div class="user">
			<p>
				${user.name } (<a href="#">3 Messages</a>)
			</p>
			<!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
		</div>
		<div class="breadcrumbs_container">
			<article class="breadcrumbs">
				<a href="index.html">天天规律</a>
				<div class="breadcrumb_divider"></div>
				<a class="current">Every rule</a>
			</article>
		</div>
	</section>
	<aside id="sidebar" class="column">
		<form class="quick_search">
			<input type="text" value="Quick Search"
				onfocus="if(!this._haschanged){this.value=''};this._haschanged=true;">
		</form>
		<hr />
		<h3>Users</h3>
		<ul class="toggle">
			<li class="icn_profile"><a href="#">用户信息</a></li>
			<li class="icn_add_user"><a href="#">Add New User</a></li>
			<li class="icn_view_users"><a href="#">View Users</a></li>
		</ul>
		<h3>Media</h3>
		<ul class="toggle">
			<li class="icn_folder"><a href="#">File Manager</a></li>
			<li class="icn_photo"><a href="#">Gallery</a></li>
			<li class="icn_audio"><a href="#">Audio</a></li>
			<li class="icn_video"><a href="#">Video</a></li>
		</ul>
		<h3>Admin</h3>
		<ul class="toggle">
			<li class="icn_settings"><a href="#">Options</a></li>
			<li class="icn_security"><a href="#">Security</a></li>
			<li class="icn_jump_back"><a href="#">Logout</a></li>
		</ul>

		<footer>
			<hr />
			<p>
				<strong>Copyright &copy; 2014 Every rule</strong>
			</p>
		</footer>
	</aside>
</body>
</html>
