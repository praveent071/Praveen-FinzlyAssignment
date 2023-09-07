package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client1 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		list l = new list();
		l.setId(6);
		l.setName("mani");
		l.setAge(21);
		l.setStandard(9);
		session.save(l);
		tr.commit();
		session.close();
		
		
	}
	

}
