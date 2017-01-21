package com.handbags.spring.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.handbags.spring.DAO.WishListDAO;
import com.handbags.spring.model.CartItem;
import com.handbags.spring.model.Category;
import com.handbags.spring.model.WishList;



@Repository
public class WishListImpl implements WishListDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	public WishListImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;
	}
	
	
	public void addWishList(WishList wishList) {
	
		sessionFactory.getCurrentSession().saveOrUpdate(wishList);
	}



	public List<WishList> getWishList() {
	
		Session session =sessionFactory.getCurrentSession();
		String hql="from WishList";
		@SuppressWarnings("unchecked")
		List<WishList> wlist=session.createQuery(hql).getResultList();
		return wlist;
	}


	public void deleteWishList(int wishListId) {
		WishList wishListToDelete= new WishList();	
		wishListToDelete.setWishListId(wishListId);;
		sessionFactory.getCurrentSession().delete(wishListToDelete);
			
	}

}
