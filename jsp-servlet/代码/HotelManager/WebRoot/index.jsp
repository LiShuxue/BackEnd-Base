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
<link rel="stylesheet" type="text/css" href="css/style.css">



</head>

<body background="images/beijing.jpg">
	<div>
		<table width="100%" height="65%" border="0" id="table">
			<tr>
				<td colspan="3" width="35%" > <marquee direction="left" behavior="alternate"><font face="微软雅黑" size="+7">欢迎来到xxxr酒店&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本酒店服务包你满意！</font></marquee></td>
			</tr>
			<tr>
				<td rowspan="2" align="right" valign="top" width="550px"></td>
				
				<td width="30%" align="center" >
					<form action="DoLoginServlet" method="post">
					
					<div align="center"><img alt="" src="images/login1.jpg"></div>
					<div id="div1"></div>
						<table border="0" width="60%" height="200px" cellpadding="0" cellspacing="0">
							
							
							<tr id="ziti">
								<td>用户名：</td>
								<td><input type="text" name="username" id="username" /></td>
							</tr>
							<tr id="ziti">
								<td>密&nbsp;码：</td>
								<td><input type="password" name="password" id="password" /></td>
							</tr>
							<tr id="ziti">
								<td align="center" colspan="2">
								<input type="radio" name="usertype" value="1" checked="checked" />系统管理员 
								<input type="radio" name="usertype" value="2" />经理
								<input type="radio" name="usertype" value="3" />酒店前台
									</td>
							</tr>
							<tr>
								<td align="center" colspan="2"><input type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="reset" value="重置" /></td>
							</tr>
						</table>
						
				
					</form>
				</td>
				<td rowspan="2" width="35%"></td>
			
			</tr>
			<tr>
			
			</tr>
					
		</table>
	</div>	
</body>
</html>
