package com.techm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techm.bean.User;
import com.techm.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homepage(){
		return "index";
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register_page(@ModelAttribute User user){
		return "register";
	}

/*	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute("student") User user, BindingResult result,Model m){
		try{
		if(result.hasErrors()){
			m.addAttribute("regMsg","Failed register "+user.getUserName());
			return "register";
		}
		
		Boolean b=userService.saveUser(user);
		if(b){
			m.addAttribute("regMsg", user.getUserName()+" registered succesfully!");
			return "welcome";
		}
		else
		{
			m.addAttribute("regMsg", "Failed register "+user.getUserName());
			return "register";
		}
		}
		catch (Exception e) {
			m.addAttribute("regMsg", "Failed register "+user.getUserName());
			return "register";
		}
	}*/

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(ModelMap m, HttpServletRequest request,final RedirectAttributes redirectAttribute){
		User user = new User();
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		String regMsg="regMsg";
		try{
		
		Boolean b=userService.saveUser(user);
		if(b){
			m.addAttribute(regMsg, user.getUserName()+" registered succesfully!");
			return "welcome";
		}
		else
		{
			redirectAttribute.addFlashAttribute(regMsg, "Failed to register : User Name '"+user.getUserName()+"' already exists!");   
			return "register";
		}
		}
		catch (Exception e) {
			redirectAttribute.addFlashAttribute(regMsg,"Failed to register : User Name '"+user.getUserName()+"' already exists!");   
			return "redirect:register";
		}
	}
}
