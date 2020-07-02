package edu.codigocode.modelo;

import edu.codigocode.modelo.enumerables.Genero;
import edu.codigocode.modelo.enumerables.TipoCalidad;

public class VHS extends Pelicula {

	private boolean rebobinar;
	
	
	
	public VHS(int idPelicula, String nombre, Genero genero, String fechaLanzamiento, double duracion,
			double calificacion, TipoCalidad tipoCalidad, boolean rebobinar) {
		super(idPelicula, nombre, genero, fechaLanzamiento, duracion, calificacion, tipoCalidad);
		this.rebobinar=rebobinar;
	}



	public boolean isRebobinar() {
		return rebobinar;
	}
	
	

}
