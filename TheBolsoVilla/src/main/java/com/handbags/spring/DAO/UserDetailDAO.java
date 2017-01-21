package com.handbags.spring.DAO;

import com.handbags.spring.model.BillingAddress;
import com.handbags.spring.model.ShippingAddress;
import com.handbags.spring.model.UserDetail;

public interface UserDetailDAO {

public void addUserDetail(UserDetail userDetail);

public  void saveBillingAddress(BillingAddress billingAddress);
	
public  void saveShippingAddress(ShippingAddress shippingAddress);
}
