package com.handbags.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProductDetail {
	
	
	@Id
	private int productId;
	private String productName;
	private String productDescription;
	private int productQuantity;
	private int productDiscount;
	private int productPrice;
	private String productColor;
	private String productRating;
	
	
	@OneToOne
	@JoinColumn(name="productId",updatable=false,insertable=false)
	private Product product;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	public int getProductDiscount() {
		return productDiscount;
	}


	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductColor() {
		return productColor;
	}


	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}


	public String getProductRating() {
		return productRating;
	}


	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
