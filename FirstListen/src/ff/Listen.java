package ff;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listen implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
	
		System.out.println("contextDestoryed");
    
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		 
		
		System.out.println("contextInitailized");

	}

}
