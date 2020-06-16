package edu.codigocode.modelo;

public class Auto {

	private String marca;
	private String modelo;
	// visibilidad, objeto, nombre de la variable
	private Persona persona;
	private int velMax;
	
	
	
	
	public Auto(String marca, String modelo, int velMax, Persona persona ) {
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
		this.velMax = velMax;
	}

	public String getMarca() {
		return marca;
	}

//	public void setMarca(String marca) {
//		this.marca = marca;
//	}

	public String getModelo() {
		return modelo;
	}

//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	



	public boolean arrancar() {
		// 18 >= 18 ---> verdadero
		if (this.persona.getEdad() < 18) {
			return false;
		} else if (this.persona.getEdad() >= 18 && this.persona.getEdad() <= 80) {
			return true;

		} else if (this.persona.getEdad() >= 81 && this.persona.getEdad() <= 100) {
			return false;
		
		} else {
			return true;
		}

	}
	
	public int velocidadMaxima() {
		
		// persona = 80
		if(this.persona.getEdad() <= 30) {
			return 150;
		}else if(this.persona.getEdad() >=31 && this.persona.getEdad() <= 79) {  
			return this.velMax;
		}else {
			return 70;  
		}
		
	}
}
