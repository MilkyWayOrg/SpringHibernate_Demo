package com.techm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.bean.User;
import com.techm.dao.UserDAO;
import com.techm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}
	@Override
	public boolean saveUser(User user) {
		return userDAO.saveUser(user);

	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList=userDAO.getAllUsers();
		return userList;
	}


}
