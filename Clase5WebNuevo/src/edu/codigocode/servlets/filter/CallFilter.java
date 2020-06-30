package edu.codigocode.servlets.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.codigocode.modelo.ErrorImc;

public class CallFilter extends HttpFilter {


	private static final long serialVersionUID = 8978885915111483204L;

	
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		RequestDispatcher dips = request.getRequestDispatcher("imc.jsp");
		try {
			Double.parseDouble(request.getParameter("altura"));
			Double.parseDouble(request.getParameter("peso"));
			
		} catch (Exception e) {
			request.setAttribute("error", 
			new ErrorImc("No se pueden introduccir texto en los campos numericos", true, e.getMessage()));
			dips.forward(request, response);
		}

		
		
		// evualamos y es correcto
		
		chain.doFilter(request, response); // continuaria con la cadena original de la peticion
	}
}
