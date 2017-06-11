<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/script.js"></script>
  </head>
  
  <body>
   	<script type="text/javascript">
   		var map = new Map();
   		//向map中存数据
   		map.put("p1", 100);
   		map.put("p2", 200);
   		map.put("p3", 300);
   		//通过get来获取数据，提供一个key
   		//alert(map.get("p2"))
   		//获得所有的key
   		var ks = map.keySet();
   		for(idx in ks) {
   			alert("key:" + ks[idx] + ",value:" + map.get(ks[idx]));
   		}
   		alert("map中的元素数量是：" + map.size());
   		</script>
  </body>
</html>
