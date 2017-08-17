package com.techm.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techm.bean.User;
import com.techm.dao.UserDAO;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory session;
	
	public UserDAOImpl() {
		  System.out.println("UserDAOImpl");
	}
	
	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		try{
		session.getCurrentSession().save(user);
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		List<User> userList= session.getCurrentSession().createQuery("from User").list();
		System.out.println("Fetched users size: " + userList.size());
		return userList;
	}

}
