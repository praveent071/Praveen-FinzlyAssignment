package com.library.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client7 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		book book1 = new book();
		book1.setId(2);
		book1.setAuthor("arun");
		book1.setTitle("lifecycle");
		book1.setPublicationyear(2005);
		book1.setIsbn(74185);
		session.update(book1);
		tr.commit();
		session.close();
		
	}

}
