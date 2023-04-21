package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object of student 1
		Student s1=new Student();
		s1.setName("Ram");
		s1.setCity("Indore");
		Certificate certificate=new Certificate();
		certificate.setCourse("core java");
		certificate.setDuration("2 months");
		s1.setCerti(certificate);
		
		//creating object of student 2
		Student s2=new Student();
		s2.setName("Sita");
		s2.setCity("Bhopal");
		Certificate certificate1=new Certificate();
		certificate1.setCourse("core java");
		certificate1.setDuration("2 months");
		s2.setCerti(certificate1);
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();				
		Session session=factory.openSession();
						Transaction tx=session.beginTransaction();
						session.save(s1);
						session.save(s2);
						tx.commit();
						session.close();
						
	}

}
