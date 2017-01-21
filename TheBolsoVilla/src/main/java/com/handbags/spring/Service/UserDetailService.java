package com.handbags.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.handbags.spring.Impl.UserDetailImpl;
import com.handbags.spring.model.BillingAddress;
import com.handbags.spring.model.ShippingAddress;
import com.handbags.spring.model.UserDetail;

@Service
@Transactional
public class UserDetailService {
	
	@Autowired
	UserDetailImpl userDetailImpl;

	public  void saveBillingAddress(BillingAddress billingAddress) {
	

   userDetailImpl.saveBillingAddress(billingAddress);
		
	}

	public  void saveShippingAddress(ShippingAddress shippingAddress) {
		
	userDetailImpl.saveShippingAddress(shippingAddress); ;
		
	}
	

	public void addUserDetail(UserDetail userDetail)
	{
		userDetailImpl.addUserDetail(userDetail);
		
	}
	
	public UserDetail getUserByName(String username){
		
		return userDetailImpl.getUserByName(username);
		
	}
	

	public UserDetail getUserById(int userId){
		
		return userDetailImpl.getUserById(userId);
	}
	
	
	public BillingAddress getBillingAddressByUserId(int userId){
	
	return userDetailImpl.getBillingAddressByUserId(userId);
	}
	

	public ShippingAddress getShippingAddressByUserId(int userId){
		
		return userDetailImpl.getShippingAddressByUserId(userId);
		
	}
	
	
}
