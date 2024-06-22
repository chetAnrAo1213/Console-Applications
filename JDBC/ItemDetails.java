package com.Jdbc.App;

import java.util.Scanner;

public class ItemDetails {

	private int itemID;
	private String itemName;
	private int itemPrice;
	private String itemType;
	private String Quantity;
	static int updated_Id;
	static int select_Id;

	ItemDAO ida = new ItemDAO();
	ItemPOJO ipj = new ItemPOJO();

	public void insertOperation() {
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("_______Insertion________");
		System.out.println("1. Enter the Item-ID :-");
		itemID= sc.nextInt();
		sc.nextLine();
		System.out.println("2. Enter the Item-Name	:- ");
		itemName = sc.nextLine();

		System.out.println("3. Enter the Item-Price :-");
		itemPrice = sc.nextInt();

		sc.nextLine();
		System.out.println("4. Enter the Item-Type :-");
		itemType = sc.nextLine();

		System.out.println("5. Enter the Item-Quantity :-");
		Quantity = sc.nextLine();

		ipj.setItemID(itemID);
		ipj.setItemName(itemName);
		ipj.setItemPrice(itemPrice);
		ipj.setItemType(itemType);
		ipj.setQuantity(Quantity);
		int x = ida.insertItem(ipj);
		if (x > 0)
			System.out.println("Data Base Interacted !!!");
		else
			System.out.println("Insertion Method Failed !!!");
		}
		catch(Exception e)
		{
			System.err.println("Error Occured :- "+e);
			System.err.println("Try Again!");
			insertOperation();
		}
	}
	

	public void deleteOperation() {
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("_______Deletion________");
		System.out.println("1. Enter the Item-ID To Delete:-");
		itemID= sc.nextInt();
		
		ipj.setItemID(itemID);
		int x = ida.deleteItem(ipj);
		
		if (x>0)
			System.out.println("Data Base Interacted !!!");
		else
			System.out.println("Deletion Method Failed !!!");
		}
		catch(Exception e)
		{
			System.err.println("Error Occured :- "+e);
			System.err.println("Try Again!");
			deleteOperation();
		}
	}
	
	public void updateOperation()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("_______Updation________");
			System.out.println("Enter the User-Id for Updation :- ");
			updated_Id=sc.nextInt();
			System.out.println("1. Enter the updated Item-ID :-");
			itemID= sc.nextInt();
			sc.nextLine();
			System.out.println("2. Enter the updated Item-Name	:- ");
			itemName = sc.nextLine();

			System.out.println("3. Enter the updated Item-Price :-");
			itemPrice = sc.nextInt();

			sc.nextLine();
			System.out.println("4. Enter the updated Item-Type :-");
			itemType = sc.nextLine();

			System.out.println("5. Enter the updated Item-Quantity :-");
			Quantity = sc.nextLine();

			ipj.setItemID(itemID);
			ipj.setItemName(itemName);
			ipj.setItemPrice(itemPrice);
			ipj.setItemType(itemType);
			ipj.setQuantity(Quantity);
			int x = ida.updateItem(ipj);
			if (x > 0)
				System.out.println("Data Base Interacted !!!");
			else
				System.out.println("Updation Method Failed !!!");
		}
		catch(Exception e)
		{
			System.err.println("Error Occured :- "+e);
			System.err.println("Try Again!");
			updateOperation();
		}
	}
	
	public int getStudent()
	{
		int x=0;
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("_______Selection________");
		System.out.println("1. Enter the Item-ID To GET:-");
		select_Id= sc.nextInt();
		
		ipj.setItemID(itemID);
		x = ida.getItem(ipj);
		
		if (x>0)
			System.out.println("Data Base Interacted !!!");
		else
			System.out.println("Selection Method Failed !!!");
		}
		catch(Exception e)
		{
			System.err.println("Error Occured :- "+e);
			System.err.println("Try Again!");
			getStudent();
		}
		return x;
	}
}
