<%@page import="servlet.ywq"%>
<%@ page language="java" import="java.util.*,servlet.ywq.*" pageEncoding="utf-8"%>
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
	
	<script type="text/javascript">
		function reloadCode()
		{
			document.getElementById("ic").src="<%=request.getContextPath()%>/servlet/ImageServlet";
		}
	
	
	</script>
  </head>
  
  <body>
  <form action="<%=request.getContextPath()%>/servlet/LoginServlet"method="get">
   	验证码<input type="text" name="checkcode"/>
   	<img id="ic" alt="验证码" src="<%=request.getContextPath()%>/servlet/ImageServlet" onclick="javascript:reloadCode()"/>
   	<a href="javascript:reloadCode()">看不清</a><br>
   	<input type="submit" value="提交">
   	
   	
   	</form>
   	
   	<%
   		ywq y=new ywq();
   		
   	 %>
   	 string=<%out.print(y.s); %>
   	<br>
  </body>
</html>
