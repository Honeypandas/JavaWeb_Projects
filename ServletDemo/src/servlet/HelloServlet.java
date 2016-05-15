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
			
		 System.out.println("处理GET()请求！");
		 response.setContentType("text/html; charset=utf-8");
		 PrintWriter out=response.getWriter();
		
		 out.println("<strong>HelloServlet!</strong><br>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Post()请求！");
		 PrintWriter out=response.getWriter();
		 response.setContentType("text/html; charset=utf-8");
		 out.println("<strong>HelloServlet!</strong><br>");
	}

}
