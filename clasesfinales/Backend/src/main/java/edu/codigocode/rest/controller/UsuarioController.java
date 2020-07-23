package edu.codigocode.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.codigocode.dao.UserDTO;
import edu.codigocode.dao.respositories.UserDtoRespository;
import edu.codigocode.model.User;

@CrossOrigin
@RestController
public class UsuarioController {

	@Autowired
	private UserDtoRespository userRespository;

	@PostMapping(value = "authenticationUser")
	public ResponseEntity<User> authUser(@RequestBody User user) {
		User u = null;
		List<UserDTO> lista = this.userRespository.findAll();

		 
		// patron adapter
		for (UserDTO item : lista) {
			
			if(item.getNombre().equals(user.getUser()) && item.getPassword().equals(user.getPassword())) {
				u= new User();
				u.setUser(item.getNombre()); // ---> 
				u.setMail(item.getMail());
				u.setPassword(item.getPassword());
  			}
		}
		
		return ResponseEntity.ok(u);
	}

}
