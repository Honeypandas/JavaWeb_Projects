package ywq;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Interceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start=System.currentTimeMillis();
		String result=invocation.invoke();
		long end=System.currentTimeMillis();
		System.err.println("执行action花费时间:"+(end-start));
		
		return result;
	}


}