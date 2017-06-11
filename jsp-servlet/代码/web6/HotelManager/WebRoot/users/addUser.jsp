<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function add(){
			var map = new Map();
			map.put("username", $("username").value);
			map.put("userType", $("userType").value);
			map.put("remark", $("remark").value);
			
			var ajax = new MyAjax();
			ajax.invoke("AddUserServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
  </head>
  
  <body>
    <h2>添加用户</h2>
    <hr/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="1">
	    	<tr>
	    		<td>用户名:</td>
	    		<td>
	    			<input id="username"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>用户类别:</td>
	    		<td><input id="userType"/></td>
	    	</tr>
	    	<tr>
	    		<td>备注:</td>
	    		<td>
	    			<input id="remark"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="button" value="添加" onclick="add()"/>
	    			<input type="reset" value="重置"/>
	    			<a href="#">返回</a>	
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
