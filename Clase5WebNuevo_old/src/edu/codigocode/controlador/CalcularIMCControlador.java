package edu.codigocode.controlador;

import edu.codigocode.modelo.Persona;

public class CalcularIMCControlador {

	// continuara......
	
	public double calculoImc(Persona persona) {
		
		return persona.getPeso() / (persona.getAltura() * persona.getAltura());
	}
}
