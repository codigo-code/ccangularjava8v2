package edu.codigocode.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;import edu.codigocode.modelo.CD;
import edu.codigocode.modelo.Pelicula;
import edu.codigocode.modelo.enumerables.Genero;
import edu.codigocode.modelo.enumerables.TipoCalidad;

public class PeliculaControlador {

	private List<Pelicula> listaPeliculas;

	public PeliculaControlador() {
		this.listaPeliculas = new ArrayList<Pelicula>();

	}

	public void guardoPelicula(HttpServletRequest request) {

		String tipo = request.getParameter("tipo");
		// CD DVD VHS

		switch (tipo) {
		case "CD":
				this.listaPeliculas.add(creoCD(request));
			break;
		case "DVD":

			break;

		case "VHS":

			break;
		default:
			System.out.println("no se encontro el tipo");
			break;
		}

	}
	
	
	private Pelicula creoCD(HttpServletRequest req) {
		
//		req.getParameter("genero")
		return new CD(0, req.getParameter("nombre"), Genero.ACCION, req.getParameter("fechalanzamiento"), Double.parseDouble(req.getParameter("duraccion")), Double.parseDouble(req.getParameter("calificacion")), TipoCalidad._4K);
	}
	
	
	public void muestroLita() {
		
		this.listaPeliculas.forEach(System.out::println); // muestro los valores cargados
	}
}
