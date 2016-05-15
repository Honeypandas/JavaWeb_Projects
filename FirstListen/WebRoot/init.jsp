<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'init.jsp' starting page</title>
    
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
  <%
  	request.setAttribute("request", "requestname");
  	request.getSession().setAttribute("sessionname", "sessionname");
  	request.getSession().getServletContext().setAttribute("ywq", "ywq");
  
   %>
    初始化值的界面！ <br>
     <button onclick="location.href='<%=request.getContextPath()%>/init.jsp'">Init</button>
  <button onclick="location.href='<%=request.getContextPath()%>/destory.jsp'">Destory</button>
  </body>
</html>
