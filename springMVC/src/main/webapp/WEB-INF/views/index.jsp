<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	<h1>This is home page located inside views</h1>
	<h2>If you are watching this text means it is working fine....</h2>
	<%
	String name = (String)request.getAttribute("name");
	Integer age = (Integer)request.getAttribute("age");
	%>
	<h1>
		Name is
		<%=name%>
		age is
		<%=age%>
	</h1>
</body>
</html>