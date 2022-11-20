package com.greatlearning.service;

import com.greatlearning.entity.User;

public interface LoginService {
	
	public User getLoginDetails(String userName,String password);

}
