<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8"%>
 <!-- 
    	重定向:客户端行为，response.sendRedirect()，从本质上讲等同于两次请求，前一次的请求对象不会保存，地址栏的URL地址会改变
    	
    	请求转发：服务器行为，request.getRequestDisatcher().forward(req, resp);是一次请求，转发后请求的对象会保存，地址栏的URL不会变
 -->

<%
	//重定向
	//response.sendRedirect("request.jsp");
	
	//请求转发
	request.getRequestDispatcher("request.jsp").forward(request, response);
%>

