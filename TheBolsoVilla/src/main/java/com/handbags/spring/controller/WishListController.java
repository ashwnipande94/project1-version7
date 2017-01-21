package com.handbags.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.handbags.spring.Service.ProductServices;
import com.handbags.spring.Service.UserDetailService;
import com.handbags.spring.Service.WishListServices;
import com.handbags.spring.model.CartItem;
import com.handbags.spring.model.Product;
import com.handbags.spring.model.WishList;

@Controller
public class WishListController {
	
	@Autowired
	WishListServices wishListServices;
	
	@Autowired
	UserDetailService userDetailService;
	
	@Autowired
	ProductServices productServices;
	
	
	@RequestMapping("wishList-{productId}")
	public String buynow(@PathVariable("productId")int productId, @ModelAttribute("wishList")WishList wishList,Model model,@RequestParam("userId")int userId,Product product ,HttpSession httpSession){
		
	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	String username=auth.getName();
	userId=userDetailService.getUserByName(username).getUserId();
	
	wishList.setCartId(userId);
	wishList.setUserId(userId);
	wishList.setProductId(productId);
	
    String productName=productServices.getProductById(productId).getProductName();
	wishList.setProductName(productName);
	
	int productPrice=productServices.getProductById(productId).getProductPrice();
	wishList.setProductPrice(productPrice);
	
	int productDiscount=productServices.getProductById(productId).getProductDiscount();
	wishList.setProductDiscount(productDiscount);
	
	wishListServices.addWishList(wishList);
	
	return "redirect:/WishList";
			
}
	
	@RequestMapping(value = "WishList")
	   public String wishList(Model model,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userDetailService.getUserByName(userName);
        int userId=userDetailService.getUserByName(userName).getUserId();
        httpSession.setAttribute("userId", userId);


		   Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		   String wishList=gson.toJson(wishListServices.getWishList());
		   model.addAttribute("wishList", wishList);
		  
		   return "WishList";
	}
	
	@RequestMapping(value="deleteWishList-{wishListId}")
	   public String deleteWishList(@PathVariable("wishListId") int wishListId)
	   {
		   wishListServices.deleteWishList(wishListId);;
		   return "redirect:/WishList";
	   }	
	
	
	

	


}
