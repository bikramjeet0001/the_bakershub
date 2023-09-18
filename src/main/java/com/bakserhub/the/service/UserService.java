package com.bakserhub.the.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakserhub.the.domain.User;
import com.bakserhub.the.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public List<User> listUser() {
		return userRepo.listUser();
	}

	public User getUser(String userId) {
		return userRepo.getUser(userId);
	}

}
