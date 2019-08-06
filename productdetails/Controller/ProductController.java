package com.in.product.productdetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.product.productdetails.Entity.Product;
import com.in.product.productdetails.Service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
    private ProductServiceImpl productserviceimpl;
	 
	 @PostMapping("/save")
	 public Product Productsave(@RequestBody Product product) {
		    return  productserviceimpl.saveproduct(product);
	 }
	
}
