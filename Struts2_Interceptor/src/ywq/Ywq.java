package ywq;

import com.opensymphony.xwork2.ActionSupport;

public class Ywq extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		for(int i=0;i>10000;i++)
		{
			System.err.println("YWQ");
		}

		return SUCCESS;

	}

}
