package com.in.product.productdetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.in.product.productdetails.Entity.Product;

@Repository
public interface ProductDao  extends JpaRepository<Product, Integer>{
	
	@Query("select p from Product p where catid=:catid")
	List<Product> getProductsByCatId(@Param("catid") int catid);
	

}
