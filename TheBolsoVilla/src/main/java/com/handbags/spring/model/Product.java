package com.handbags.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.annotations.Expose;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
    private int productId;
	
	@NotNull
	@Expose
	@Pattern(regexp="^[A-Za-z+]+[0-9+]*$",message="productname should start with an alphabet")
	private String productName;
	
	@NotEmpty(message="cannot be empty")
	@Expose
	private String productDescription;
	@Expose
	private int productQuantity;
	@Expose
	private int productDiscount;
	@Expose
	private int productPrice;
	@Expose
	private int categoryId;
	@Expose
	private int subcategoryId;
	@Expose
	private int brandId;
	@Expose
	private int SupplierId;
	
	@Transient
	List<MultipartFile>  productImage;

	@ManyToOne
	@JoinColumn(name="categoryId",updatable=false,insertable=false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="subcategoryId",updatable=false,insertable=false)
	private Subcategory subcategory;
	
	@ManyToOne
	@JoinColumn(name="brandId",updatable=false,insertable=false)
	private Brand brand;
	
	@ManyToOne
	@JoinColumn(name="supplierId",updatable=false,insertable=false)
	private Supplier supplier;

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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}

	public List<MultipartFile> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<MultipartFile> productImage) {
		this.productImage = productImage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

		
	}

