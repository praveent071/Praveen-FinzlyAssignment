package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client2 {
    public static void main(String[] args) {
        SessionFactory sf = session.getsession();
        Session session = sf.openSession();

        Transaction tr = session.beginTransaction();
        login l = new login();
        l.setId(120);
        l.setUsername("que");
        l.setPassword("1212");
        session.delete(l);
        tr.commit();
        session.close();
    }
}
