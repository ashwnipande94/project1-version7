package com.handbags.spring.DAO;

import java.util.List;

import com.handbags.spring.model.WishList;

public interface WishListDAO {
	
	public void addWishList(WishList wishList);
	 
	public List<WishList> getWishList();
	
	
	public void deleteWishList(int wishListId);
}


