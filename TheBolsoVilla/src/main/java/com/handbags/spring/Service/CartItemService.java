package com.handbags.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.handbags.spring.Impl.CartItemImpl;
import com.handbags.spring.model.CartItem;

@Service
@Transactional
public class CartItemService {
	
	@Autowired
	CartItemImpl cartItemImpl;
	

	public void addCartItem(CartItem cartItem){
		
	cartItemImpl.addCartItem(cartItem);	
		
	}
	
	public CartItem getCartItemById(int cartItemId){
		return cartItemImpl.getCartItemById(cartItemId);
		
	}
	
	
	public List<CartItem> getCartList(int userId) {
		return cartItemImpl.getCartList(userId);
	}
	
	
	public void deleteCartItem(int cartItemId) {
		cartItemImpl.deleteCartItem(cartItemId);
	
	}
}

