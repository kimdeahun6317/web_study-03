<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP - import</title>
</head>
<body>

<%
 Calendar date =  Calendar.getInstance();
SimpleDateFormat toDay = new SimpleDateFormat("yyyy년 MM월 dd일");
SimpleDateFormat toNow = new SimpleDateFormat("hh시 mm분 ss초");
%>


오늘은 <b> <%=toDay.format(date.getTime()) %> </b> 입니다.<br>
지금 시각은 <b> <%=toNow.format(date.getTime()) %> </b>


</body>
</html>