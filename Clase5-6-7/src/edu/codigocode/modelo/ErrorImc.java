package edu.codigocode.modelo;

public class ErrorImc extends Exception {

 
	private static final long serialVersionUID = 8493787396480094823L;
	private String mensaje;
	private boolean falla;
	private String descripcion;
	
	

	public ErrorImc(String mensaje, boolean falla, String descripcion) {
		super();
		this.mensaje = mensaje;
		this.falla = falla;
		this.descripcion = descripcion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getMensaje() {
		return mensaje;
	}



	public boolean isFalla() {
		return falla;
	}



	public String getDescripcion() {
		return descripcion;
	}

	

}
