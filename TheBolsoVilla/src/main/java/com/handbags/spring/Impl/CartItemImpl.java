package com.handbags.spring.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.handbags.spring.DAO.CartItemDAO;
import com.handbags.spring.model.CartItem;
import com.handbags.spring.model.Category;


@Repository
public class CartItemImpl implements CartItemDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	public void addCartItem(CartItem cartItem){
	sessionFactory.getCurrentSession().saveOrUpdate(cartItem);	
		
	}
	public CartItem getCartItemById(int cartItemId){
		
		Session session =sessionFactory.getCurrentSession();
		String hql=" from CartItem where cartItemId =" +cartItemId;
		@SuppressWarnings("unchecked")
		List<CartItem> vplist = session.createQuery(hql).getResultList();
		return vplist.get(0);
	}	
	
	public void updateFlag(int cartItemId){
		
		String hql="update CartItem set flag=true where cartItemId="+cartItemId;
		sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
	}
	
	
	public List<CartItem> getCartList(int userId) {
		
		Session session =sessionFactory.getCurrentSession();
		String hql="from CartItem where userId="+userId+"and Flag=false";
		@SuppressWarnings("unchecked")
		List<CartItem> clist=session.createQuery(hql).getResultList();
		return clist;
		
		}
	
	public void deleteCartItem(int cartItemId) {
		CartItem cartItemToDelete= new CartItem();	
		cartItemToDelete.setCartItemId(cartItemId);
		sessionFactory.getCurrentSession().delete(cartItemToDelete);
			
	}
	
	
}






