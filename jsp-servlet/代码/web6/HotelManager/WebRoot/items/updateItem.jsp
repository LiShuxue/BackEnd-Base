<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateItem.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/script.js"></script>
	<script type="text/javascript">
		function update(){
			var map = new Map();
			map.put("itemCode", $("itemCode").value);
			map.put("itemName", $("itemName").value);
			map.put("typeCode", $("typeCode").value);
			map.put("itemPrice", $("itemPrice").value);
			map.put("itemUnit", $("itemUnit").value);
			map.put("remark", $("remark").value);
			
			var ajax = new MyAjax();
			ajax.invoke("UpdateItemServlet", map, "POST", true, function(responseText){
				$("msg").innerHTML = responseText;
			});
		}
		
	</script>
  </head>
  
  <body>
    <h2>修改商品信息</h2>
    <hr/>
    
    <span id="msg" style="color:red;"></span>
    
    <form action="" method="post">
	    <table border="1">
	    	<tr>
	    		<td>商品编号:</td>
	    		<td>
	    			<input id="itemCode" value="${param.itemCode}" readonly="readonly"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>商品名称:</td>
	    		<td>
	    			<input id="itemName" value="${param.itemName}"/>
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>所属类别编号:</td>
	    		<td><input id="typeCode" value="${param.typeCode }" readonly="readonly"/></td>
	    	</tr>
	    	<tr>
	    		<td>价格:</td>
	    		<td><input id="itemPrice" value="${param.itemPrice }"/></td>
	    	</tr>
	    	<tr>
	    		<td>单位:</td>
	    		<td>
	    			<input id="itemUnit" value="${param.itemUnit}"/>
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
	    			<a href="QueryItemsServlet?page=${param.page }">返回</a>
	    		</td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
