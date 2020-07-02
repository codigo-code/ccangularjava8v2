package edu.codigocode.modelo;

import edu.codigocode.modelo.enumerables.Genero;
import edu.codigocode.modelo.enumerables.TipoCalidad;

public abstract class Pelicula {

	private int idPelicula;
	private String nombre;
	private Genero genero;
	private String fechaLanzamiento;
	private double duracion;
	private double calificacion;
	private TipoCalidad tipoCalidad;
	
	
	public Pelicula(int idPelicula, String nombre, Genero genero, String fechaLanzamiento, double duracion,
			double calificacion, TipoCalidad tipoCalidad) {
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.genero = genero;
		this.fechaLanzamiento = fechaLanzamiento;
		this.duracion = duracion;
		this.calificacion = calificacion;
		this.tipoCalidad = tipoCalidad;
	}


	public int getIdPelicula() {
		return idPelicula;
	}


	public String getNombre() {
		return nombre;
	}


	public Genero getGenero() {
		return genero;
	}


	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}


	public double getDuracion() {
		return duracion;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public TipoCalidad getTipoCalidad() {
		return tipoCalidad;
	}


	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", nombre=" + nombre + ", genero=" + genero
				+ ", fechaLanzamiento=" + fechaLanzamiento + ", duracion=" + duracion + ", calificacion=" + calificacion
				+ ", tipoCalidad=" + tipoCalidad + "]";
	}
	
	
	
	
	
}
