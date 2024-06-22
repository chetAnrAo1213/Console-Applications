package com.Spring_Jdbc_App;

public class Employee_POJO {

	private int empolyee_ID;
	private String employee_NAME;
	private int employee_SALARY;
	private String employee_BRANCH;
	private String is_WORKING_NOW;
	
    /*   DEFAULT CONSTRUCTOR     */ 
	public Employee_POJO() 
	{
		super();
	}

	/*   		PARAMETERIZED CONSTRUCTOR     			*/ 
	public Employee_POJO(int empolyee_ID, String employee_NAME, int employee_SALARY, String employee_BRANCH,
			String is_WORKING_NOW) {
		super();
		this.empolyee_ID = empolyee_ID;
		this.employee_NAME = employee_NAME;
		this.employee_SALARY = employee_SALARY;
		this.employee_BRANCH = employee_BRANCH;
		this.is_WORKING_NOW = is_WORKING_NOW;
	}

	/*			GETTERS & SETTERS	 	*/
	public int getEmpolyee_ID() {
		return empolyee_ID;
	}

	public void setEmpolyee_ID(int empolyee_ID) {
		this.empolyee_ID = empolyee_ID;
	}

	public String getEmployee_NAME() {
		return employee_NAME;
	}

	public void setEmployee_NAME(String employee_NAME) {
		this.employee_NAME = employee_NAME;
	}

	public int getEmployee_SALARY() {
		return employee_SALARY;
	}

	public void setEmployee_SALARY(int employee_SALARY) {
		this.employee_SALARY = employee_SALARY;
	}

	public String getEmployee_BRANCH() {
		return employee_BRANCH;
	}

	public void setEmployee_BRANCH(String employee_BRANCH) {
		this.employee_BRANCH = employee_BRANCH;
	}

	public String getIs_WORKING_NOW() {
		return is_WORKING_NOW;
	}

	public void setIs_WORKING_NOW(String is_WORKING_NOW) {
		this.is_WORKING_NOW = is_WORKING_NOW;
	}

	@Override
	public String toString() {
		return "Employee_POJO [empolyee_ID=" + empolyee_ID + ", employee_NAME=" + employee_NAME + ", employee_SALARY="
				+ employee_SALARY + ", employee_BRANCH=" + employee_BRANCH + ", is_WORKING_NOW=" + is_WORKING_NOW + "]";
	}
	
	
	

	
	
}
