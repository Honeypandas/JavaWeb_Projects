<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <% request.setCharacterEncoding("utf-8"); 
  request.setAttribute("password","123");
  
  %>
	用户名:<%=request.getParameter("username") %>    
	<br>
	爱好:<%String[] f=request.getParameterValues("favorite");
	
	if(request.getParameterValues("favorite")!=null){
	for(int i=0;i<f.length;i++)
	{
		out.print(f[i]+"&nbsp;&nbsp");
	}
	}
	 %><br>
	 
	密码:<%=request.getAttribute("password") %>		
 	请求文件长度:<%=request.getContentLength() %>
 <br>
  </body>
</html>
