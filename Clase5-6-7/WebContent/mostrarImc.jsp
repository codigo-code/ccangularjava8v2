<%@page import="edu.codigocode.modelo.Respuesta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		// recibire un objeto y este objeto tendra la informacion de nuestro resultado
		Respuesta rta = (Respuesta) request.getAttribute("respuesta");

		if (rta == null) {
			response.sendRedirect("error.jsp");
		} else {
	%>

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
	%>

</body>
</html>