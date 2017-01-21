package com.handbags.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@SuppressWarnings("serial")
@Entity
public class ShippingAddress implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int shippingAddressId;	
private int flatNo;
private String buildingName;
private String street;
private String city;
private String state;
private int pincode;

@OneToOne
private UserDetail userDetail;

public int getShippingAddressId() {
	return shippingAddressId;
}

public void setShippingAddressId(int shippingAddressId) {
	this.shippingAddressId = shippingAddressId;
}

public int getFlatNo() {
	return flatNo;
}

public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}

public String getBuildingName() {
	return buildingName;
}

public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public UserDetail getUserDetail() {
	return userDetail;
}

public void setUserDetail(UserDetail userDetail) {
	this.userDetail = userDetail;
}


	
}
