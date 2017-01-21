package com.handbags.spring.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.mapping.results.Success;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import com.handbags.spring.Service.UserDetailService;
import com.handbags.spring.model.BillingAddress;
import com.handbags.spring.model.ShippingAddress;
import com.handbags.spring.model.UserDetail;

@Component
public class WebFlowHandler {
	
	@Autowired
	UserDetailService userDetailService;
	
	@Autowired
	BillingAddress billingAddress;
	
	@Autowired
	ShippingAddress shippingAddress;
	
	
	public UserDetail initFlow()
	{
	return new UserDetail();
	}
	
	

	public String validateDetails(UserDetail userDetail,MessageContext messageContext){
		String status = "success";
		
		if(userDetail.getUsername().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("username").defaultText("username cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("password").defaultText("password cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getFname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("fname").defaultText("fname cannot be Empty").build());
			 status = "failure";
		}
		
		if(userDetail.getLname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("lname").defaultText("lname cannot be Empty").build());
			 status = "failure";

	}
		if(userDetail.getEmailId().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("emailId").defaultText("email cannot be Empty").build());
			 status = "failure";

		
		}
		return status;
}
	
	
	public String addbillingAddress(BillingAddress billingAddress){
		
		this.billingAddress.setBillingAddressId(billingAddress.getBillingAddressId());
		this.billingAddress.setBuildingName(billingAddress.getBuildingName());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setFlatNo(billingAddress.getFlatNo());
		this.billingAddress.setPincode(billingAddress.getPincode());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setStreet(billingAddress.getStreet());
		

		return "submit";
		}
	
	public String addshippingAddress(ShippingAddress shippingAddress){
	
		this.shippingAddress.setShippingAddressId(shippingAddress.getShippingAddressId());
		this.shippingAddress.setBuildingName(shippingAddress.getBuildingName());
		this.shippingAddress.setCity(shippingAddress.getCity());
		this.shippingAddress.setFlatNo(shippingAddress.getFlatNo());
		this.shippingAddress.setPincode(shippingAddress.getPincode());
		this.shippingAddress.setState(shippingAddress.getState());
		this.shippingAddress.setStreet(shippingAddress.getStreet());
		
		return "submit";
	}
	
	
	
	
	public String saveOrupdate(UserDetail userDetail , BillingAddress  billingAddress, ShippingAddress shippingAddress){
		
		 userDetailService.addUserDetail(userDetail);
		
		shippingAddress.setUserDetail(userDetail);
		userDetail.setShippingAddress(shippingAddress);
		this.shippingAddress.setUserDetail(userDetail);
	
	    billingAddress.setUserDetail(userDetail);
	    userDetail.setBillingAddress(billingAddress);
	    this.billingAddress.setUserDetail(userDetail);
	 
	    
	    userDetail.setBillingAddress(billingAddress);
	    userDetail.setShippingAddress(shippingAddress);
	    
	    userDetailService.saveBillingAddress(billingAddress);
	    userDetailService.saveShippingAddress(shippingAddress);
	    
	    userDetailService.addUserDetail(userDetail);
	    
	    return "submit";
		
		}
	
	
}



