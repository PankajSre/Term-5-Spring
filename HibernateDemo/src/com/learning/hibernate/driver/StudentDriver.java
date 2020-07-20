package com.learning.hibernate.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.model.Student;

public class StudentDriver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		// Do all the Work here
		// -----------------------------------------------------------
		// Student student = new Student(101, "admin", "admin@123", "admin@niit.com",
		// 6786876L, "Male", "Delhi");

		// Use the save method of session interface to store the Object inside the
		// database
		// CRUD
		// insert into student values(?,?).....
		// session.save(student);

		// 2. Read the Data from Database

//	     Student std = session.get(Student.class, 102);
//	     
//	     System.out.println(std);

		// 3. Update Student Information
		// Which record need to be updated
		// 3.1 Fetch the Object that need to be Updated
//		 Student studentUpdate = session.get(Student.class, 102);

		// 3.2 Update the values using setter method

//		 studentUpdate.setEmail("abc.123@xyz.com");
//		 studentUpdate.setAddress("Bangalore");

		// 3.3 push the updated Object in the database

//		  session.update(studentUpdate);

		// 4. Delete the record
		// 4.1 Fetch the Object that need to be Updated
//		Student studentDelete = session.get(Student.class, 102);

		// 4.2 Delete the Onject

//		session.delete(studentDelete);

		// 5. Fetch all the records:
		
		List<Student> students = session.createQuery("from Student").list();
		System.out.println(students);
		
		// ------------------------------------------------------------
		tx.commit();
		session.close();

	}

}
