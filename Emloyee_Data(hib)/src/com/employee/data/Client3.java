package com.employee.data;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client3 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(employee.class);
		criteria .add(Restrictions.ne("department", "tester"));
		List<employee> li = criteria.list();
		
	
		System.out.println("Other than tester "+li);
	}

}
