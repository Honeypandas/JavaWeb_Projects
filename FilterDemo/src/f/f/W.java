package f.f;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class W implements Filter{

	public void destroy() {
		 
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		 System.out.println("Filter22222--------------��ʼ��");
	//	  HttpServletRequest req=(HttpServletRequest) arg0;
		// req.getRequestDispatcher("1.jsp").forward(arg0, arg1); 
		 HttpServletResponse res=(HttpServletResponse) arg1;
		 res.sendRedirect("1.jsp");
		 System.out.println("Filter2222--------------������");
	}

	public void init(FilterConfig arg0) throws ServletException {
	 
		System.out.println("Filter222222-------------��ʼ��������");
		
	}
	
	

}
