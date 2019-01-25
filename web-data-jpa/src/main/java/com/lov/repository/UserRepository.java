package com.lov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lov.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
