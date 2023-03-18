<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanks</title>
</head>
<body>
	${comData}
<h1 style = "color:green" >${message}</h1>
	<h1>Thanks so much for signing up here...</h1>
	<h4>
		email is : ${user.email} 
		<br> 
		First Name is : ${user.fName} 
		<br> 
		Last Name is : ${user.lName} 
		<br> 
		password is : ${user.password}
	</h4>
</body>
</html>