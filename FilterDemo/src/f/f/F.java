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

public class F implements Filter{

	public void destroy() {
		 
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		 System.out.println("Filter11111--------------开始！");
		/* HttpServletRequest req=(HttpServletRequest) arg0;
		 req.getRequestDispatcher("2.jsp").forward(arg0, arg1);
		 */
		/* arg2.doFilter(arg0, arg1);*/
		 
		 HttpServletResponse res=(HttpServletResponse) arg1;
		 res.sendRedirect("2.jsp");
		 System.out.println("Filter11111--------------结束！");
	}

	public void init(FilterConfig arg0) throws ServletException {
	 
		System.out.println("Filter1111-------------初始化！！！");
		
	}
	
	

}
