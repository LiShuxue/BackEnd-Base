<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	String s = sdf.format(date);
	out.println(s + "<br>");

%>
