package org.aplicacion.eventos.service;

import java.util.List;

import org.aplicacion.eventos.model.User;

public interface UserService {

	public List<User> getAll();
	
	public void create(User user);
}
