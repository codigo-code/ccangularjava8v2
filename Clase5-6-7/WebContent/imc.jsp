<%@page import="edu.codigocode.modelo.ErrorImc"%>
<%@page import="edu.codigocode.modelo.Respuesta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	color: red;
}
</style>

</head>
<body>

		<%
		ErrorImc errorImc = (ErrorImc) request.getAttribute("error");
		
		if(errorImc == null){
		
		// recibire un objeto y este objeto tendra la informacion de nuestro resultado
		Respuesta rta = (Respuesta) request.getAttribute("respuesta");

		if (rta == null) {
	 %>
		
		<h1>Calcule que tan roto esta :)</h1>
		<%
			String imagen = "img/homer.jpg";
		%>
		<img width="50" src=<%=imagen%> />
	
		<form method="post" action="caulcularIMC">
			<input type="text" name="nombre" placeholder="ingrese su nombre" /> <br />
			<input type="text" name="peso" placeholder="ingrese su peso" /><br />
			<input type="text" name="altura" placeholder="ingrese su altura" /> <input
				type="submit" value="caluclar IMC" />
		</form>
			
	<% 	
		} else {
	%>	
			<h1>IMC.JSP</h1>
			<h2><%=rta.getNombre()%></h2>
			<br>
			<i>Resultado de su IMC es </i>,
			<b><%=rta.getResultadoIMC()%></b>
			<br />
			<span>Su imagen</span>
			<br />
			<img width="20%" src="<%=rta.getPathImg()%>" />

	<%
		}
		}else{
			// volvio el objeto 
			%>
				<h3><%= errorImc.getMensaje() %></h3>
				<form method="post" action="caulcularIMC">
					<input type="text" name="nombre" placeholder="ingrese su nombre" /> <br />
					<input type="text" name="peso" placeholder="ingrese su peso" /><br />
					<input type="text" name="altura" placeholder="ingrese su altura" /> <input
						type="submit" value="caluclar IMC" />
				</form>
			
			<% 
		}
	%>






</body>
</html>