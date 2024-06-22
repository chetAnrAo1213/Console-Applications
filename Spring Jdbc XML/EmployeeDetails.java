package com.Spring_Jdbc_App;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDetails {

	ApplicationContext cnxt = new ClassPathXmlApplicationContext("com/Spring_Jdbc_App/Dml.cfg.xml");
	Employee_DAO emp1 = cnxt.getBean(Employee_DAO.class);
	Employee_POJO empj = new Employee_POJO();

	int e_id, e_sal;
	static int e_upi;
	String e_name, e_bran, e_Is_Working;

	public void insertEmployee() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Insertion---");
			System.out.println("1.Enter Employee ID :-");
			e_id = sc.nextInt();

			System.out.println("2.Enter Employee NAME :-");
			e_name = sc.next();

			System.out.println("3.Enter Employee SALARY :-");
			e_sal = sc.nextInt();

			System.out.println("4.Enter Employee BRANCH :-");
			e_bran = sc.next();

			System.out.println("5.Enter Employee IS_WORKING :-");
			e_Is_Working = sc.next();

			empj.setEmpolyee_ID(e_id);
			empj.setEmployee_NAME(e_name);
			empj.setEmployee_SALARY(e_sal);
			empj.setEmployee_BRANCH(e_bran);
			empj.setIs_WORKING_NOW(e_Is_Working);
			int operation = emp1.insertEmployeeDetails(empj);
			System.out.println("Employee Inserted!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			insertEmployee();
		}
	}

	public void deleteEmployee() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Deletion---");
			System.out.println("1.Enter Employee ID :-");
			int e_id = sc.nextInt();

			empj.setEmpolyee_ID(e_id);

			int operation = emp1.deleteEmployeeDetails(empj);
			System.out.println("Employee Deleted!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
			
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			deleteEmployee();
		}
	}

	public void updateEmployee() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Updation---");
			System.out.println("Enter Employee ID :-");
			e_upi = sc.nextInt();

			System.out.println("1.Enter Updated Employee ID :-");
			int e_id = sc.nextInt();

			System.out.println("2.Enter Updated Employee NAME :-");
			String e_name = sc.next();

			System.out.println("3.Enter Updated Employee SALARY :-");
			int e_sal = sc.nextInt();

			System.out.println("4.Enter Updated Employee BRANCH :-");
			String e_bran = sc.next();

			System.out.println("5.Enter Updated Employee IS_WORKING :-");
			String e_Is_Working = sc.next();

			empj.setEmpolyee_ID(e_id);
			empj.setEmployee_NAME(e_name);
			empj.setEmployee_SALARY(e_sal);
			empj.setEmployee_BRANCH(e_bran);
			empj.setIs_WORKING_NOW(e_Is_Working);

			int operation = emp1.updateEmployeeDetails(empj);
			System.out.println("Employee Updated!! ");
			System.out.println("Data Base Was Interacted " + operation + " times ");
			System.out.println();
		
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			deleteEmployee();
		}
	}
	
	public void selectSpecificEmployeeDetails() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Selection---");
			System.out.println("1.Enter Employee ID :-");
			int e_id = sc.nextInt();

			empj.setEmpolyee_ID(e_id);

			emp1.selectSpecificEmployeeDetails(empj);
			System.out.println("Employee Details Fetched!! ");
			
			System.out.println();
		
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			selectSpecificEmployeeDetails();
		}
	}
	
	public void selectAllEmployeeDetails() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("---Selection---");

			emp1.selectAllEmployeeDetails();
			System.out.println("Complete Employee Details Fetched!! ");
			
			System.out.println();
		
		} catch (Exception e) {
			System.err.println("Looks like you made an mistake Try Again!!! \n ErrorMessage:- " + e);
			selectAllEmployeeDetails();
		}
	}
}
