package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		 System.out.println("����GET()����");
		 response.setContentType("text/html; charset=utf-8");
		 PrintWriter out=response.getWriter();
		
		 out.println("<strong>HelloServlet!</strong><br>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("����Post()����");
		 PrintWriter out=response.getWriter();
		 response.setContentType("text/html; charset=utf-8");
		 out.println("<strong>HelloServlet!</strong><br>");
	}

}
