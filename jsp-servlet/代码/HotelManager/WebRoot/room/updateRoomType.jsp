<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>客房类型信息修改页面</title>
    
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
			map.put("roomType", $("roomType").value);
			map.put("roomPeopleNum", $("roomPeopleNum").value);
			map.put("remark", $("remark").value);
			map.put("typePrice", $("typePrice").value);
			var ajax = new MyAjax();
			ajax.invoke("UpdateRoomTypeServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>修改用户信息</h2>
   	 <hr  size="2" color="#3399ff"/>
   	<span id="msg" style="color:red;"></span>
   	<form action="" method="post">
   		<table border="0" width="300px" height="300px" rules="none">
	   		<tr id="num1">
	   			<td width="27%">客房类型:</td>
	   			<td><input id="roomType" value="${param.roomType }" readonly="readonly"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td>额定人数:</td>
	    		<td>
	    			<input id="roomPeopleNum" value="${param.roomPeopleNum}"/>
	    		</td>
	   		</tr>
	   		<tr id="num1">
	   			<td>类型备注:</td>
	    		<td><input id="remark" value="${param.remark }"/></td>
	   		</tr>
	   		<tr id="num2">
	   			<td>房间价格:</td>
	    		<td><input id="typePrice" value="${param.typPrice }"/></td>
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
