package org.aplicacion.eventos.service.impl;

import java.util.List;

import org.aplicacion.eventos.model.User;
import org.aplicacion.eventos.repository.UserRepository;
import org.aplicacion.eventos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> getAll() {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	public void create(User user) {
		this.userRepository.save(user);
	}

}
