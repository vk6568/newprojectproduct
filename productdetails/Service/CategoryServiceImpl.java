package com.in.product.productdetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.product.productdetails.Entity.Category;
import com.in.product.productdetails.Entity.Product;
import com.in.product.productdetails.Repository.CtegoryDao;
import com.in.product.productdetails.Repository.ProductDao;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CtegoryDao categorydao;
	
	@Autowired
	private ProductDao productDao;
	

	@Override
	public Category savecategory(Category category ) {
		// TODO Auto-generated method stub
		return categorydao.save(category);
	}

	@Override
	public List<Product> getProductsByCatId(int catid) {
		// TODO Auto-generated method stub
		Optional<Category> category = categorydao.findById(catid);
		Category cate = new Category();
		if(category.isPresent()) {
			cate=category.get();
			cate.setCatcount(cate.getCatcount() + 1);
		}
		else {
			cate.setCatcount(1);
		}
	   return productDao.getProductsByCatId(catid);
	}

	
}
