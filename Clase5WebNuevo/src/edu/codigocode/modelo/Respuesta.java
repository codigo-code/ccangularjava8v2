package edu.codigocode.modelo;

public class Respuesta {

	private String nombre;
	private double resultadoIMC;
	private String pathImg;
	
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setResultadoIMC(double resultadoIMC) {
		this.resultadoIMC = resultadoIMC;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

//	public Respuesta(String nombre, double resultadoIMC, String pathImg) {
//		this.nombre = nombre;
//		this.resultadoIMC = resultadoIMC;
//		this.pathImg = pathImg;
//	}

	public String getNombre() {
		return nombre;
	}

	public double getResultadoIMC() {
		return resultadoIMC;
	}

	public String getPathImg() {
		return pathImg;
	}

}
