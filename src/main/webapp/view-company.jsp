<%@page import="dao.DaoCompany"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("name_company");
%>
Successful!!<br> you added new company in DataBase: <br>
<strong ><%= name %></strong>

	<%!
   	 int amount = 0;
	%>
	<% amount++; %>
	<br>
	You visited this page <%= amount %> times
	
	
	
	
	
</body>
</html>