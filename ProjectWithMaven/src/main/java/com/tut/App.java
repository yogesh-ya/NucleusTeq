package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started.." );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        //creating Student object
        Student st=new Student();
        st.setName("sita");
        st.setCity("Bhopal");
        System.out.println(st);
        
        //creating Address Object
        Address ad=new Address();
        ad.setStreet("Street_2");
        ad.setCity("Bhopal");
        ad.setOpen(true);
        ad.setX(1234.556);
        ad.setAddedDate(new Date());
        
        //Reading Image
        FileInputStream fis=new FileInputStream("src/main/java/my_profile_pic.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
    //open session using factory
      Session session=factory.openSession();
      Transaction tx=session.beginTransaction();
      session.save(st);
      session.save(ad);
      tx.commit();
      session.close();
      System.out.println("Done..");
    }
}
