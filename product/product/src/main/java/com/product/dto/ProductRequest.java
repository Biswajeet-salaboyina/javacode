package com.product.dto;

import jakarta.persistence.Column;

public class ProductRequest {

	private Integer productId;

	private String productCode;
	private String productName;
	private Integer quantity;
	private Double pricePerItem;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	
	
	
}
