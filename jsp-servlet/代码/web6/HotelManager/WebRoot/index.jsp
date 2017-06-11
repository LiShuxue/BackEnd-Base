<%@ page language="java" contentType="text/html; charset=utf-8"%>
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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #1D3647;
}
-->
</style>


<link href="images/skin.css" rel="stylesheet" type="text/css">
</head>

<body>
	<form action="DoLoginServlet" method="post">
		<table border="1">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码：</td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input type="radio" name="usertype" value="1" checked="checked" />系统管理员 
				<input type="radio" name="usertype" value="2" />经理
				<input type="radio" name="usertype" value="3" />酒店前台人员 
					</td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="登录" />
					<input type="reset" value="重置" /></td>
			</tr>
		</table>
		<hr />
		<a href="QueryItemsServlet">查询商品信息</a>
		<a href="items/addItem.jsp">添加商品</a>
		<br/>
		<a href="QueryItemTypesServlet">查询商品类别信息</a> 
		<a href="items/addItemType.jsp">添加商品类别</a>
		<br/>
		<a href="QueryUsersServlet">查询所有的用户</a>
		<a href="users/addUser.jsp">添加用户</a>
		<br/>
		<a href="QueryMembersServlet">查询所有的会员</a> 
		<a href="members/addMember.jsp">添加会员</a>
		<br/>
		<a href="CountItemsServlet">所消费的商品信息</a>
		<input name="a" value="${param.sum }"/>
	</form>
</body>
</html>
