package com.handbags.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.handbags.spring.Impl.ProductImpl;
import com.handbags.spring.model.Product;
import com.handbags.spring.model.ViewProduct;


@Service
@Transactional
public class ProductServices {

@Autowired	
ProductImpl productImpl ;
	
	public void addProduct(Product product)
	{
    	productImpl.addProductDAO(product);
		
	}
	
	public List<Product> getList(){
		
		return productImpl.getList();
	}
	public Product getProductById(int productId ){
		
		return productImpl.getProductById(productId);
	}

	public void deleteProduct(int productId) {
		 productImpl.deleteProduct(productId);
	
	}

	public String getJsonList() {
	
		return productImpl.getJsonList();
	}
	
	public ViewProduct getViewProductById(int productId ) {
		
		return productImpl.getViewProductById(productId);
	}
	
	public void updateQuantity (int productId,int quantity){
		
		 productImpl.updateQuantity(productId, quantity);;
	}

}
