<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<!-- 日期选择框 -->
	<script type="text/javascript" src="js/calendar.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
	
	<script type="text/javascript">
		function update(){
			var map = new Map();
			map.put("username", $("username").value);
			map.put("password", $("password").value);
			map.put("birthday", $("birthday").value);
			map.put("phone", $("phone").value);
			
			var ajax = new MyAjax();
			ajax.invoke("UpdateServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
  </head>
  
  <body>
    <h2>修改用户信息</h2>
    <hr/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="1">
	    	<tr>
	    		<td>用户名:</td>
	    		<td>
	    			<%-- <input type="hidden" name="id" value="${param.id }"/> --%>
	    			<input id="username" value="${param.username}" readonly="readonly"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>密码:</td>
	    		<td>
	    			<input id="password" value="${param.password}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>出生日期:</td>
	    		<td><input id="birthday" value="${param.birthday }" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly"/></td>
	    	</tr>
	    	<tr>
	    		<td>联系电话:</td>
	    		<td><input id="phone" value="${param.phone }"/></td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="button" value="修改" onclick="update()"/>
	    			<input type="reset" value="重置"/>
	    			<a href="QueryUsers?page=${param.page }">返回</a>
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
