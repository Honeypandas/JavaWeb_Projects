<%@ page language="java" import="java.util.* " contentType="text/html; charset=utf-8"%>
<%@ page import="java.text.*" %>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
   	<!-- html asdasdas --> 
   	<%--uwqwu --%>
   
   
   	<%!
   	String s="张山";
   	int add(int x,int y)
   	{
   		return x+y;
   	}
   	 %>
   	
   	<br>
   	你好,<%=s %>
   	x+y=<%=add(11,5) %><br>
   	<%
   	out.println("hello world!");
   	 %>
   	 <%
   	  SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日");
   	  String s=sf.format(new Date());
   	  
   	  %>
   	 <br>
   	 今天是:<%=s %>
   	 <br>
   	 用户名:<%=session.getId() %>
   	 密码:<%=session.getAttribute("password") %>
    This is my first Web page!你好！<br>
  </body>
</html>
