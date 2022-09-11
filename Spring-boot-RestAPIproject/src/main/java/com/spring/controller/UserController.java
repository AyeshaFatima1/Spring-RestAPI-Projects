package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	

    @GetMapping("/home")
    public String homePage() {
    	return "Welcome to GROCERY Mart";
    }
    
	@GetMapping("/")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}

	@GetMapping("/User/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

}
