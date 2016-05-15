package ywq;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport{

	
	
 
	public String execute() {
		System.out.println("Ö´ÐÐAction!");
		return SUCCESS;
		
	}
	
}
