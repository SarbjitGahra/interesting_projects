package com.examples.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtils {
 private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFacotry() {
		// TODO Auto-generated method stub
		if(sessionFactory != null)
			return sessionFactory;
		else{
			
			Configuration config = new Configuration().configure();
			StandardServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = config.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		}
		
	}

}
