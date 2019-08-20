package com.tricon.demoSpringMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.demoSpringMongo.model.Users;
import com.tricon.demoSpringMongo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public String createUser(String name, String email) {
		
		Users user = new Users(name, email);
		
		userRepo.save(user);
		return ("New User created with id : "+user.getId());
	}
	
	public List<Users> listUsers(){
		
		return userRepo.findAll();
	}
}
