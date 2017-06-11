<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateMember.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function update(){
			var map = new Map();
			map.put("mid", $("mid").value);
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
			ajax.invoke("UpdateMemberServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
  </head>
  
  <body>
    <h2>修改会员信息</h2>
    <hr/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="1">
	    	<tr>
	    		<td>会员ID:</td>
	    		<td>
	    			<input id="mid" value="${param.mid}" readonly="readonly"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>姓名:</td>
	    		<td>
	    			<input id="mname" value="${param.mname}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>性别:</td>
	    		<td><input id="msex" value="${param.msex }"/></td>
	    	</tr>
	    	<tr>
	    		<td>联系方式:</td>
	    		<td>
	    			<input id="mphone" value="${param.mphone}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>地址:</td>
	    		<td><input id="maddress" value="${param.maddress }"/></td>
	    	</tr>
	    	<tr>
	    		<td>邮箱:</td>
	    		<td>
	    			<input id="memail" value="${param.memail}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>积分:</td>
	    		<td><input id="mpoints" value="${param.mpoints }"/></td>
	    	</tr>
	    	<tr>
	    		<td>会员类型:</td>
	    		<td>
	    			<input id="mtype" value="${param.mtype}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>最后一次预定时间:</td>
	    		<td><input id="mbookTime" value="${param.mbookTime }"/></td>
	    	</tr>
	    	<tr>
	    		<td>最后一次入住时间:</td>
	    		<td>
	    			<input id="mpresetTime" value="${param.mpresetTime}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>备注:</td>
	    		<td>
	    			<input id="remark" value="${param.remark}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td align="center" colspan="2">
	    			<input type="button" value="修改" onclick="update()"/>
	    			<input type="reset" value="重置"/>
	    			<a href="QueryMembersServlet?page=${param.page }">返回</a>
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
