package com.handbags.spring.model;

import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

import com.google.gson.annotations.Expose;

@Entity

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
	private int categoryId;
	
	@NotEmpty
	@Expose
	@Pattern(regexp="^[A-Za-z+]+[0-9+]*$",message="categoryname should start with an alphabet")
	private String categoryName;
	
	@NotEmpty(message="cannot be empty")
	@Expose
	private String categoryDescription;
	
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	@Expose
	private Set<Subcategory> subcategory;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Set<Subcategory> getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Set<Subcategory> subcategory) {
		this.subcategory = subcategory;
	}

	
		
}