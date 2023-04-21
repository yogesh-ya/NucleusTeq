package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//creating Question object
		Question question1=new Question();
		question1.setQuestionId(101);
		question1.setQuestion("What is java?");
		
		//creating Answer object
		Answer answer1=new Answer();
		answer1.setAnswerId(201);
		answer1.setAnswer("java is a programming language.");
		answer1.setQuestion(question1);
		question1.setAnswer(answer1);
		//----------
		
		//creating Question object
		Question question2=new Question();
		question2.setQuestionId(102);
		question2.setQuestion("what is collection Framework?");
		
		//creating Answer object
		Answer answer2=new Answer();
		answer2.setAnswerId(202);
		answer2.setAnswer("API of java used for collection.");
		answer2.setQuestion(question2);
		question2.setAnswer(answer2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(question1);
		session.save(question2);
		session.save(answer1);
		session.save(answer2);
		
		tx.commit();
		session.close();
		System.out.println(question1.getQuestionId());
		System.out.println(question1.getQuestion());
		System.out.println(question1.getAnswer().getAnswer());
		
	}

}
