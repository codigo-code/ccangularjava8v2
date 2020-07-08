package edu.codigocode.controlador;

import edu.codigocode.modelo.Persona;
import edu.codigocode.modelo.Respuesta;

public class CalcularIMCControlador {

	public Respuesta calculoImc(Persona persona) {

		Respuesta r = new Respuesta();

		double rtaIMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());

		r.setNombre(persona.getNombre());
		r.setResultadoIMC(rtaIMC);

		// verifico el resultado y lo evaluo
		if (rtaIMC < 18.5) {
			r.setPathImg("img/flaco.jpg");
		} else if (rtaIMC >= 18.5 && rtaIMC <= 24.9) {
			r.setPathImg("img/normal.png");
		} else {
			r.setPathImg("img/gordo.png");
		}

		return  r;
	}
}
