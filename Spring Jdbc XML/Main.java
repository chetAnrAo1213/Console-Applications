package com.Spring_Jdbc_App;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		EmployeeDetails emp = new EmployeeDetails();
		while(true)
		{
			System.out.println("Enter the Method Number \n 1)Insertion  2)Updation \n 3)Deletion   4)Specific Select \n 5)SelectAll  6)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
					    emp.insertEmployee();
				break;
				
				case 2: 
					    emp.updateEmployee();
				break;
				
				case 3:
					  	emp.deleteEmployee();
				break;
				case 4:
					    emp.selectSpecificEmployeeDetails();
				break;
				case 5:
					    emp.selectAllEmployeeDetails();
				break;
				case 6:
						System.out.println("EXITED!!!");
						System.exit(0);
			}
		}

	}
}
