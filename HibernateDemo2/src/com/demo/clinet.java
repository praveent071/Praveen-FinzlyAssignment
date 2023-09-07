package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class clinet {
    public static void main(String[] args) {
        SessionFactory sf = session.getsession();
        Session session = sf.openSession();

        Transaction tr = session.beginTransaction();
        login l = new login();
        l.setId(183);
        l.setUsername("mad");
        l.setPassword("8526");
        session.save(l);
        login login = session.load(login.class,6);
        System.out.println(login);
        tr.commit();
        session.close();



    }
}
