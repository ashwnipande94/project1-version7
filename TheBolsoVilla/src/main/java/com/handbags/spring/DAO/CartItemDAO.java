package com.handbags.spring.DAO;

import java.util.List;

import com.handbags.spring.model.CartItem;

public interface CartItemDAO {

	public void addCartItem(CartItem cartItem);
	
	public List<CartItem> getCartList(int userId);
	
	public void deleteCartItem(int cartItemId);
	
	
}
