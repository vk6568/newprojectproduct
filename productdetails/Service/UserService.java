package com.in.product.productdetails.Service;

import com.in.product.productdetails.Dto.LoginDto;
import com.in.product.productdetails.Dto.SignUpDto;

import com.in.product.productdetails.Response.ApiResponse;

public interface UserService {
	
	ApiResponse signUp(SignUpDto signupdto);
	ApiResponse Login(LoginDto logindto);
	
	

}
