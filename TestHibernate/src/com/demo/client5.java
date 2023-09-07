package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class client5 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(list.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(list.class);
		criteria .add(Restrictions.gt("age", 20));
		List <list> m2 = criteria.list();
		for(list show: m2) {
			System.out.println("The age greater than 20"+show);
		}
		
		
		tr.commit();
		session.close();
	}

}
