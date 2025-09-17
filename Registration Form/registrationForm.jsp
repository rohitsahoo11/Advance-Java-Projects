<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="RegistrationServlet" method="post">
		Name:<input type="text" placeholder="Enter your name" name="name"><br><br>
		Email:<input type="email" placeholder="Enter your email" name="email"><br><br>
		Password:<input type="password" placeholder="Enter your password" name="password"><br><br>
		<input type="submit" value="Register">
		
	</form>
</body>
</html>