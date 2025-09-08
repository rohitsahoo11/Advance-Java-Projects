<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>-----Login Page-----</h2>
	<form action="LoginServlet" method="post">
		User Name: <input placeholder="enter the name" type="text" name="username"><br>
		Password: <input type="password" placeholder="password" name="password"><br>
		<input type="submit">
	</form>
	
	<p style="color:red;">
		${errorMessage}
	</p>
	
</body>
</html>