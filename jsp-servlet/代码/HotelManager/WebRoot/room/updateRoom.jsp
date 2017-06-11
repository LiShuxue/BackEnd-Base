<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改房间信息页面</title>
    
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
			map.put("roomId", $("roomId").value);
			map.put("roomType", $("roomType").value);
			map.put("floor", $("floor").value);
			map.put("roomPrice", $("roomPrice").value);
			map.put("discountPrice", $("discountPrice").value);
			map.put("mprice", $("mprice").value);
			map.put("vipPrice", $("vipPrice").value);
			map.put("remark", $("remark").value);
			var ajax = new MyAjax();
			ajax.invoke("UpdateRoomServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		function showRoomType(){
			var map1 = new Map();
			map1.put("roomType", $("rt").value);
			var map2 = new Map();
			map2.put("floor", $("fl").value);
			var ajax = new MyAjax();
			var ajax1 = new MyAjax();
			ajax.invoke("showRoomTypeServlet", map1, "POST", true, function(responseText){
				$("roomTypes").innerHTML = responseText;
			});
			ajax1.invoke("ShowFloorServlet", map2, "POST", true, function(responseText){
				$("floors").innerHTML = responseText;
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
    <h2>修改房间信息</h2>
   	 <hr  size="2" color="#3399ff"/>
   	<span id="msg" style="color:red;"></span>
   	<form action="" method="post">
   		<input type="hidden" id="rt" value="${param.roomType }">
   		<input type="hidden" id="fl" value="${param.floor }">
   		<table border="0" width="300px" height="300px" rules="none">
	   		<tr id="num1">
	   			<td width="27%">房间编号:</td>
	   			<td><input id="roomId" value="${param.roomId }" readonly="readonly"/></td>
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
	   			<td>标准价格</td>
	    		<td><input id="roomPrice" value="${param.roomPrice }"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td>折后价</td>
	    		<td><input id="discountPrice" value="${param.discountPrice }"/></td>
	   		</tr>
	   		<tr>
	   			<td>会员价格</td>
	    		<td><input id="mprice" value="${param.mprice }"/></td>
	   		</tr>
	   		<tr id="num1">
	   			<td>VIP价格</td>
	    		<td><input id="vipPrice" value="${param.vipPrice }"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td>备注</td>
	    		<td><input id="remark" value="${param.remark }"/></td>
	   		</tr>
	   		<tr>
	   			<td align="center" colspan="2">
	   				<input type="button" value="提交" onclick="update()">&nbsp;&nbsp;&nbsp;&nbsp;
	   				<input type="reset" value="重置"/>&nbsp;
	    			
	   			</td>
	   		</tr>
   		</table>
   	</form>
  </body>
</html>
