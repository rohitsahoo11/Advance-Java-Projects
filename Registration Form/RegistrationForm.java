package com.registrationform;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationForm extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String url = "url";
		String usr = "username";
		String pwd = "pwd";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,usr,pwd);
			PreparedStatement ps = conn.prepareStatement("INSERT INTO USERS (NAME, EMAIL, PASSWORD) VALUES (?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			int row = ps.executeUpdate();
			
			if(row>0) {
				request.setAttribute("name", name);
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}
			else {
                response.getWriter().println("Error in registration!");
            }
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
