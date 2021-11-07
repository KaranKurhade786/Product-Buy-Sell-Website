<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bean.*" %>
    <%@page import="org.hibernate.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  int srno=Integer.parseInt(request.getParameter("id"));
System.out.println(srno);
try
{
  sessionbean obj=new sessionbean();
  Session ses=obj.getSes();
  Query q=ses.createQuery("delete from Product where srno= :sr");
  q.setParameter("sr", srno);
 
  int i=q.executeUpdate();
 
  if(i>0)
  {
	  out.println("Successfully deleted");
  }
  else
  {
	  out.println("Failed to delete");
  }
  ses.getTransaction().commit();
	ses.close();
}
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>