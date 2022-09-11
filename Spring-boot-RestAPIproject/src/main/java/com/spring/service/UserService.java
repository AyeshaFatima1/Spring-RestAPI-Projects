package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.User;
import com.spring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(Integer id) {
		return userRepository.findById(id).orElseThrow(null);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		userRepository.deleteById(id);;
	}
}
