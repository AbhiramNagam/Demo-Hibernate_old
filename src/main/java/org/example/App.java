package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration =  new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();

        person p1 = new person(1, "kali", "git", "123");
        person p2 = new person(2, "arch", "git", "456");
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(p2);

        tx.commit();

        factory.close();
    }
}
