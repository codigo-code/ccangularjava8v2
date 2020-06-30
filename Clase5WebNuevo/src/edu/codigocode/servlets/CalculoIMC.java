package edu.codigocode.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.codigocode.controlador.CalcularIMCControlador;
import edu.codigocode.modelo.Persona;

public class CalculoIMC extends HttpServlet {

	private static final long serialVersionUID = 7211750232740815359L;

	// get y post

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Como convertir un string en double ---> Double.parseDouble(string)
		Persona p = new Persona(request.getParameter("nombre"), Double.parseDouble(request.getParameter("altura")),
				Double.parseDouble(request.getParameter("peso")));

		CalcularIMCControlador cc = new CalcularIMCControlador();

		RequestDispatcher disp = request.getRequestDispatcher("mostrarImc.jsp");

		// request.setAttribute es un mapa que funciona bajo clave valor
		// la clave definida por nosotr@s y el valor es lo que queremos guardar
		// para recuperar seria request.getAttribute("respuesta"); ---> obj
		request.setAttribute("respuesta", cc.calculoImc(p));
		disp.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Como convertir un string en double ---> Double.parseDouble(string)
		Persona p = new Persona(request.getParameter("nombre"), Double.parseDouble(request.getParameter("altura")),
				Double.parseDouble(request.getParameter("peso")));

		CalcularIMCControlador cc = new CalcularIMCControlador();

		RequestDispatcher disp = request.getRequestDispatcher("imc.jsp");

		// request.setAttribute es un mapa que funciona bajo clave valor
		// la clave definida por nosotr@s y el valor es lo que queremos guardar
		// para recuperar seria request.getAttribute("respuesta"); ---> obj
		request.setAttribute("respuesta", cc.calculoImc(p));
		disp.forward(request, response);

	}

}
