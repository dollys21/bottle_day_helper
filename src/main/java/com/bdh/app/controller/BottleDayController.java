package com.bdh.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdh.app.dao.UserDAO;
import com.bdh.app.model.User;

@Controller
public class BottleDayController {

	@Autowired
	UserDAO userDAO;

	@RequestMapping("/home")
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "home";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		boolean isValidUser = true;
		try {
			User d = new User();
			d.setFirstName(name);
			d.setPassword(password);
			User usd = userDAO.getByNamepass(d);
		} catch (Exception e) {
			isValidUser = false;
		}
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		// model.put("name", name);
		// model.put("password", password);
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/create-user", method = RequestMethod.GET)
	public String createUser(ModelMap model) {
		return "create-user";
	}

	@RequestMapping(value = "/submitUser", method = RequestMethod.POST)
	public String submituser(ModelMap model, @RequestParam String fname, @RequestParam String lname,
			@RequestParam String password) {

		User us = new User();
		us.setFirstName(fname);
		us.setLastName(lname);
		us.setPassword(password);

		System.out.println(us.toString());

		return "create-user";
	}

	

}
