package edu.codigocode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.model.Persona;
import edu.codigocode.repository.PersonaRepository;

@RestController
public class PersonaController {

	
	//generar un vinculo entre mi componente
	// y mi clase controlador 
//	@Autowired  // auto-cableado -> como enlazado ---> inyeccion de instancia
//	private Persona persona;  // new Persona()
	
	@Autowired
	private PersonaRepository personaRepository;
	
//	@GetMapping(value="persona") // url-mapping 
//	public Persona getPersona() {
//		persona.setNombre("dante");
//		persona.setEdad(38);
//		
//		return persona;
//	}
	
	
	@GetMapping(value="getAllPersonas")
	public List<Persona> getAllPersonas(){
		
		// find all nos traemos todas las personas de la base de datos
		// magia!!!
		return personaRepository.findAll();
	}
	
	
}
