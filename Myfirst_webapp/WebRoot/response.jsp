<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=utf-8"%>
<body>

<%

response.setContentType("text/html;charset=utf-8");

out.print("<h1>response内置对象</h1>");
//out.flush();
PrintWriter wr= response.getWriter();
wr.println("大家好，我是response对象生成的输出流对象");
//response.sendRedirect("dologin.jsp");
//request.getRequestDispatcher("dologin.jsp").forward(request, response);
SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
long s=session.getCreationTime();
session.setAttribute("password", "542500");
session.setMaxInactiveInterval(10);

%>
<br>
sessions时间<%=sf.format(s) %>
用户名:<%=session.getId() %><br>
<a href="index.jsp" target="_blank">转到</a>

</body>