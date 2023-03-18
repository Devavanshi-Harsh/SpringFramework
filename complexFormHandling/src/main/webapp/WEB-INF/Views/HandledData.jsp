<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanks</title>
</head>
<body>
	<h3>Hi ${visitor.getFirstName()} ${visitor.getLastName()}. You are
		registered with ${visitor.getEmail()} email id.</h3>
	<p>
		According to you your Date of Birth is : ${visitor.getDob() } and you have
		completed your ${visitor.getCourse() } <br> you are a ${visitor.getGender() }
		your current residence getAddress() is : <br>
		${visitor.getAddress().getStreetName()}, ${visitor.getAddress().getAddressLineOne()},
		${visitor.getAddress().getAddressLineTwo()}, ${visitor.getAddress().getAreaCode()},
		${visitor.getAddress().getState()}, ${visitor.getAddress().getCountry()}
		<br>
		<br>
		${visitor.getAddress() }
	</p>
	<h1>Thanks for sharing your details...</h1>

</body>
</html>