package com.Demo.HibernateDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Demo.DBConfig.DBConfig;
import com.Demo.DemoHibernate.Products;

public class HibernateDAOImpl  implements HibernateDao{
	SessionFactory sf=DBConfig.getSessionFactory();
	
	public boolean  updateProduct(Products p) {
		// TODO Auto-generated method stub
		Session session =sf.openSession();
		Transaction tx=session.beginTransaction();
		
	   
	    session.update(p);
	    
	    tx.commit();
	    session.close();
	    return true;
		
	
	}

	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
				try {
			Session session =sf.openSession();
			Transaction tx=session.beginTransaction();
			Products obj=session.get(Products.class, id);
			session.remove(obj);
			tx.commit();
			session.close();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
	}

	public boolean insertProduct(Products product) {
		// TODO Auto-generated method stub
		try{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(product);
			tx.commit();
			session.close();
			return true;
			}
			catch(Exception e){
			e.printStackTrace();
			return false;
			}
		
	}

}
