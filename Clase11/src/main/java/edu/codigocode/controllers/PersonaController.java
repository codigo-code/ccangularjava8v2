package edu.codigocode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.model.Persona;
import edu.codigocode.model.Respuesta;
import edu.codigocode.repository.PersonaRepository;

@RestController
public class PersonaController {

	// generar un vinculo entre mi componente
	// y mi clase controlador
//	@Autowired  // auto-cableado -> como enlazado ---> inyeccion de instancia
//	private Persona persona;  // new Persona()

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private Respuesta respueta;

	@GetMapping(value = "getAllPersonas")
	public List<Persona> getAllPersonas() {

		// find all nos traemos todas las personas de la base de datos
		// magia!!!
		return this.personaRepository.findAll();
	}
	// localhost:8080/persona/1

	@GetMapping(value = "persona/{id}")
	public Persona getPersonaById(@PathVariable int id) {

		// JAVA ---> Spring Boot + Sprng Data + JPA
		return this.personaRepository.findById(id).get();
	}

	// spring suite ---> muchas libreas que resuelven MUUUCHOS problemas

	// insertar datos dedsde java web --->

	@PostMapping(value = "savePersona")
	public ResponseEntity<Respuesta> savePersona(@RequestBody Persona persona) {
		try {
			this.personaRepository.save(persona);
			this.respueta.setMensaje("inserto correctamente");
			this.respueta.setStatusCode(200);

		} catch (Exception e) {
			this.respueta.setMensaje("error al insertar ");
			this.respueta.setStatusCode(500);
			this.respueta.setError(e.getMessage());
		}
		return ResponseEntity.ok(this.respueta);
	}

	@PutMapping(value = "modifyPersona")
	public ResponseEntity<Respuesta> modificarPersona(@RequestBody Persona persona) {
		try {
			Persona pmodificar = this.personaRepository.findById(persona.getId()).get();
			pmodificar.setNombre(persona.getNombre());
			this.personaRepository.save(pmodificar);
			
			this.respueta.setMensaje("Modifico correctamente");
			this.respueta.setStatusCode(200);

		} catch (Exception e) {
			this.respueta.setMensaje("error al insertar ");
			this.respueta.setStatusCode(500);
			this.respueta.setError(e.getMessage());
		}
		return ResponseEntity.ok(this.respueta);
	}

	
}
