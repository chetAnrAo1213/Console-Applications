package com.Hibernate.App;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_DAO implements DmlMethods {

	@Override
	public void insertStudentRecord() {
		try {
			SessionFactory sf = new Configuration().configure("com/Hibernate/App/hibernate.cfg.xml")
					.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction trx = ss.beginTransaction();
			Student_POJO spj = new Student_POJO();
			spj.setStudent_Name(StudentDetails.S_Name);
			spj.setStudent_RollNo(StudentDetails.S_RollNO);
			spj.setStudent_Class(StudentDetails.S_Class);
			spj.setStudent_Section(StudentDetails.S_Section);
			ss.save(spj);
			trx.commit();
			ss.close();
			sf.close();
			System.out.println("-->Successfully Inserted!");
		} catch (Exception e) {
			System.out.println("INSERTION Method Failed :- " + e.getMessage());
		}
	}

	public void updateStudentRecord() {
		try {
			SessionFactory sf = new Configuration().configure("com/Hibernate/App/hibernate.cfg.xml")
					.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction trx = ss.beginTransaction();
			String qry = "update Student_POJO " + 
							"set Student_Name=:a," + 
							"Student_RollNo=:b," + 
							"Student_Class=:c,"+
							"Student_Section=:d" +
							" where Student_RollNo=:x";
			Query Q1 = ss.createQuery(qry);
			Q1.setParameter("x", StudentDetails.newUpdatedRollNo);
			Q1.setParameter("a", StudentDetails.S_Name);
			Q1.setParameter("b", StudentDetails.S_RollNO);
			Q1.setParameter("c", StudentDetails.S_Class);
			Q1.setParameter("d", StudentDetails.S_Section);
			Q1.executeUpdate();

			trx.commit();
			ss.close();
			sf.close();
			System.out.println("->Successfully Updated!");
		} catch (Exception e) {
			System.out.println("UPDATION Method Failed :- " + e.getMessage());
		}
	}

	public void deleteStudentRecord() {
		try {
			SessionFactory sf = new Configuration().configure("com/Hibernate/App/hibernate.cfg.xml")
					.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction trx = ss.beginTransaction();
			String qry = "delete from Student_POJO where Student_RollNo=:x";
			Query Q1 = ss.createQuery(qry);
			Q1.setParameter("x", StudentDetails.S_RollNO);
			Q1.executeUpdate();

			trx.commit();
			ss.close();
			sf.close();
			System.out.println("Successfully Deleted!");
		} catch (Exception e) {
			System.out.println("DELETION Method Failed :- " + e.getMessage());
		}
	}

	public void SelectStudentById() {
		try {
			SessionFactory sf = new Configuration().configure("com/Hibernate/App/hibernate.cfg.xml")
					.buildSessionFactory();
			Session ss = sf.openSession();

			String qry = "from Student_POJO where Student_RollNo=:x";
			Query Q1 = ss.createQuery(qry);
			Q1.setParameter("x", StudentDetails.S_RollNO);
			List<Student_POJO> al = Q1.getResultList();
			System.out.println("_______________________________________");
			for (Student_POJO i : al) {
				System.out.println("Student Name :- " + i.getStudent_Name());
				System.out.println("Student Roll_No :- " + i.getStudent_RollNo());
				System.out.println("Student Class :- " + i.getStudent_Class());
				System.out.println("Student Section:- " + i.getStudent_Section());
				System.out.println("Resutls Fetched From :- " + i.getClass());
			}
			System.out.println("_______________________________________");
			ss.close();
			sf.close();
			System.out.println("Details Fetched Sucessfully!");
		} catch (Exception e) {
			System.out.println("SELECTION Method Failed :- " + e.getMessage());
		}
	}

	@Override
	public void SelectAllStudents() {
		try {
			System.out.println("--------SELECTION---------");
			SessionFactory sf = new Configuration().configure("com/Hibernate/App/hibernate.cfg.xml")
					.buildSessionFactory();
			Session ss = sf.openSession();

			String qry = "from Student_POJO";
			Query Q1 = ss.createQuery(qry);
			List<Student_POJO> al = Q1.getResultList();
			System.out.println("SELECTION METHOD INVOKED!!!");
			System.out.println("_______________________________________");

			for (Student_POJO i : al) {
				System.out.println();
				System.out.println(i);
				System.out.println();
			}

			System.out.println("_______________________________________");
			ss.close();
			sf.close();
			System.out.println("Details Fetched Sucessfully!");
		} catch (Exception e) {
			System.out.println("SELECTION Method Failed :- " + e.getMessage());
		}
	}

}
