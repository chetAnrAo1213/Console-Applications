package com.Hibernate_Annotated.App;

import java.util.Scanner;

public class CustomerDetails {
	
	int c_id;
	String c_name;
	String c_phn;
	String c_email;
	String c_gender;
	static int c_upid;
	CustomerDAO cda = new CustomerDAO();
	CustomerPOJO cpj = new CustomerPOJO();
	
	public void addCustomer()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("____________Insertion________________");
			System.out.println("1.Enter Customer ID :-");
			c_id = sc.nextInt();

			sc.nextLine();
			System.out.println("2.Enter Customer NAME :-");
			c_name = sc.nextLine();

			System.out.println("3.Enter Customer PHONE:-");
			c_phn = sc.nextLine();

			System.out.println("4.Enter Customer MAIL:-");
			c_email= sc.nextLine();

			System.out.println("5.Enter Customer GENDER:-");
			c_gender = sc.nextLine();
			
			cpj.setCustId(c_id);
			cpj.setCustName(c_name);
			cpj.setCustPhone(c_phn);
			cpj.setCustEmail(c_email);
			cpj.setCustGender(c_gender);
			
			cda.insertCustomer(cpj);
			System.out.println("Inserted SuccessFully!!!");
		} 
		catch (Exception e) 
		{
			System.err.println("Insertion Failed!! :- "+e);
			System.err.println("Try Again");
			addCustomer();
		}
	}
	
	public void updateCustomer()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("________Updation___________");
			System.out.println("Enter Customer ID :-");
	
			c_upid = sc.nextInt();

			System.out.println("1.Enter Updated Customer ID :-");
			 c_id = sc.nextInt();
			 sc.nextLine();
			System.out.println("2.Enter Updated Customer NAME :-");
			c_name = sc.nextLine();

			System.out.println("3.Enter Updated Customer PHONE :-");
			c_phn = sc.nextLine();

			System.out.println("4.Enter Updated Customer EMAIL ID :-");
			c_email = sc.nextLine();

			System.out.println("5.Enter Updated Customer GENDER:-");
			c_gender = sc.nextLine();
		
			
			cpj.setCustId(c_id);
			cpj.setCustName(c_name);
			cpj.setCustPhone(c_phn);
			cpj.setCustEmail(c_email);
			cpj.setCustGender(c_gender);
			
			cda.updateCustomer(cpj);
			System.out.println("Updated SuccessFully!!!");
		} 
		catch (Exception e) 
		{
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			updateCustomer();
		}
	}
	
	public void deleteCustomer()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("_________Deletion__________");
			System.out.println("Enter Customer ID For Deletion :-");
			 c_id = sc.nextInt();
			 
			 cpj.setCustId(c_id);
			 cda.deleteCustomer(cpj);
				System.out.println("Deleted SuccessFully!!!");
		} 
		catch(Exception e) 
		{
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			deleteCustomer();
		}
	}
	
	public void getCustomer()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("_________SELECTION__________");
			System.out.println("Enter Customer ID For SELECTION :-");
			 c_id = sc.nextInt();
			 
			 cpj.setCustId(c_id);
			 cda.getCustomer(cpj);
				System.out.println("Selected SuccessFully!!!");
		} 
		catch(Exception e) 
		{
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			getCustomer();
		}
	}
}
