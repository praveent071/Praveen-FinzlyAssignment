package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class client7 {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(list.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Criteria criteria = session.createCriteria(list.class);
	criteria.setProjection(Projections.count("name"));
	List<list> m =criteria.list();
	System.out.println(m);
	tr.commit();
	session.close();
	
}

}
