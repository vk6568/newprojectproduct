package com.in.product.productdetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.product.productdetails.Entity.Category;
import com.in.product.productdetails.Entity.Product;
import com.in.product.productdetails.Service.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryServiceImpl categoryserviceimpl;
	
	@PostMapping("/save")
	public Category saveCategory(Category category) {
		
		 return categoryserviceimpl.savecategory(category);
	}
	
	@GetMapping("/getcount/{catid}")
    public List<Product> GetProductsByCatId(@PathVariable int catid) {
		return categoryserviceimpl.getProductsByCatId(catid);
    	  	
    }
}
