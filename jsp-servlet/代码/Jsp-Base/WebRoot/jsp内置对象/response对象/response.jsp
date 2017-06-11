<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=UTF-8"%>
<%
	response.setContentType("text/html; charset=UTF-8");

	out.println("<h1>response内置对象</h1><br>");
	out.println("<hr>");
	//out.flush();//可以避免PrintWriter对象的打印总是显示在最前面
	
	PrintWriter outer = response.getWriter();
	outer.println("我是response对象生成的输出流outer对象");//这个outer对象打印的时候提前于内置out对象
	
	response.sendRedirect("registe.jsp");//重定向
%>

