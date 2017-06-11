<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateItemType.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function update(){
			var map = new Map();		
			map.put("typeCode", $("typeCode").value);
			map.put("typeName", $("typeName").value);
			map.put("remark", $("remark").value);
			
			var ajax = new MyAjax();
			ajax.invoke("UpdateItemTypeServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
  <body>
    <h2>修改商品类别信息</h2>
    <hr  size="2" color="#3399ff"/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="0" width="300px" height="250px" rules="none">
	    	<tr id="num1">
	    		<td>商品类别编号:</td>
	    		<td><input id="typeCode" value="${param.typeCode }" readonly="readonly"/></td>
	    	</tr>
	    	<tr id="num2">
	    		<td>类别名称:</td>
	    		<td><input id="typeName" value="${param.typeName }"/></td>
	    	</tr>
	    	<tr id="num1">
	    		<td>备注:</td>
	    		<td>
	    			<input id="remark" value="${param.remark}"/>
	    		</td>
	    	</tr>
	    	<tr id="num2">
	    		<td align="center" colspan="2">
	    			<input type="button" value="修改" onclick="update()"/>&nbsp;&nbsp;&nbsp;&nbsp;
	    			<input type="reset" value="重置"/>
	    			
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
