<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h3> JSP ---> JAVA SERVER PAGE </h3>
  codigo html + codigo java <br/>
  <h2>Scriplets!</h2>
	
  <h3>		
	  <% 
	       String nombre="dante";
	  	   out.println(nombre);
	  	   out.println("hola mundo");
	  	   
	  %>
  </h3>
  
  <br/>
  
  <%
  	out.println("<i>hola</i> <br/>");
  	out.println("<b>mundo</b>");
  %>
  
</body>
</html>