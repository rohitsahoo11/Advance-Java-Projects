package com.calculator;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		String sym = request.getParameter("symbol");
		
		int result = 0;
		
		switch (sym) {
			case "+": {
				result = num1+num2;
				break;
			}
			case "-":{
				result = num1-num2;
				break;
			}
			case "*":{
				result = num1*num2;
				break;
			}
			case "/": {
				result = num1/num2;
				break;
			}
		
		}
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("calculator.jsp");
		rd.forward(request, response);
		
		
	}
	
}
