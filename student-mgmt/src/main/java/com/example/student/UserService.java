package com.example.student;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	private UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@Transactional
	public void save(User user) {
		userRepository.save(user);
	}
	
	
}
