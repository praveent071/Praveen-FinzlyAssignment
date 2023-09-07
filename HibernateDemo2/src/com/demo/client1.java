package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client1 {
    public static void main(String[] args) {
        SessionFactory sf = session.getsession();
        Session session = sf.openSession();

        Transaction tr = session.beginTransaction();
        login l = new login();
        l.setId(183);
        l.setUsername("gugan");
        l.setPassword("28526");
        session.update(l);
        tr.commit();
        session.close();
    }

}
