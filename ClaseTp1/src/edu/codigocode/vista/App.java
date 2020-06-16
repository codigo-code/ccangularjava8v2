package edu.codigocode.vista;

import edu.codigocode.modelo.Auto;
import edu.codigocode.modelo.Persona;

public class App {

	public static void main(String[] args) {

		Persona p1 = new Persona("Fulano", "Detal", 123);
		
		Auto a1 = new Auto("Ford", "Escor", 350, p1);

		if (a1.arrancar()) {
			System.out.println("La persona " + p1.getNombre() + " con la edad " +p1.getEdad()+ ", con el auto " + a1.getMarca() + ", con el modelo "+ a1.getModelo() + ", va a la velocidad : " + a1.velocidadMaxima() + " km!");
		} else {
			System.out.println("La persona " + p1.getNombre() + ", con la edad " + p1.getEdad() + " no puede usar el auto");
		}

	}

}
