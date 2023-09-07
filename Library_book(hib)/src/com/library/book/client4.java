package com.library.book;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class client4 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(book.class);
		criteria .add(Restrictions.eq("title", "zone"));
		List<book> li = criteria.list();
		System.out.println("The Title name is zone will print "+li);
	}


}
