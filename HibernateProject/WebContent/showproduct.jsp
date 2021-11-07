<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bean.sessionbean" %>
     <%@page import="org.hibernate.*" %>
     <%@ page import="java.util.*" %>
     <%@page import="entity.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<style>
body {
  background-image: url('nature.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<table >
  <thead>
    <tr>
      <th class="header">Srno</th>
      <th class="header">ProdId</th>
      <th class="header">Product Name</th>
      <th class="header">Salesperson</th>
      <th class="header">prices</th>
       <th class="header">Purchase</th>
    </tr>
  </thead>
  <tbody>
<%
try
{
	sessionbean obj=new sessionbean();
     Session ses=obj.getSes();
     Query q=ses.createQuery("from Product");
	 List ls=q.getResultList();
	 for(int i=0;i<ls.size();i++)
	 {
		 Product obj1=(Product)ls.get(i);		
		 %>
		 <tr>
		 <td><%=obj1.getSrno()%>
		 
		 <td><%=obj1.getProdid() %>
		 
		 <td><%=obj1.getProdnm() %>
		 <td><%=obj1.getSalesperson()%>
		 <td><%=obj1.getPrices() %>
		 <td><a href=<%="\"buyproduct.jsp?id="+obj1.getSrno()+"\""%> >Buy</a>
		 <%
	 }
}
catch(Exception e)
{
	out.println(e);
}
%>




</table>
<br>

<center><a href="index.jsp"><h2>Home</h2></a></center>
</body>
</html>