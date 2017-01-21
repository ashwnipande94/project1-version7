package com.handbags.spring.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.handbags.spring.DAO.ProductDAO;
import com.handbags.spring.model.Product;
import com.handbags.spring.model.ViewProduct;

@Repository
public class ProductImpl implements ProductDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public ProductImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory=sessionFactory;
	}

	public void addProductDAO(Product product) {

	sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	public List<Product> getList() {
	Session session =sessionFactory.getCurrentSession();
	String hql="from Product";
	@SuppressWarnings("unchecked")
	List<Product> clist=session.createQuery(hql).getResultList();
	return clist;
	}

	public Product getProductById(int productId ) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product where productId =" +productId;
		@SuppressWarnings("unchecked")
		List<Product> clist=session.createQuery(hql).getResultList();
		return clist.get(0);
	} 

	public void deleteProduct(int productId){
		Product productToDelete= new Product();	
		productToDelete.setProductId(productId);
	sessionFactory.getCurrentSession().delete(productToDelete);
		
	}
	public Product getProductByName(String productName){
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product where productName="+"'"+productName+"'";
		@SuppressWarnings("unchecked")
		List<Product> clist=session.createQuery(hql).getResultList();
		return clist.get(0);
	
	
	}

	public String getJsonList() {
		Session session =sessionFactory.getCurrentSession();
		String hql="from Product";
		@SuppressWarnings("unchecked")
		List<Product> clist=session.createQuery(hql).getResultList();
		
//		Gson gson = new Gson();
		Gson gson= new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String jsonList = gson.toJson(clist);
		return jsonList;	
		
		
	}
	
	public ViewProduct getViewProductById(int productId ) {
		Session session =sessionFactory.getCurrentSession();
		String hql="from ViewProduct where productId =" +productId;
		@SuppressWarnings("unchecked")
		List<ViewProduct> vplist=session.createQuery(hql).getResultList();
		return vplist.get(0);
	}
	
	
	public void updateQuantity (int productId,int quantity){
		String hql="update Product set productQuantity =productQuantity-"+quantity+" where productId="+productId;
		sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
	}

	
	
	
}
