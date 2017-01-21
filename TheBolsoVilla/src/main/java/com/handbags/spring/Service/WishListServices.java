package com.handbags.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.handbags.spring.Impl.WishListImpl;
import com.handbags.spring.model.WishList;


@Transactional
@Service
public class WishListServices {

	@Autowired
	WishListImpl wishListImpl;
	
	
	public void addWishList(WishList wishList){
		
		wishListImpl.addWishList(wishList);
		
	}
	
	public List<WishList> getWishList()
	{
		
		 return wishListImpl.getWishList();
	}
	
	public void deleteWishList(int wishListId){
		
		wishListImpl.deleteWishList(wishListId);
	}
}

