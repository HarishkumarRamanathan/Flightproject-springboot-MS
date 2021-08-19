package org.project.user.controller;

import org.project.user.model.User;
import org.project.user.model.UserLogin;
import org.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String get() {
		return "welcome";
	}
	
	@PostMapping("/login")
	public User validateUser(@RequestBody UserLogin userLogin) {
		return userService.validateUser(userLogin);
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		 userService.addUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
