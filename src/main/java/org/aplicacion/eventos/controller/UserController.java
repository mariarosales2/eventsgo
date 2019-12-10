package org.aplicacion.eventos.controller;

import java.util.ArrayList;
import java.util.List;

import org.aplicacion.eventos.model.User;
import org.aplicacion.eventos.service.UserService;
import org.aplicacion.eventos.viewmodel.UserViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/getAll")
	public UserViewModel[] getAll() {
		List<User> users = this.userService.getAll();
		List<UserViewModel> usersWS = new ArrayList<UserViewModel>();
		ModelMapper modelMapper = new ModelMapper();
		
		for(User user : users) {
			UserViewModel userWS = modelMapper.map(user, UserViewModel.class);
			usersWS.add(userWS);
		}
		return usersWS.toArray(new UserViewModel[users.size()]);
	}
	
	@PutMapping
	public void create(@RequestBody UserViewModel user) {
		ModelMapper modelMapper = new ModelMapper();
		User userEntity = modelMapper.map(user, User.class);
		this.userService.create(userEntity);
	}
	
}
