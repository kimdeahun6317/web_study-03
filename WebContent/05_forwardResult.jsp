<%@page import="com.sun.javafx.collections.SetAdapterChange"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name =(String)request.getAttribute("name");
	String age = request.getParameter("age");
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body bgcolor="pink">
forward 방식으로 이동된 페이지 <br>
 나이 : <%=age %>
 이름 : <%=name %>
</body>
</html>