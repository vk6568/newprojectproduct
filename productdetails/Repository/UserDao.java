package com.in.product.productdetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.product.productdetails.Entity.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	
}
