package com.Jdbc.App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ItemDetails idt = new ItemDetails();
		ItemDAO ida = new ItemDAO();
		
		while(true)
		{
			System.out.println("Enter the Method Number \n 1)Insertion  2)Updation \n 3)Deletion   4)Specific Select \n 5)SelectAll  6)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
					idt.insertOperation();
				break;
				case 2:
					idt.updateOperation();
					break;
				case 3:
					idt.deleteOperation();
				break;
				case 4:
					idt.getStudent();
				break;
				case 5:
					ida.selectAllItems();
				break;
				case 6:
						System.out.println("EXITED!!!");
						System.exit(0);
			}
		}


	}
}
