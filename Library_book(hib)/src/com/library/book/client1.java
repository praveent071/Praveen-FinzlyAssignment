package com.library.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class client1 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		book l = new book();
		l.setId(5);
		l.setTitle("Bio");
		l.setAuthor("praveen");
		l.setPublicationyear(1999);
		l.setIsbn(85212);
		session.save(l);
		tr.commit();
		session.close();
	}

}
