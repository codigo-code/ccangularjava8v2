package edu.codigocode.vista;

import java.util.Scanner;

import edu.codigocode.modelo.Persona;

public class App {

	public static void main(String[] args) {

		// vector de tipo string de longitud fija al momento de su creacion
		String[] listaNombres = { "Dante", "Matias", "Ruben", "Amando", "Facundo", "Damian", "Noelia", "Diana",
				"Nicolas" };

		// si quiero obtener la longitud de mi vector .length
		System.out.println("longitud de nuestro vector de String " + listaNombres.length);
		int longFinal = listaNombres.length - 1;
		int medio = listaNombres.length / 2;
		System.out.println("El primer nombre " + listaNombres[0]);
		System.out.println("El medio  del vector " + listaNombres[medio]);
		System.out.println("El ultimo nombre " + listaNombres[longFinal]);
		System.out.println("========= Muestro bucle for ========");
		for (int i = 0; i < listaNombres.length; i++) {
			System.out.println(listaNombres[i]); // listaNombres[9] => null
		}

		int[] edades = new int[5];

		edades[0] = 30;
		edades[1] = 23;
		edades[4] = 11;

		System.out.println("=========Vector de edades ========");
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
		System.out.println("===========Vector de Personas=======");

		Persona[] listaPersona = new Persona[3];

		Scanner input = new Scanner(System.in);
		System.out.println("Por favor ingrese el nombre de la persona 1");
		String nombre = input.nextLine();
		System.out.println("ingrese la edad de la persona ");
		int edad = Integer.parseInt(input.nextLine());

		listaPersona[0] = new Persona(nombre, edad);
		
		System.out.println("Por favor ingrese el nombre de la persona 2");
		nombre = input.nextLine();
		System.out.println("ingrese la edad de la persona ");
		edad = Integer.parseInt(input.nextLine());
		listaPersona[1] = new Persona(nombre, edad);
		
		System.out.println("Por favor ingrese el nombre de la persona 3");
		nombre = input.nextLine();
		System.out.println("ingrese la edad de la persona ");
		edad = Integer.parseInt(input.nextLine());
		listaPersona[2] = new Persona(nombre, edad);

		// foreach ---> para cada uno de las posiciones de mi vector lo copio
		// a una variable estatica y muestro sus valores

		// ejemplo con foreach de java 1.7
		for (Persona item : listaPersona) {
			System.out.println(item);
		}

	}

}
