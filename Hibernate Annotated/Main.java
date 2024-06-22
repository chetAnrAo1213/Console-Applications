package com.Hibernate_Annotated.App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerDetails cd = new CustomerDetails();
		CustomerDAO cda = new CustomerDAO();
		
		while (true) {
			System.out.println();
			System.out.println("Enter the Method Number \n 1)Insertion  2)Updation \n 3)Deletion   4)Specific Select \n 5)SelectAll  6)Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				cd.addCustomer();
				break;

			case 2:
				cd.updateCustomer();
				break;

			case 3:
				cd.deleteCustomer();
				break;
			case 4:
				cd.getCustomer();
				break;
			case 5:
				cda.selectAllCustomers();
				break;
			case 6:
				System.out.println("EXITED!!!");
				System.exit(0);
			}
		}

	}

}
