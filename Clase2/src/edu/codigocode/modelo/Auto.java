package edu.codigocode.modelo;

public class Auto  {
	
	// encapsulamiento
	private String marca;
	private String modelo;
	private String defecto; // 
	
	/*
	 * 
	 */
	
	// el constructor es la forma de inicializar el objeto cuando se instancia
	
	// visilidad + nombre de la clase
	
	public Auto(String marca, String modelo, String defecto) {
		    
		this.marca = marca;
		this.modelo=modelo;
		this.defecto=defecto;
	}
	
	// encapsulamiento ---> el control de retornar informacion como de cambiar su estado
	
	
	/*
	 *  Encapsulamiento :
	 *  toda variable global privada debe ser accedida por medio de un metodo publico
	 *  
	 *  get y set 
	 *  
	 *  get ---> retorna el valor de la variable privada // funcion      ---> tipoObjecto <---
	 *  set ---> asigna un valor a la variable privada   // procedimiento  ---> void <---
	 */
	
	// getter
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public String getDefecto() {
		return this.defecto;
	}
	
	// setter
	
	public void setDefecto(String defecto) {
		this.defecto = defecto;
	}
	
}
