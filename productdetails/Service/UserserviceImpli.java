package com.in.product.productdetails.Service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.in.product.productdetails.Dto.LoginDto;
import com.in.product.productdetails.Dto.SignUpDto;
import com.in.product.productdetails.Entity.User;

import com.in.product.productdetails.Repository.UserDao;

import com.in.product.productdetails.Response.ApiResponse;

@Transactional
@Service
public class UserserviceImpli implements UserService{
	
	
	@Autowired
	private UserDao userdao;
	
	
	@Override
	public ApiResponse signUp(SignUpDto signupdto) {
		// TODO Auto-generated method stub
		    validateSignUp(signupdto);
	        User user = new User();
		    BeanUtils.copyProperties(signupdto, user);
		    userdao.save(user);
		    
			return new ApiResponse(200, "Sucess", user);
	}
	

	@Override
	public ApiResponse Login(LoginDto logindto) {
		// TODO Auto-generated method stub
		User user = userdao.findByUsername(logindto.getUsername());
		if(user == null) {
			throw new RuntimeException("User doesn't exist.");
			
		}
		if(!user.getPassword().equals(logindto.getPassword())){
			
			throw new RuntimeException("Password mismatch.");	
		}
	    return new ApiResponse(200, "Login Sucess", null);
	}
	
	
	private void validateSignUp(SignUpDto signupdto) {
		// TODO Auto-generated method stub
		
	}



	
	

}
