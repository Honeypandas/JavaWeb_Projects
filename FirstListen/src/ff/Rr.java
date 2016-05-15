package ff;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class Rr implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent arg0) {
		 System.out.println("request  destoryed!");

	}

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("request   created!");
		int string=arg0.getServletRequest().getServerPort();
		System.out.println(string);
	}

}
