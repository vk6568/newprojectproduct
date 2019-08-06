package com.in.product.productdetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.product.productdetails.Dto.LoginDto;
import com.in.product.productdetails.Dto.SignUpDto;

import com.in.product.productdetails.Response.ApiResponse;
import com.in.product.productdetails.Service.UserserviceImpli;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserserviceImpli userserviceimpl;
	
	@PostMapping("/register")
	public ApiResponse signUp(@RequestBody SignUpDto signupdto) {
		
		   return  userserviceimpl.signUp(signupdto);
	}
	
	@PostMapping("/loginuser")
	public ApiResponse Login(@RequestBody LoginDto logindto) {
		
		return userserviceimpl.Login(logindto);
		
		
	}

}
