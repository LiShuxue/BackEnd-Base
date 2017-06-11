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
    
    <title>My JSP 'updateFloor.jsp' starting page</title>
    
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
		function update(){
			var map = new Map();
			map.put("floor", $("floor").value);
			map.put("floorPrice", $("floorPrice").value);
			map.put("remark", $("remark").value);
			var ajax = new MyAjax();
			ajax.invoke("UpdateFloorServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>修改楼层信息</h2>
   <hr  size="2" color="#3399ff"/>
   	<span id="msg" style="color:red;"></span>
   	<form action="" method="post">
   		<table border="0" width="300px" height="200px" rules="none">
	   		<tr id="num1">
	   			<td width="27%">楼&nbsp;&nbsp;层:</td>
	   			<td><input id="floor" value="${param.floor }" readonly="readonly"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td>楼层价格:</td>
	    		<td>
	    			<input id="floorPrice" value="${param.floorPrice}"/>
	    		</td>
	   		</tr>
	   		<tr id="num1">
	   			<td>备&nbsp;&nbsp;注:</td>
	    		<td><input id="remark" value="${param.remark }"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td align="center" colspan="2">
	   				<input type="button" value="提交" onclick="update()">&nbsp;&nbsp;&nbsp;&nbsp;
	   				<input type="reset" value="重置"/>&nbsp;
	    			
	   			</td>
	   		</tr>
   		</table>
   	</form>
  </body>
</html>
