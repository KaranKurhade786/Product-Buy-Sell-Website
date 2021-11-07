<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Price</title>
<link rel="stylesheet" href="myfile2.css">
</head>
<style>
body {
  background-image: url('nature.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<div class="wrapper">
   <div class="logo">
 
    </div>
<div class="main">
<div class="one">
<div class="register">
<h3><center>Update Product Price</center></h3>
<form name="frm" action="priceup" method="post" >
<table>
 <tr>
 <td>Srno</td>
 <td><input type="text" name="srno"></td>
 </tr>
 <td>New Price</td>
 <td><input type="text" name="price"></td>
 </tr>
  <tr>
 <td><input type="Submit" value="submit"></td>
 </tr>
</table>
</form>
<h2><center><a href="index.jsp">Back</a></center></h2></body>
</html>