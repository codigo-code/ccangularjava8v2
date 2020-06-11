package edu.codigocode.vista;

public class App {

	// globales para clase cuando se declaran fuera de los metodos
	static String nombre = " Noelia";
	static int edad = 20;

	// todo lo estatico cuando se inicia el programa va a parar
	// a la memoria que no cambia en todo el ciclo de vida del programa
	public static void main(String[] args) {
		System.out.println("hola mundo!");

		saludar();
		despedida();

		System.out.println("sumo dos numeros ");

		// la concatenacion es la union de dos terminos no necesariamente del mismo tipo

		// ejemplo int + string + date + double

		// warning --> si son numeros entero e l mas trabaja como una adicion
		// pero si exste un String ( cadena ) + un entero u otro objeto , conecatena los
		// objetos como
		// si fueran String

		int num1 = 2;
		int num2 = 2;

		System.out.println("Sumo " + num1  + " , el resultado es = "
		+ sumoDosNumeros(num1, sumoDosNumeros(sumoDosNumeros(20,1000),10)));

		System.out.println("Cuanto es 4 +  4 =  " + (4 + 4));
	 
	}

	// procedimiento : es un metodo que no retorna un valor
	// simplemente ejecuta instrucciones de forma secuencial
	// visibildad + tipo + nombre del metodo
	public static void saludar() { // inicio al ambito del procedimiento

		System.out.println("Saludando ....");
		nombre = "dante";
//		edad = 38;
		System.out.println("su nombre es : " + nombre + " y su edad es " + edad);

	}// el fin del ambito ( scope) del procedimiento

	// metodos o acciones ---> Funcion , Procedimiento

	public static void despedida() {

		System.out.println("despidiendose ");

		// nombre = "Jorge";
		edad = 50;
		System.out.println("su nombre es : " + nombre + " y su edad es " + edad);
	}

	// metodo de tipo funcion
	// las funciones retornan un valor ---> un primitivo como un objeto
	public static int sumoDosNumeros(int n1, int n2) {

		return n1 + n2;
	}

}