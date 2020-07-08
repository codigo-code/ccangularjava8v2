package edu.codigocode.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.codigocode.controlador.CalcularIMCControlador;
import edu.codigocode.modelo.Persona;

public class CalculoIMC extends HttpServlet{


	private static final long serialVersionUID = 7211750232740815359L;
	
	// get y post 
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		
		out.println("Bienvenido a la clase CalculoIMC ");
		out.println("Llegaste al servlet calcular Indice de masa coroporal");
		
		// Como convertir un string en double --->  Double.parseDouble(string) 
		Persona p = new Persona(request.getParameter("nombre"),
								Double.parseDouble(request.getParameter("altura")),
								Double.parseDouble(request.getParameter("peso")));
		
		
		CalcularIMCControlador cc = new CalcularIMCControlador();
		
		 out.println(p.getNombre() +", tu resultado es : " + cc.calculoImc(p));; // esto se lo enviamos a la pagina web --->
		
	}


}
