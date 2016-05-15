<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Out.jsp' starting page</title>
    
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
  <%-- <%! String s="js"; %>
 	
 	缓冲区大小:<%=out.getBufferSize() %>
 	<br>
 	缓冲区剩余:	<%=out.getRemaining() %>
 	<br>
 	<%
 	//抛出异常
 	out.flush();
 	%>
 	缓冲区大小:<%=out.getBufferSize() %>
 	<br>
 	缓冲区剩余:	<%=out.getRemaining() %>
   --%>
  
 <%-- 	<% out.print(s); %> --%>
	<h1>用户登录</h1>
	<hr>
	<form action="dologin.jsp" name="loginForm" method="post">
	<table>
	<tr>
	<td>用户名</td>
	<td><input type="text" name="username"/></td>
	</tr>
	
	
	<tr>
	<td>密码</td>
	<td><input type="password" name="password"/></td>
	</tr>
	
	<tr> 
	<td colspan="2">
	<input type="submit" name="登陆"/>
	</td>
	</tr>
	</table>
	</form>
	<br>
	<hr>
	
	<h1>用户注册</h1>
	
	<form  action="response.jsp"  name="loginForms" method="post">
	<table>
	<tr>
	<td>用户名</td>
	<td><input type="text" name="username"/></td>
	</tr>
	
	
	<tr>
	<td>爱好</td>
	<td><input type="checkbox" name="favorite" value="read">读书
	<input type="checkbox" name="favorite" value="football">看球
	<input type="checkbox" name="favorite" value="movie">看电影
	<input type="checkbox" name="favorite" value="song">听歌
	</td>
	</tr>
	
	<tr> 
	<td colspan="2"><input type="submit" name="注册"/>
	
	</td>
	</tr>
	

	</table>
	</form>
	
	
	<br>
	<a href="dologin.jsp?username=jjjs"> 测试</a>
	
	
	
	
  </body>
</html>
