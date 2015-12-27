package com.examples.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.examples.entity.Book;
import com.examples.utils.HibernateUtils;

public class BookDao {
	SessionFactory sessionFactory;
	
	public BookDao(){
		sessionFactory=HibernateUtils.getSessionFacotry();
	}
	public List<Book> getAllBooks() {
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		Query querry = session.createQuery("from Book");
		List<Book> books =querry.list();		
		session.getTransaction();
		session.close();
		return books;
	}

}
