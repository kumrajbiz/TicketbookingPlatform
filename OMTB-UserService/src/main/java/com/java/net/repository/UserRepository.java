package com.java.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.net.entity.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, String> {

	User getByUserId(String uid);

}
