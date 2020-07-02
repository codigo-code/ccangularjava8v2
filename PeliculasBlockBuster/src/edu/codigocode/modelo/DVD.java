package edu.codigocode.modelo;

import edu.codigocode.modelo.enumerables.Genero;
import edu.codigocode.modelo.enumerables.TipoCalidad;

public class DVD extends Pelicula {

	private boolean menu;
	
	public DVD(int idPelicula, String nombre, Genero genero, String fechaLanzamiento, double duracion,
			double calificacion, TipoCalidad tipoCalidad, boolean menu) {
		super(idPelicula, nombre, genero, fechaLanzamiento, duracion, calificacion, tipoCalidad);
		this.menu=menu;
	}

	public boolean isMenu() {
		return menu;
	}

	
}
