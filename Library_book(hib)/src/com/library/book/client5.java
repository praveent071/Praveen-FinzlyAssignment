package com.library.book;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class client5 {
public static void main(String[] args) {
	SessionFactory sf = session.getsession();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Criteria criteria = session.createCriteria(book.class);
	criteria .add(Restrictions.eq("isbn", 85296));
	List<book> li = criteria.list();
	System.out.println("The isbn  is 85296 will print "+li);
}

}
