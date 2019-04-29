package com.sgic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.entity.Users;
import com.sgic.services.UsersServices;


@RestController
public class UsersController {
	@Autowired
	UsersServices usersServices;
	
	@PostMapping("/saveUsers")
	public HttpStatus createUsers(@Valid @RequestBody Users users){
		usersServices.saveUsers(users);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers(){
		return usersServices.getAllUsers();
	}

}
