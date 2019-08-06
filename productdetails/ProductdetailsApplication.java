package com.in.product.productdetails;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductdetailsApplication {

	private static final Logger logger = LogManager.getLogger(ProductdetailsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductdetailsApplication.class, args);
		logger.info("main method of ProductdetailsApplication");
	}

}
