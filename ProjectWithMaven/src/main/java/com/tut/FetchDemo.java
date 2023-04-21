package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Student student=(Student)session.load(Student.class,2);
		Student student1=(Student)session.load(Student.class,2);
		
		System.out.println(student);
		System.out.println(student1);
		//Address ad=(Address)session.get(Address.class,1);
		//System.out.println(ad);
		session.close();
		
	}

}
