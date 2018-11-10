package com.Demo.DemoHibernate;

import com.Demo.HibernateDAO.HibernateDAOImpl;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Products obj=new Products();
        /* obj.setpSerialNumber(103);
         obj.setpName("Shirts");
         obj.setpPrice(1000);
         obj.setpQuantity(20);

		 */        
		  HibernateDAOImpl hb=new HibernateDAOImpl();
		 //hb.insertProduct(obj);
         //hb.deleteProduct(101);
		 obj.setpName("Shirts");
         obj.setpSerialNumber(102);
		 
         hb.updateProduct(obj);
	}

}
