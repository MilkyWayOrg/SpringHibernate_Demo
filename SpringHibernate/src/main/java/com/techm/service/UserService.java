package com.techm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techm.bean.User;
@Service
public interface UserService {
	public boolean saveUser(User user);
	public List<User> getAllUsers();

}
