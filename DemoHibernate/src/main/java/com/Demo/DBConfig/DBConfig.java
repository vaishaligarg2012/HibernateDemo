package com.Demo.DBConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig {
	private static SessionFactory sf;
	static {
		Configuration cfg=new Configuration();
		cfg.configure(); //will read the hibernate.cfg.xml file
		
		sf=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sf;
	}
	
}
