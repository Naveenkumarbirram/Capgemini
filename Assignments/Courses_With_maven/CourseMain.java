package org.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CourseMain {

	public static void main(String[] args) {
		System.out.println( "Project started" );
		//connection established to the hibernate
		Configuration cfg = new Configuration();
		cfg.configure("course.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Employee object

		Course em=new Course();
		em.setCourseID(102);
		em.setCourseName(".net Full Stack");
		em.setCoursePrice(20000);
		em.setCourseDuration(4);
		System.out.println(em);

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(em);
		session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully...");
	}

}