package edu.codigocode.modelo;


// S.O.L.I.D.
public class Persona {

	// atributos pribados
	private String nombre;
	private String apellido;
	private int edad; // 21
	private boolean conducir; // no sabe manejar 
	
	
	// getter y setter ---> para poder acceder a lo atributos privados
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isConducir() {
		return conducir;
	}
	public void setConducir(boolean conducir) {
		this.conducir = conducir;
	}
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
}
