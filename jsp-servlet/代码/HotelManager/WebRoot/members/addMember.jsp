<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addMember.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function add(){
			var map = new Map();
			map.put("mname", $("mname").value);
			map.put("msex", $("msex").value);
			map.put("mphone", $("mphone").value);
			map.put("maddress", $("maddress").value);
			map.put("memail", $("memail").value);
			map.put("mpoints", $("mpoints").value);
			map.put("mtype", $("mtype").value);
			map.put("mbookTime", $("mbookTime").value);
			map.put("mpresetTime", $("mpresetTime").value);
			map.put("remark", $("remark").value);
			
			var ajax = new MyAjax();
			ajax.invoke("AddMemberServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
  <body>
    <h2>添加会员</h2>
    <hr size="2" color="#3399ff">
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="0" width="500px" height="500px" rules="none" id="table" align="center">
	    	<tr bgcolor="66ccff">
	    		<td>姓名:</td>
	    		<td width="60%">
	    			<input id="mname"/ width="100%">
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>性别:</td>
	    		<td><input id="msex"/></td>
	    	</tr>
	    	<tr bgcolor="cccccc">
	    		<td>联系方式:</td>
	    		<td>
	    			<input id="mphone"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>地址:</td>
	    		<td><input id="maddress"/></td>
	    	</tr>
	    	<tr bgcolor="66ccff">
	    		<td>邮箱:</td>
	    		<td>
	    			<input id="memail"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>积分:</td>
	    		<td><input id="mpoints"/></td>
	    	</tr>
	    	<tr bgcolor="cccccc">
	    		<td>会员类型:</td>
	    		<td>
	    			<input id="mtype"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>最后一次预定时间:</td>
	    		<td><input id="mbookTime"/></td>
	    	</tr>
	    	<tr bgcolor="66ccff">
	    		<td>最后一次入住时间:</td>
	    		<td>
	    			<input id="mpresetTime"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>备注:</td>
	    		<td>
	    			<input id="remark"/>
	    		</td>
	    	</tr>
	    	<tr bgcolor="cccccc">
	    		<td align="center" colspan="2">
	    			<input type="button" value="添加" onclick="add()"/>&nbsp;&nbsp;&nbsp;
	    			<input type="reset" value="重置"/>&nbsp;&nbsp;&nbsp;
	    				
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
