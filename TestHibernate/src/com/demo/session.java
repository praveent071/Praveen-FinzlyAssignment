package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class session {
	private session() {
		
	}
	public static SessionFactory getsession() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(list.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
