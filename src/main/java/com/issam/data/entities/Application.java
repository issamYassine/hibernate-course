package com.issam.data.entities;

import org.hibernate.SessionFactory;

/**
 * Created by issam on 10/6/2015.
 */
public class Application {

    public static void main(String[] args){

        User user = new User();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(user);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
