package com.Demo.HibernateDAO;

import com.Demo.DemoHibernate.Products;

interface HibernateDao {
       public boolean  updateProduct(Products p);
       public boolean  deleteProduct(int id);
       public boolean insertProduct(Products product);
}
