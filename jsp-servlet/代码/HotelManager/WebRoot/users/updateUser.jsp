<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function update(){
			var map = new Map();
			map.put("userId", $("userId").value);
			map.put("username", $("username").value);
			map.put("userType", $("userType").value);
			map.put("remark", $("remark").value);
			
			var ajax = new MyAjax();
			ajax.invoke("UpdateUserServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
	<link rel ="stylesheet" type ="text/css" href ="css/style.css ">
  </head>
  
  <body>
    <h2>修改用户信息</h2>
    <hr size="2" color="#3399ff"/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="0" rules="none" width="300px" height="200px">
	    	<tr id="num1">
	    		<td>用户ID:</td>
	    		<td>
	    			<input id="userId" value="${param.userId}" readonly="readonly"/>
	    		</td>
	    	</tr>
	    	<tr id="num2">
	    		<td>用户名:</td>
	    		<td>
	    			<input id="username" value="${param.username}"/>
	    		</td>
	    	</tr>
	    	<tr id="num1">
	    		<td>用户类型:</td>
	    		<td><input id="userType" value="${param.userType }"/></td>
	    	</tr>
	    	<tr id="num2">
	    		<td>备注:</td>
	    		<td>
	    			<input id="remark" value="${param.remark}"/>
	    		</td>
	    	</tr>
	    	<tr id="num1">
	    		<td align="center" colspan="2">
	    			<input type="button" value="修改" onclick="update()"/>
	    			<input type="reset" value="重置"/>
	    			
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
