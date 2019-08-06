package com.in.product.productdetails.Service;

import java.util.List;

import com.in.product.productdetails.Entity.Category;
import com.in.product.productdetails.Entity.Product;

public interface CategoryService {
	
	Category savecategory(Category category);
	
	List<Product> getProductsByCatId(int catid);
	

}
