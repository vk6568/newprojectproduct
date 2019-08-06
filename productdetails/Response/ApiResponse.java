package com.in.product.productdetails.Response;

public class ApiResponse {
	
	private int status;
	private String message;
	private Object result;
	
	public ApiResponse(int status, String message, Object result) {
		super();
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public int getStatus() {
		return status;
	}
	
	

}
