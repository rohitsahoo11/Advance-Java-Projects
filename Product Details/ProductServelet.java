import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductServelet")
public class ProductServelet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String product = request.getParameter("product");
		String name = "";
		double price = 0.0;
		String desc = "";
		
		switch (product) {
			case "volvo": {
				name = "Volvo";
				price = 50000;
				desc = "Good Car";
				break;
			}
			case "saab":{
				name = "Saab";
				price = 35000;
				desc = "Avg Car";
				break;
			}
			case "mercedes":{
				name = "Mercedes";
				price = 64000;
				desc = "Best Car";
				break;
			}
			case "audi":{
				name = "Audi";
				price = 55000;
				desc = "God Car";
				break;
			}
		}
		
		request.setAttribute("name", name);
		request.setAttribute("price", price);
		request.setAttribute("desc", desc);
		
		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
	}
}
