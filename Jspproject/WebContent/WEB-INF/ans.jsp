<%@page import="com.examples.MyCalc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = request.getParameter("username");

		String defaultName = (String) pageContext.getAttribute(
				"defaultName", PageContext.SESSION_SCOPE);
		int no1 = Integer.parseInt(request.getParameter("no1"));
		int no2 = Integer.parseInt(request.getParameter("no2"));
		int ans = 0;
	//	MyCalc calc = new MyCalc();
	//	ans = calc.addInt(1, 2);
	//	ans = no1 / no2;
	%>
	<jsp:useBean id="calc" class="com.examples.MyCalc" scope="request" ></jsp:useBean>
	<jsp:setProperty property="no1" name="calc" param ="no1"/>
	<jsp:setProperty property="no2" name="calc" param="no2"/>
	<h1>
		Hello !!
		<%=username%></h1>
	<h2>
		Hi !!<%=defaultName%>
	</h2>
	<h3>
		Ans :
		<jsp:getProperty property="ans" name="calc"></jsp:getProperty></h3>
		<hr/>
		<h2>using Jsp Expression Language</h2>
		<h3>Ans = ${calc.addInt() }
		</h3>
</body>
</html>