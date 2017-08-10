package com.techm.dao;

import java.util.List;

import com.techm.bean.User;

public interface UserDAO {
public boolean saveUser (User user);
public List<User> getAllUsers();

}
