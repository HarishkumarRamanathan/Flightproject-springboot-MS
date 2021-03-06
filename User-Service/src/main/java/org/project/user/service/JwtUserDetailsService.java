package org.project.user.service;

import java.util.ArrayList;

import org.project.user.entity.UserEntity;
import org.project.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity userEntity=userRepo.findByUsername(username);
		
//		if ("admin".equals(username)) 
		if(userEntity!=null)
		{
			/*
			 * return new User("admin",
			 * "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", new
			 * ArrayList<>());
			 */		
			return new User(userEntity.getUsername(), userEntity.getPassword(),
					new ArrayList<>());

		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
