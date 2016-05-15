package w;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class S implements HttpSessionListener {

	int number=0;
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("OnlineNumber--------------created!");
		number++;
		se.getSession().setAttribute("number", number);
		System.out.println("人数为"+number);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		 number--;
		se.getSession().setAttribute("number", number);
		System.out.println("人数为"+number);
		System.out.println("OnlineNumber--------------destoryed!");
	}

}
