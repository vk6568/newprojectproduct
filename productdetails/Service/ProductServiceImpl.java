package com.in.product.productdetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.product.productdetails.Entity.Product;
import com.in.product.productdetails.Repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productdao;

	@Override
	public Product saveproduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.save(product);
	}
	
	

}
