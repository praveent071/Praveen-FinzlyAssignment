package com.employee.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crud1 {
	public static void main(String[] args) {
		SessionFactory sf = session.getsession();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		employee emp = new employee();
		emp.setId(6);
		emp.setFirstname("sathish");
		emp.setLastname("kumar");
		emp.setDob("14/06/2001");
		emp.setEmail("sathish@gmail.com");
		emp.setDepartment("mech");
		emp.setSalary(45000);
		session.save(emp);
		tr.commit();
		session.close();
		
	}

}
