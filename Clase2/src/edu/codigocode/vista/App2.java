package edu.codigocode.vista;

import edu.codigocode.modelo.Auto;

public class App2 {

	
	public static void main(String[] args) {
		

		Auto auto1 = new Auto("VW", "Gol Ab9", "ruido en el motor");
		System.out.println("Auto 1");
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		System.out.println(auto1.getDefecto());
		
		Auto auto2 = new Auto("Peugeot", "404", "flojo de chasis");
		System.out.println("Auto 2");
		System.out.println(auto2.getMarca());
		System.out.println(auto2.getModelo());
		System.out.println(auto2.getDefecto());
		
		System.out.println("========== Modifico valores =======");
		
		System.out.println("Se analizo el vehiculo 1 y el diagnostico es ");
		
		auto1.setDefecto("El mecanico defecto :  buje flojo!");
		
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		System.out.println(auto1.getDefecto());
	
	}
}
