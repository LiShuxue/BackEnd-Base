<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
</head>

<body>
	<h2>主页面</h2>
    <hr>
    <p>
    	<a href="room/addRoomType.jsp">添加房间类型</a>
    </p>
    <p>
    	<a href="QueryRoomType?page=1">管理房间类型</a>
    </p>
    <p>
    	<a href="room/addFloor.jsp">添加楼层</a>
    </p>
    <p>
    	<a href="QueryFloor?page=1">管理楼层</a>
    </p>
        <p>
    	<a href="room/addRoom.jsp">添加房间</a>
    </p>
    <p>
    	<a href="QueryRoom?page=1">管理房间</a>
    </p>
    <p>
    	<a href="QueryZRoom?page=1">预定、入住</a>
    </p>
    <p>
    	<a href="QueryORoom?page=1">预定信息</a>
    </p>
</body>
</html>
