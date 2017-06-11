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
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
		//用户名文本框失去焦点事件方法
		function validateName(){
			var map = new Map();
			map.put("username", $("uname").value);
			
			var ajax = new MyAjax();
			ajax.invoke("VaUNameServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
	</script>
  </head>
  
  <body>
    <h2>添加用户信息</h2>
    <hr/>
    
    <c:choose>
    	<c:when test="${param.result == 1}">
    		<font color="red">添加成功</font>
    	</c:when>
    	<c:when test="${param.result == 0}">
    		<font color="red">用户已存在</font>
    	</c:when>
    </c:choose>
    
    <form action="AddServlet" method="post">
    	
	    <table border="1">
	    	<tr>
	    		<td>用户名:</td>
	    		<td>
	    			<input name="uname" id="uname" size="12" onblur="validateName()"/>
	    			<span id="msg" style="color:red;"></span>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>出生日期:</td>
	    		<td><input name="birth" onClick="SelectDate(this,'yyyy-MM-dd')" readonly="readonly"/></td>
	    	</tr>
	    	<tr>
	    		<td>联系电话:</td>
	    		<td><input name="phone"/></td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="submit" value="添加"/>
	    			<input type="reset" value="重置"/>
	    			<a href="index.jsp">返回</a>
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>














