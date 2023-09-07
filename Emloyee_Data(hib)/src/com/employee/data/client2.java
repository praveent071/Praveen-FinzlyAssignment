package com.employee.data;

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
		Criteria criteria = session.createCriteria(employee.class);
		criteria .add(Restrictions.in("department", "tester","dev"));
		
		List<employee> li = criteria.list();
		System.out.println("The department of developer & Tester "+li);
	}

}
