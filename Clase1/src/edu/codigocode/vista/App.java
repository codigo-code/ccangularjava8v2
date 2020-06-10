package edu.codigocode.vista;

import edu.codigocode.modelo.Auto;

public class App { // ambito / scope ----> de la clase

	// punto de inicio de mi aplicacion main

	// shortcut ( ctrl + shift + o ) para traernos los import de la clase
	// visibiliad estatico tipo nombre reservador ( main ) argumentos
	public static void main(String[] args) {

		String saludo = "hola mundo desde una variable";

		System.out.println(saludo);

		// creacion del objeto auto, con new reservo la posicion de memoria
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "Chevrolet";
		auto1.modelo = "Crosa";
		auto1.patente = 1234;
		auto1.defecto = "ME hace ruido el motor!";

		System.out.println("Posicion de memoria: " + auto1);
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Modelo: " + auto1.modelo);
		System.out.println("Defecto: " + auto1.defecto);
		System.out.println("Patente: " + auto1.patente);
		
		System.out.println("Obj Auto 2 : " + auto2 + " <---- TEST") ;

	}

	// ATRITUBOS Y METODOS

	// metodos ---> funciones y procedimientos
}
