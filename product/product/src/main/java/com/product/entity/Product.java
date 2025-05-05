package com.product.entity;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "product_table")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6068919695421757253L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_code")
	private String productCode;
	@Column(name="product_name")
	private String productName;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="price_per_item")
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
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", quantity=" + quantity + ", pricePerItem=" + pricePerItem + "]";
	}
	public Product(Integer productId, String productCode, String productName, Integer quantity, Double pricePerItem) {
		
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public Product() {
		
	}
	
	
	
}
