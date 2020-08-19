<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 에러 발생</title>
</head>
<body>
	요청 처리 과정에서 에러가 발생했습니다.
	<br> 빠른 시간 내에 문제를 해결하도록 하겠습니다.
	
	<%-- <%=exception.getMessage() %> --%>
	
	

	<!-- 타입 예외 보고

	메시지 For input string: ""
	
	설명 서버가, 해당 요청을 충족시키지 못하게 하는 예기치 않은 조건을 맞닥뜨렸습니다.
	
	예외
	
	java.lang.NumberFormatException: For input string: ""
		java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		java.lang.Integer.parseInt(Integer.java:592)
		java.lang.Integer.parseInt(Integer.java:615)
		web_study_02.unit04.ParamServlet.processRequest(ParamServlet.java:35)
		web_study_02.unit04.ParamServlet.doGet(ParamServlet.java:20)
		javax.servlet.http.HttpServlet.service(HttpServlet.java:634)
		javax.servlet.http.HttpServlet.service(HttpServlet.java:741)
		org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
	비고 근본 원인(root cause)의 풀 스택 트레이스를, 서버 로그들에서 확인할 수 있습니다.
	 -->

</body>
</html>