<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Section</title>
</head>
<body>
	<%--controller to view data shift --%>
	<%
	String book= (String)request.getAttribute("book");
	String cost= (String)request.getAttribute("cost");
	String author= (String)request.getAttribute("Author");
	LocalDateTime dateTime= (LocalDateTime)request.getAttribute("time");
	List<String> listObject = (List<String>)request.getAttribute("listObject");
	%>
	<h1>
		Book Name is
		<%=book%>
		<br> ${book} <br> Book Cost is
		<%=cost%>
		<br> Book Author is
		<%=author%>
		<br> Current time is
		<%=dateTime%>
		<hr>
		${listObject}

	</h1>
	<hr>
	<h2>
		<c:forEach var="item" items="${listObject}">
			<h2>${item}</h2>
			<c:out value="${item }"></c:out>
		</c:forEach>
	</h2>
	<%--view to controller data shift --%>
</body>
</html>