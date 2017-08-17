package com.techm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techm.bean.User;
import com.techm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/viewUsers",method=RequestMethod.GET)
	public String showUsers(Model m){
		List<User> userList=userService.getAllUsers();
		m.addAttribute("userList",userList);
		return "viewUsers";
	}

}
