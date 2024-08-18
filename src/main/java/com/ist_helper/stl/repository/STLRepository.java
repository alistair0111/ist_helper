package com.ist_helper.stl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ist_helper.model.user.User;

@Repository
public interface STLRepository extends JpaRepository<User, Integer> {

}
