package com.Spring_Jdbc_Annoation.App;

import java.util.Scanner;



public class Main 
{
	public static void main(String[] args) 
	{
		PhoneDetails pd = new PhoneDetails();
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Method Number \n 1)Insertion  2)Updation \n 3)Deletion   4)Specific Select \n 5)SelectAll  6)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
					pd.addAnPhoneRecord();
				break;
				
				case 2: 
					pd.updateAnPhoneRecord();
				break;
				
				case 3:
					  	pd.deleteAnPhoneRecord();
				break;
				case 4:
					pd.getAnPhoneRecord();
				break;
				case 5:
					    pd.selectAllPhoneRecords();
				break;
				case 6:
						System.out.println("EXITED!!!");
						System.exit(0);
			}
		}

	}
}
