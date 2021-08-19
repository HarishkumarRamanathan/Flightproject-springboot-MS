package org.project.user.service;

import org.project.user.entity.UserEntity;
import org.project.user.model.User;
import org.project.user.model.UserLogin;
import org.project.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public User validateUser(UserLogin userLogin) {
		
		UserEntity userEntity= userRepo.findByUsername(userLogin.getUsername());
		
		User user= new User();
		
		if(userEntity!=null) {
			user.setUserName(userEntity.getUsername());
			user.setEmail(userEntity.getEmail());
			user.setRole(userEntity.getRole());
			user.setValid(userEntity.isValid());
		}
		
		return user;
		
	}

	public void addUser(User user) {
		//UserEntity userEntity= userRepo.findByUsername(user.getUsername());
		UserEntity userEntity= new UserEntity();
		userEntity.setUsername(user.getUserName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity.setRole(user.getRole());
		userEntity.setValid(user.isValid());
		
		userRepo.save(userEntity);
		
	}

}
