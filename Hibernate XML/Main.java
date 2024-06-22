package com.Hibernate.App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		Student_DAO sda = new Student_DAO();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the Method Number \n 1)Insertion  2)Updation \n 3)Deletion   4)Specific Select \n 5)SelectAll  6)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
					sd.insert();
				break;
				
				case 2: 
					sd.update();
				break;
				
				case 3:
					sd.delete();
				break;
				case 4:
					sd.SelectById();
				break;
				case 5:
					sda.SelectAllStudents();
				break;
				case 6:
						System.out.println("EXITED!!!");
						System.exit(0);
			}
		}

		
	}
}
