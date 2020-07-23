package edu.codigocode.dao.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.codigocode.dao.UserDTO;

@Repository
public interface UserDtoRespository extends JpaRepository<UserDTO, Integer>{

}
