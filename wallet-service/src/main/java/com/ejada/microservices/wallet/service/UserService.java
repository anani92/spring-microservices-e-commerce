package com.ejada.microservices.wallet.service;

import org.springframework.stereotype.Service;

import com.ejada.microservices.wallet.exceptions.UserAlreadyExistsException;
import com.ejada.microservices.wallet.model.User;
import com.ejada.microservices.wallet.repo.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User registerUser(User user) {
		if (userRepository.existsByUserName(user.getUserName())) {
			throw new UserAlreadyExistsException("Username already exists");
		}
		return userRepository.save(user);
	}

	public User loginUser(String userName, String userPassword) {
		User user = userRepository.findByUserNameAndUserPassword(userName, userPassword);
		return user;

	}

	public User save(User user) {
		return userRepository.save(user);

	}

	public User getUserById(Long userId) {
		User user = userRepository.getById(userId);
		return user;
	}

	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}
}
