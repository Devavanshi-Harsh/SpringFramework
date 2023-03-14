<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
	<h1>this is About Page</h1>
	<%
	List<String> str = (List<String>) request.getAttribute("list");
	%>
	<h1><%
	for (String s: str){
		out.println(s);
	}
	%></h1>
	<hr>

</body>
</html>