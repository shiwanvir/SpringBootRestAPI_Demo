package com.demo.main_package.products;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	@RequestMapping("/allProducts")
	public List<Product> getAllProducts() {

		return Arrays.asList(
				new Product(1,"pen",5.75),
				new Product(2,"Book",7.30),
				new Product(3,"Pencil",1.2)
				
				);
				
	}
	
	
}
