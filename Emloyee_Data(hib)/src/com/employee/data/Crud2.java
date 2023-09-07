package com.employee.data;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud2 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(employee.class);
		List<employee> li =criteria.list();
		for(employee show: li) {
			System.out.println("All employee details displayed "+show);
		}
		tr.commit();
		session.close();
	}

}
