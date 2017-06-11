<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加客房信息页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function validateRoomType(){
			var map = new Map();
			map.put("roomType", ${"roomType"}.value);
			var ajax = new MyAjax();
			ajax.invoke("VaRoomTypeServlet", map, "POST", true, function(responseText){
				${"msg"}.innerHTML = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>添加用户信息</h2>
    <hr  size="2" color="#3399ff"/>
    
    <c:choose>
    	<c:when test="${param.result==1 }">
    		<font color="red">添加成功</font>
    	</c:when>
    	<c:when test="${param.result==0 }">
    		<font color="red">房间类型已存在</font>
    	</c:when>
    </c:choose>
    <form action="AddRoomTypeServlet" method="post" >
    <table border="0" width="350px" rules="none" height="300px">
    	<tr id="num1">
    		<td width="27%">客房类型:</td>
    		<td>
    			<input name="roomType" id="roomType" size="16" onblur="validateRoomType()"/>
    			<span id="msg" style="color:red"></span>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>额定人数:</td>
    		<td>
    			<input name="roomPeopleNum" id="roomPeopleNum" size="16"/>
    		</td>
    	</tr>
    	<tr id="num1">
    		<td>类型备注:</td>
    		<td><input name="remark" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>房间价格:</td>
    		<td><input name="typePrice" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td align="center" colspan=2>
    			<input type="submit" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置"/>&nbsp;
    			
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
