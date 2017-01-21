package com.handbags.spring.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.handbags.spring.DAO.UserDetailDAO;
import com.handbags.spring.model.BillingAddress;
import com.handbags.spring.model.Cart;
import com.handbags.spring.model.ShippingAddress;
import com.handbags.spring.model.User;
import com.handbags.spring.model.UserDetail;
import com.handbags.spring.model.UserRole;

@Repository
public class UserDetailImpl {
	
	
	@Autowired
	SessionFactory sessionFactory;

	public UserDetailImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;
	}
	
	
	 	public void addUserDetail(UserDetail userDetail) {
		

		Session session =sessionFactory.getCurrentSession();
		User user=new User();
		user.setUserId(userDetail.getUserId());
		user.setUsername(userDetail.getUsername());
		user.setPassword(userDetail.getPassword());
		user.setEnabled(true);
		session.saveOrUpdate(user);
		
		Cart cart=new Cart();
		cart.setCartId(userDetail.getUserId());
		cart.setUserId(user.getUserId());
        session.saveOrUpdate(cart);
		
        UserRole userRole=new UserRole();
        userRole.setUserId(user.getUserId());
        userRole.setRoleId(1);
        session.saveOrUpdate(userRole);
        
		//userDetail.getBillingAddress().setUserDetail(userDetail);
		//session.saveOrUpdat=see(userDetail.getBillingAddress());
		
		//userDetail.getShippingAddress().setUserDetail(userDetail);
		//session.saveOrUpdate(userDetail.getShippingAddress());
		
		userDetail.setUserId(user.getUserId());
		userDetail.setCartId(cart.getCartId());
		session.saveOrUpdate(userDetail);
		session.flush();
	}


		public void saveBillingAddress(BillingAddress billingAddress) {
			sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
			
		}
	
		public  void saveShippingAddress(ShippingAddress shippingAddress){
			sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
		}
		
	public UserDetail getUserByName(String username){
		
		Session session= sessionFactory.getCurrentSession();
		String hql="from UserDetail where username = '"+username+"'";
		@SuppressWarnings("unchecked")
		List<UserDetail> userList=session.createQuery(hql).getResultList();
		return userList.get(0);
	}	
	
	public UserDetail getUserById(int userId){
	
		Session session= sessionFactory.getCurrentSession();
		String hql="from UserDetail where userId = '"+userId+"'";
		@SuppressWarnings("unchecked")
		List<UserDetail> userById=session.createQuery(hql).getResultList();
		return userById.get(0);
		
		
	}
	
	public BillingAddress getBillingAddressByUserId(int userId){
		
		Session session= sessionFactory.getCurrentSession();
		String hql="from BillingAddress where UserDetail_UserId ="+userId;
		@SuppressWarnings("unchecked")
		List<BillingAddress> BillingAddressByUserId=session.createQuery(hql).getResultList();
		return BillingAddressByUserId.get(0);
	}
	
    public ShippingAddress getShippingAddressByUserId(int userId){
		
		Session session= sessionFactory.getCurrentSession();
		String hql="from ShippingAddress where  UserDetail_UserId ="+userId;
		@SuppressWarnings("unchecked")
		List<ShippingAddress> ShippingAddressByUserId=session.createQuery(hql).getResultList();
		return ShippingAddressByUserId.get(0);
	}

}
