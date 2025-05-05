package com.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exception.ProductNotFoundException;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
 	ProductRepository productRepository;
	@Override
	public String addProduct(Product request) {
		
		Product result = new Product();
		result.setProductId(request.getProductId());
		result.setProductCode(request.getProductCode());
		result.setProductName(request.getProductName());
		result.setPricePerItem(request.getPricePerItem());
		result.setQuantity(request.getQuantity());
		
		Product Productres = productRepository.save(result);

		if (Productres != null) {
			return "details saved";
		} else {
			return "unable to save";
		}
		
		// TODO Auto-generated method stub
		
		
		
		
	}
	@Override
	public Product getProduct(Integer productId) throws Exception {
		// TODO Auto-generated method stub
	Optional<Product> Optionalproduct= 	productRepository.findById(productId);
	if (!Optionalproduct.isPresent()) {
		throw new ProductNotFoundException(String.format("No Such Product Found for productId %s", productId));
	}
		return Optionalproduct.get();
	}
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products= productRepository.findAll();
		
		return products;
	}
	@Override
	public Product updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Product productResponse = getProduct(product.getProductId());
		if (product.getProductName() != null) {
 			productResponse.setProductName(product.getProductName());
 		}
 		if (product.getPricePerItem() != null) {
 			productResponse.setPricePerItem(product.getPricePerItem());
 		}
 		if (product.getProductCode() != null) {
 			productResponse.setProductCode(product.getProductCode());
 		}
 		if (product.getQuantity() != null) {
 			productResponse.setQuantity(product.getQuantity());
 		}
 		Product response = productRepository.save(productResponse);
 		return response;
		
	}
	@Override
	public String deleteProduct(Integer productId) throws Exception {
		// TODO Auto-generated method stub
		 Product product = getProduct(productId);
		if(product!=  null)
		{
			productRepository.deleteById(productId);
			return "Deleted Sucessfullly";
		}
		
		return "not found";
		 
}
}
