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
import com.handbags.spring.Service.CartItemService;
import com.handbags.spring.Service.ProductServices;
import com.handbags.spring.Service.UserDetailService;
import com.handbags.spring.model.CartItem;
import com.handbags.spring.model.Product;

@Controller
public class CartItemController {
	
	@Autowired
	CartItemService cartItemService;
	
	@Autowired
	UserDetailService userDetailService;
	
	@Autowired
	ProductServices productServices;
	
	@RequestMapping("buynow-{productId}")
	public String buynow(@PathVariable("productId")int productId, @ModelAttribute("cartItem")CartItem cartItem,Model model,@RequestParam("userId")int userId,Product product ,HttpSession httpSession){
		
	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	String username=auth.getName();
	userId=userDetailService.getUserByName(username).getUserId();
	
	cartItem.setCartId(userId);
	cartItem.setUserId(userId);
	cartItem.setProductId(productId);
	
    String productName=productServices.getProductById(productId).getProductName();
	cartItem.setProductName(productName);
	
	int productPrice=productServices.getProductById(productId).getProductPrice();
	cartItem.setProductPrice(productPrice);
	
	int productDiscount=productServices.getProductById(productId).getProductDiscount();
	cartItem.setProductDiscount(productDiscount);
	
	cartItem.setFlag(false);
	cartItem.setProductQuantity(1);
	cartItemService.addCartItem(cartItem);
	productServices.updateQuantity(productId, cartItem.getProductQuantity());;
	
	httpSession.setAttribute("cartItemId",cartItem.getCartItemId());
	int cartItemId= (Integer) httpSession.getAttribute("cartItemId");
	
	return "redirect:/cartlist-"+cartItemId;
			
}
	
	@RequestMapping("cartlist-{cartItemId}")
	public String cartList(Model model,HttpSession httpSession){
		
    Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    String username=auth.getName();
    int userId=userDetailService.getUserByName(username).getUserId();
    
    httpSession.setAttribute("userId", userId);
    int cartItemId=(Integer) httpSession.getAttribute("cartItemId");
    
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    String crt=gson.toJson(cartItemService.getCartItemById(cartItemId));
    model.addAttribute("cartList",crt);
    
	return "CartList" ;

	}
	
	@RequestMapping("checkout")
	public String checkout(@RequestParam("userId")int userId,HttpSession httpSession){
		
     Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	 String username =auth.getName();	
	 userId=userDetailService.getUserByName(username).getUserId();
	  
	 
	 httpSession.setAttribute("userId", userId);
	 
	    
	 
	 return "redirect:/cart?userId="+userId;
		
		
	}
	
	
	@RequestMapping("addtocart-{productId}")
	public String addtocart(@PathVariable("productId")int productId, @ModelAttribute("cartItem")CartItem cartItem,Model model,@RequestParam("userId")int userId,Product product ,HttpSession httpSession){
		
	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
	String username=auth.getName();
	userId=userDetailService.getUserByName(username).getUserId();
	
	cartItem.setCartId(userId);
	cartItem.setUserId(userId);
	cartItem.setProductId(productId);
	
    String productName=productServices.getProductById(productId).getProductName();
	cartItem.setProductName(productName);
	
	int productPrice=productServices.getProductById(productId).getProductPrice();
	cartItem.setProductPrice(productPrice);
	
	int productDiscount=productServices.getProductById(productId).getProductDiscount();
	cartItem.setProductDiscount(productDiscount);
	
	cartItem.setFlag(false);

	cartItemService.addCartItem(cartItem);
	productServices.updateQuantity(productId, cartItem.getProductQuantity());;
	
	httpSession.setAttribute("cartItemId",cartItem.getCartItemId());
	int cartItemId= (Integer) httpSession.getAttribute("cartItemId");
	
	return "redirect:/AddtoCart";
			
}
	
	@RequestMapping("AddtoCart")
	public String addtocartList(Model model,HttpSession httpSession){
		
    Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    String username=auth.getName();
    int userId=userDetailService.getUserByName(username).getUserId();
    
    httpSession.setAttribute("userId", userId);
    int cartItemId=(Integer) httpSession.getAttribute("cartItemId");
    
    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    String crt=gson.toJson(cartItemService.getCartList(userId));
    model.addAttribute("cartList",crt);
    
	return "AddtoCart" ;

	}

	@RequestMapping("/deleteCartItem-{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId") int cartItemId){
		
	cartItemService.deleteCartItem(cartItemId);
	return "redirect:/AddtoCart";
		
	}

	
	
	
}