package org.aplicacion.eventos.repository;

import org.aplicacion.eventos.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
