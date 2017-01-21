package com.handbags.spring.config;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.handbags.spring.model.BillingAddress;
import com.handbags.spring.model.MainClass;
import com.handbags.spring.model.ShippingAddress;


@Component
public class CartHandler {

	public MainClass initFlow(){
		return new MainClass();
		
	}
	
	public String validateShippingAddress(ShippingAddress shippingAddress,MessageContext messageContext){
		
     String status = "success";
		
		if(shippingAddress.getBuildingName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("buildingName").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
		
		if(shippingAddress.getState().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("state").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
		
		if(shippingAddress.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("city").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
		
				return status;	
	}
	
	
	public String validateBillingAddress(BillingAddress billingAddress,MessageContext messageContext){
		
     String status = "success";
		
		if(billingAddress.getBuildingName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("buildingName").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
		
		if(billingAddress.getState().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("state").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
		
		if(billingAddress.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source("city").defaultText("this field cannot be Empty").build());
			 status = "failure";
		}
	
		
		return status;
	}
	
}
