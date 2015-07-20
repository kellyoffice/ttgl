
<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%
    String pageName = request.getParameter("pageName");
  %>

<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="homepage.jsp">家庭帐</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li <%if( pageName.equals( "homepage")) { out.println("class=\"active\""); }%>> <a href="homepage.jsp">首页</a></li>
				<li <%if( pageName.equals( "tally")) { out.println("class=\"active\""); }%>><a href="/ttgl/bill/tally.do">记账</a></li>
				<li <%if( pageName.equals( "bill")) { out.println("class=\"active\""); }%>><a href="bill.jsp">账单</a></li>
				<li <%if( pageName.equals( "setting")) { out.println("class=\"active\""); }%>><a href="setting.jsp">设置</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="../navbar/">注销</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
