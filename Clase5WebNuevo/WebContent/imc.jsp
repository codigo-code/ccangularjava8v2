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

	<h1>Calcule que tan roto esta :)</h1>

	<form method="get" action="caulcularIMC">
		<input type="text" name="nombre" placeholder="ingrese su nombre" /> <br />
		<input type="text" name="peso" placeholder="ingrese su peso" /><br />
		<input type="text" name="altura" placeholder="ingrese su altura" /> <input
			type="submit" value="caluclar IMC" />
	</form>

</body>
</html>