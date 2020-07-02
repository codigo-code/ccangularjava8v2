package edu.codigocode.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.codigocode.controlador.PeliculaControlador;

public class PeliculaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4822268084664702133L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String tipo = req.getParameter("tipo");

		PeliculaControlador pc = new PeliculaControlador();
		pc.guardoPelicula(req);
		pc.muestroLita();
	}
}
