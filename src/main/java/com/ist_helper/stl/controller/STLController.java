package com.ist_helper.stl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ist_helper.stl.service.STLService;
import com.ist_helper.model.user.User;

@RestController
@RequestMapping("/user")
public class STLController {

	@Autowired
	private STLService stlService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<User> findUserById(@PathVariable int id) {
		return stlService.getUserById(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> allUsers() {
		return stlService.findAllUsers();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return stlService.addUser(user);
	}
}
