package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	 String addProduct(Product request) ;
		// TODO Auto-generated method stub

	Product getProduct(Integer productId) throws Exception;

	List<Product> getAllProducts();

	Product updateProduct(Product product) throws Exception;

	String deleteProduct(Integer productId) throws Exception;
		

}
