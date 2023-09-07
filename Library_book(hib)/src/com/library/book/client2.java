package com.library.book;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class client2 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(book.class);
		criteria .add(Restrictions.between("publicationyear", 2000,2001));
		List<book> li = criteria.list();
		for(book book1 : li) {
			System.out.println("Display the book published between 2000 -2001 "+book1);
			
		}
	}

}
