package com.Spring_Jdbc_App;

public interface DmlMethods {

	public int insertEmployeeDetails(Employee_POJO emp);
	
	public int deleteEmployeeDetails(Employee_POJO emp);
	
	public int updateEmployeeDetails(Employee_POJO emp);
	
	public int selectSpecificEmployeeDetails(Employee_POJO emp);
	
	public int selectAllEmployeeDetails();
	
}
