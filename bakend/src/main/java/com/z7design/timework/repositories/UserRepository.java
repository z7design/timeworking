package com.z7design.timework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.z7design.timework.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
