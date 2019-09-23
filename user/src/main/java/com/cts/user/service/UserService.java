package com.cts.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.user.model.User;
import com.cts.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Transactional
	public List<User> getAllUsers(){
		return (List<User>) userRepo.findAll();
	}
	
	@Transactional
	public Optional<User> getUserById(Long id) {
		return userRepo.findById(id);
	}
	
	@Transactional
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	@Transactional
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	@Transactional
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
