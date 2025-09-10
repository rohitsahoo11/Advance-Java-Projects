<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<form action="CalculatorServlet" method="post">
		Number 1: <input name="number1" placeholder="enter the number" type="text" value="${param.number1}">
		<br><br>
		Number 2: <input name="number2" placeholder="enter the number" type="text" value="${param.number2}"><br><br>
		Operation: <input type="text" placeholder="enter the symbol" name="symbol" value="${param.symbol}"><br><br>
		<input type="submit">
	</form>
	
	<p>Result: ${result}</p>
</body>
</html>