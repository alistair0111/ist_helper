package com.ist_helper.stl.service;

import java.util.List;
import java.util.Optional;

import com.ist_helper.model.user.User;
import com.ist_helper.stl.repository.STLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class STLService {

	@Autowired
	private STLRepository stlRepository;

	public Optional<User> getUserById(int id) {
		return stlRepository.findById(id);
	}

	public List<User> findAllUsers() {
		return stlRepository.findAll();
	}

	 @Transactional
	public User addUser(User user) {
		return stlRepository.save(user);
	}
}
