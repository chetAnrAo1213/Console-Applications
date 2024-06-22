package com.Hibernate.App;

import java.util.Scanner;

public class StudentDetails {

	Scanner sc = new Scanner(System.in);
	Student_DAO sda = new Student_DAO();
	static String S_Name;
	static String S_Class;
	static String S_RollNO;
	static String S_Section;
	static String newUpdatedRollNo;

	public void insert() {
		try
		{
			System.out.println("--------INSERTION---------");
			System.out.println("Enter Student Name");
			S_Name = sc.nextLine();

			System.out.println("Enter Student RollNo");
			S_RollNO = sc.nextLine();

			System.out.println("Enter Student Class");
			S_Class = sc.nextLine();

			System.out.println("Enter Student Section");
			S_Section = sc.nextLine();
			sda.insertStudentRecord();

		}
		catch(Exception e)
		{
			System.out.println("Method Failed :- " + e);
			System.out.println("Try Again");
			insert();
		}
		
	}

	public void update() {
		try {
			System.out.println("--------UPDATION---------");
			System.out.println("Enter Student RollNo for Updation:- ");
			newUpdatedRollNo = sc.nextLine();

			System.out.println("Enter Updated Student Name");
			S_Name = sc.nextLine();

			System.out.println("Enter Updated Student RollNo");
			S_RollNO = sc.nextLine();

			System.out.println("Enter Updated Student Class");
			S_Class = sc.nextLine();

			System.out.println("Enter Updated Student Section");
			S_Section = sc.nextLine();
			sda.updateStudentRecord();
		} catch (Exception e) {
			System.err.println("Method Failed :- " + e);
			System.out.println("Try Again");
			update();
		}
	}

	public void delete() {
		try {
			System.out.println("--------DELETION---------");
			System.out.println("Enter Student RollNo for Deletion");
			S_RollNO = sc.nextLine();

			sda.deleteStudentRecord();
		} catch (Exception e) {
			System.out.println("Method Failed :- " + e);
			System.out.println("Try Again");
			delete();
		}
	}

	public void SelectById() {
		try {
			System.out.println("--------SELECTION---------");
			System.out.println("Enter Student RollNo for Selecting his/her Records:-");
			S_RollNO = sc.nextLine();
			sda.SelectStudentById();
		} catch (Exception e) {
			System.out.println("Method Failed :- " + e);
			System.out.println("Try Again");
			SelectById();
		}
	}

}