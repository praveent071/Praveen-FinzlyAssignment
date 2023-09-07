package com.employee.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud4 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		employee emp = new employee();
		emp.setId(3);
		emp.setFirstname("mukesh");
		emp.setLastname("kumar");
		emp.setDob("14/06/2005");
		emp.setEmail("mukesh@gmail.com");
		emp.setDepartment("ece");
		emp.setSalary(45000);
		session.delete(emp);
		tr.commit();
		session.close();
	}

}
