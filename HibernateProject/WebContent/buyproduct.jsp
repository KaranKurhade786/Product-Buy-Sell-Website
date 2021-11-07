<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bean.*" %>
      <%@page import="entity.*" %>
    <%@page import="org.hibernate.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Product</title>
<link rel="stylesheet" href="myfile2.css"> 
</head>
<body>
<%
 int i=Integer.parseInt(request.getParameter("id"));
 sessionbean obj=new sessionbean();
 Session ses=obj.getSes();
 Query q=ses.createQuery("from Product where srno= :cm");
 q.setParameter("cm",i);
 List ls=q.getResultList();
 Product obj1=(Product)ls.get(0);
 %>
<div class="wrapper">
   <div class="logo">
 
    </div>
<div class="main">
<div class="one">
<div class="register">
  <h2><center>Buyer's Information</center></h2>
  
  <h3>Product details:</h3>
  <%
  if(ls.isEmpty())
  {
 	%><h4>Not Found Any Product</h4>
  <%}
  else
  {
   %>
  <table>
    <tr>
    <td>Product Id:<%=obj1.getProdid() %></td>
    </tr>
     <tr>
    <td>Name:<%=obj1.getProdnm() %></td>
    </tr>
     <tr>
    <td>Price:<%=obj1.getPrices() %></td>
    </tr>
   
  </table>
<%} %>
   <br><br>
   <hr>
   <form action="AddProduct1" method="post">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" class="form-control"></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="text" name="age"  class="form-control"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" class="form-control"></td>
            </tr>
              <tr>
                <td>Card Number</td>
                <td><input type="text" name="cdno" class="form-control"></td>
            </tr>
            <tr>
                <td>Payble Amt.</td>
                <td><input type="text" name="amt" value="<%=obj1.getPrices() %> " readonly class="form-control"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit" class="form-control"></td>
                <td></td>
            </tr>
        </table>

</body>
</html>