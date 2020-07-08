package edu.codigocode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.codigocode.model.Persona;

@Repository  // es la forma de enlazar una clase contra la base de datos
public interface PersonaRepository extends  JpaRepository<Persona, Integer>{

}
