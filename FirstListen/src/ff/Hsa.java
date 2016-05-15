package ff;

import java.util.Currency;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class Hsa implements ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent arg0) {
		
		 System.out.println("servletcontextAttribute _add :"+ arg0.getName());
		 

	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
	 
		 System.out.println("servletcontextAttribute _remove :"+ arg0.getName());
	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		 System.out.println("servletcontextAttribute _replace:"+ arg0.getName());

	}

}
