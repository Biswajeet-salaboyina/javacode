package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired 
	  ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProduct (@RequestBody Product request)
	{
		String response  = productService.addProduct(request);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@GetMapping("/get-products/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable ("productId") Integer productId ) throws Exception
	{
		Product productResponse = productService.getProduct(productId);
		return ResponseEntity.status(HttpStatus.OK)
		.body(productResponse);
	}
	
	
	@GetMapping("/get")
 	public ResponseEntity<List<Product>> getAllProducts() {
 		
 		List<Product> products = productService.getAllProducts();
 		
 		return ResponseEntity.status(HttpStatus.OK).body(products);
 	}
	
	@PutMapping("/update/details")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) throws Exception
	{
		Product productResponse = productService.updateProduct(product);
		
		return ResponseEntity.status(HttpStatus.OK).body(productResponse);
		
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable ("productId") Integer productId ) throws Exception
	{
		String productResponse =  productService.deleteProduct(productId);
		return  ResponseEntity.status(HttpStatus.OK).body(productResponse);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
