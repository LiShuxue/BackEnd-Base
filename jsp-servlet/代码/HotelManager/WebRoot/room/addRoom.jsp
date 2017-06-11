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
    
    <title>添加房间信息页面</title>
    
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
		function showRoomType(){
			var map = new Map();
			var ajax = new MyAjax();
			var ajax1 = new MyAjax();
			var ajax2 = new MyAjax();
			ajax.invoke("showRoomTypeServlet", map, "POST", true, function(responseText){
				$("roomTypes").innerHTML = responseText;
			});
			ajax1.invoke("ShowFloorServlet", map, "POST", true, function(responseText){
				$("floors").innerHTML = responseText;
			});
			ajax2.invoke("ShowRoomIdServlet", map, "POST", true, function(responseText){
				$("roomId").value = responseText;
			});
		}
		function show(){
			var map = new Map();
			map.put("roomType", $("roomType").value);
			map.put("floor", $("floor").value);
			var ajax = new MyAjax();
			
			ajax.invoke("ShowRoomPriceServlet", map, "POST", true, function(responseText){
				$("roomPrice").value = responseText;
				$("discountPrice").value = responseText;
				$("mprice").value = responseText;
				$("vipPrice").value = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body onload="showRoomType()">
    <h2>添加房间信息</h2>
    <hr  size="2" color="#3399ff"/>
    <c:choose>
    	<c:when test="${param.result==1 }">
    		<font color="red">添加成功</font>
    	</c:when>
    	<c:when test="${param.result==0 }">
    		<font color="red">添加失败!!</font>
    	</c:when>
    </c:choose>
    <form action="AddRoomServlet" method="post" >
    <table border="0" width="350px" height="500px" rules="none">
    	<tr id="num1">
    		<td width="27%">客房编号:</td>
    		<td>
    			<input name="roomId" id="roomId" size="16" value="" readonly="readonly"/>
    		</td>
    	</tr>
    	<tr id="num2">
    		<td>客房类型:</td>
    		<td id="roomTypes">
    		</td>
    	</tr>
    	<tr>
    	
    		<td>楼层:</td>
    		<td id="floors"></td>
    	</tr>
    	<tr id="num1">
    		<td>标准价格:</td>
    		<td><input id="roomPrice" name="roomPrice" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>折后价:</td>
    		<td><input name="discountPrice" id="discountPrice" size="16"/></td>
    	</tr>
    	<tr >
    		<td>普通会员价:</td>
    		<td><input name="mprice" id="mprice" size="16"/></td>
    	</tr>
    	<tr id="num1">
    		<td>VIP会员价:</td>
    		<td><input name="vipPrice" id="vipPrice" size="16"/></td>
    	</tr>
    	<tr id="num2">
    		<td>备注:</td>
    		<td><input name="remark" size="16"/></td>
    	</tr>
    	<tr>
    		<td align="center" colspan=2>
    			<input type="submit" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置"/>&nbsp;
    			
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
