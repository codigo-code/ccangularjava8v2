package edu.codigocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// configuramos spring boot a nivel de servicios
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		//run( cual es el punto de entrada de la aplicacion
		// App.class --> contiene el metodo run
		// cuales son los argumentos que va a recibir  
		// http://localhost:8080/proyecto/ 
		// url-mapaping /calcularIMC
		SpringApplication.run(App.class, args);
	}
}
