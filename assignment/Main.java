package com.assignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		
		Book book = new Book(101,"Unlocking Android","W. Frank Ableson","506");
		Book book1 = new Book(102,"Android in Action, Second Edition","Robi Sen","766");
		Book book2 = new Book(103,"Specification by Example","Gojko Adzic","178");
		Book book3 = new Book(104,"Flex 3 in Action","Faisal Abid","105");
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// add to the database
		
//		session.save(book);
//		session.save(book1);
//		session.save(book2);
//		session.save(book3);
		
		// delete from the database
		
				session.delete(book1);
		
		// get from the database
		
		List<Book> books = new ArrayList<>();
		
		
		for (int i = 101;i<105;i++) {
			books.add(session.get(Book.class, i));
		}
		
		for (int i = 0;i<books.size();i++) 
			System.out.println(books.get(i));
		
		
		
		
		transaction.commit();
		
			
	}
}
