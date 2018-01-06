package com.company.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.demo.entity.User;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public ModelAndView home(){
	    User user = new User();
	    user.setName("VenkatRaman");
	    user.setId(2154);
	    user.setProfileImage("avatar.png");
	    ModelAndView index=new ModelAndView();
	    index.setViewName("index");
	    index.addObject(user);
	    return index;
		
	}

	@RequestMapping("/error")
	public String show404(){
		return "errorpages/page_404";
	}
}
