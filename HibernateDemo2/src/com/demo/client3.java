package com.demo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class client3 {
    public static void main(String[] args) {
        SessionFactory sf = session.getsession();
        Session session = sf.openSession();

        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(login.class);
        List<login> li= criteria.list();
        for(login show:li){
            System.out.println("All data in the database "+ show);

        }
        tr.commit();
        session.close();

    }

}
