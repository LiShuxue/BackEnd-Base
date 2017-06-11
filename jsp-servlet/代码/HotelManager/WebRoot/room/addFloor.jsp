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
    
    <title>添加楼层信息页面</title>
    
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
		function validateFloor(){
			var map = new Map();
			map.put("floor", ${"floor"}.value);
			var ajax = new MyAjax();
			ajax.invoke("VaFloorServlet", map, "POST", true, function(responseText){
				${"msg"}.innerHTML = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>添加楼层信息</h2>
    <hr  size="2" color="#3399ff"/>
    
    <c:choose>
    	<c:when test="${param.result==1 }">
    		<font color="red">添加成功</font>
    	</c:when>
    	<c:when test="${param.result==0 }">
    		<font color="red">该楼层已存在</font>
    	</c:when>
    </c:choose>
    <form action="AddFloorServlet" method="post" >
    <table border="0" width="300px" height="250px" rules="none">
    	<tr id="num1">
    		<td width="27%">楼&nbsp;&nbsp;层:</td>
    		<td>
    			<input name="floor" id="floor" size="16" onblur="validateFloor()"/>
    			<span id="msg" style="color:red"></span>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>楼层价格:</td>
    		<td>
    			<input name="floorPrice" id="floorPrice" size="16"/>
    		</td>
    	</tr>
    	<tr id="num1">
    		<td>备&nbsp;&nbsp;注:</td>
    		<td><input name="remark" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td align="center" colspan=2>
    			<input type="submit" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置"/>&nbsp;
    			
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
