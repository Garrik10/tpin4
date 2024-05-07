package com.smarttech.app.controllers;

import java.util.ArrayList;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smarttech.app.beans.User;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/users")
public class DemoController {

	@RequestMapping(method = RequestMethod.GET, value = "/getAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers() {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Tamo", "password1", "tamo@gmail.com"));
		userList.add(new User(2, "Toto", "password2", "toto@gmail.com"));
		userList.add(new User(3, "Titi", "password3", "titi@gmail.com"));
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/findUserById/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findUserById(@PathVariable("userId") int userId) {
		User userFound = new User(1, "Tamo", "password1", "tamo@gmail.com");
		return new ResponseEntity<>(userFound, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createUser(@RequestBody User user) {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Tamo", "password1", "tamo@gmail.com"));
		userList.add(new User(2, "Toto", "password2", "toto@gmail.com"));
		userList.add(new User(3, "Titi", "password3", "titi@gmail.com"));
		userList.add(user);
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}

}
