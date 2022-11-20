package com.greatlearning.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.User;
import com.greatlearning.repository.UserRepository;
import com.greatlearning.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User getLoginDetails(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepo.findByUserNameAndPassword(userName, password);
	}

}
