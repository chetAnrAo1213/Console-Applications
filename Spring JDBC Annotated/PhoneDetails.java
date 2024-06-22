package com.Spring_Jdbc_Annoation.App;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneDetails {

	AnnotationConfigApplicationContext cnxt = new AnnotationConfigApplicationContext(SpringConfigProps.class);
	PhoneDAO pd = cnxt.getBean(PhoneDAO.class);
	PhonePOJO phj = new PhonePOJO();
	
	int p_id;
	String p_brand,p_OS,p_model,p_color;
	static int u_pid;
	
	public void addAnPhoneRecord()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("---Insertion---");
			System.out.println("1.Enter Phone ID :-");
			p_id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("2.Enter Phone MODEL :-");
			p_model = sc.nextLine();

			System.out.println("3.Enter Phone Brand :-");
			p_brand = sc.nextLine();

			System.out.println("4.Enter Phone OS :-");
			p_OS = sc.nextLine();

			System.out.println("5.Enter Phone Color :-");
			p_color = sc.nextLine();

			phj.setPhoneId(p_id);
			phj.setPhoneModel(p_model);
			phj.setPhoneBrand(p_brand);
			phj.setPhoneOS(p_OS);
			phj.setPhoneColor(p_color);
			
			int operation=pd.insertPhone(phj);
			System.out.println("Details Inserted!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			addAnPhoneRecord();
		}
	}
	
	public void updateAnPhoneRecord()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Updation---");
			System.out.println("Enter Phone ID For Updation:-");
			u_pid = sc.nextInt();

			System.out.println("1.Enter Phone ID :-");
			p_id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("2.Enter Phone MODEL :-");
			p_model = sc.nextLine();

			System.out.println("3.Enter Phone Brand :-");
			p_brand = sc.nextLine();

			System.out.println("4.Enter Phone OS :-");
			p_OS = sc.nextLine();

			System.out.println("5.Enter Phone Color :-");
			p_color = sc.nextLine();

			phj.setPhoneId(p_id);
			phj.setPhoneModel(p_model);
			phj.setPhoneBrand(p_brand);
			phj.setPhoneOS(p_OS);
			phj.setPhoneColor(p_color);
			

			int operation = pd.updatePhone(phj);
			System.out.println("Details Updated!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
		
		} 
		catch (Exception e) 
		{
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			updateAnPhoneRecord();
		}
	}
	
	public void deleteAnPhoneRecord()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Deletion---");
			System.out.println("1.Enter Employee ID :-");
			 p_id = sc.nextInt();

			 phj.setPhoneId(p_id);

			int operation = pd.deletePhone(phj);
			System.out.println("Employee Deleted!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			deleteAnPhoneRecord();
		}
	}
	
	public void getAnPhoneRecord()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Selection---");
			System.out.println("1.Enter Employee ID :-");
			int p_id = sc.nextInt();

			 phj.setPhoneId(p_id);
			pd.getAnPhone(phj);
			System.out.println("Employee Details Fetched!! ");
			
			System.out.println();
		
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			getAnPhoneRecord();
		}
	}
	
	public void selectAllPhoneRecords()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Selection---");

			pd.selectAllPhone();
			System.out.println("Complete Phone Records Details Fetched!! ");
			
			System.out.println();
		
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			selectAllPhoneRecords();
		}
	}
}
