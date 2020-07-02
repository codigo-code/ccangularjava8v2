package edu.codigocode.modelo;

import edu.codigocode.modelo.enumerables.Genero;
import edu.codigocode.modelo.enumerables.TipoCalidad;

public class CD extends Pelicula {

	public CD(int idPelicula, String nombre, Genero genero, String fechaLanzamiento, double duracion,
			double calificacion, TipoCalidad tipoCalidad) {
		super(idPelicula, nombre, genero, fechaLanzamiento, duracion, calificacion, tipoCalidad);
		// TODO Auto-generated constructor stub
	}

}
