package com.Spring_Jdbc_App;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class Employee_DAO implements DmlMethods{
	
	private JdbcTemplate jdt;
	public JdbcTemplate getJdt() {
		return jdt;
	}

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}
	@Override
	public int insertEmployeeDetails(Employee_POJO emp) {
		
		String insertQuery="insert into EMPLOYEE values(?, ?, ?, ?, ?)";
		int insertResult =this.jdt.update(insertQuery,emp.getEmpolyee_ID(),emp.getEmployee_NAME(),emp.getEmployee_SALARY(),emp.getEmployee_BRANCH(),emp.getIs_WORKING_NOW());
		if(insertResult>0)
			System.out.println("Insert Method Was Invoked! "+insertResult+" time At DAO");
		else
			System.out.println("Insert Method Was Failed!");
		return insertResult;
	}

	@Override
	public int deleteEmployeeDetails(Employee_POJO emp) {
		String deleteQuery="delete from EMPLOYEE where E_Id =?";
		int deleteResult =this.jdt.update(deleteQuery,emp.getEmpolyee_ID());
		if(deleteResult>0)
			System.out.println("Delete Method Was Invoked! "+deleteResult+" time At DAO");
		else
			System.out.println("Delete Method Was Failed!");
		return deleteResult;
	}
	
	@Override
	public int updateEmployeeDetails(Employee_POJO emp) {
		
		String updateQuery = "update EMPLOYEE set E_Id = ?, E_Name = ?, E_SAL = ?, E_Branch = ?, E_WORKING = ? where E_Id = ?";

		int updateResult =this.jdt.update(updateQuery,emp.getEmpolyee_ID(),emp.getEmployee_NAME(),emp.getEmployee_SALARY(),emp.getEmployee_BRANCH(),emp.getIs_WORKING_NOW(),EmployeeDetails.e_upi);
		if(updateResult>0)
			System.out.println("Update Method Was Invoked! "+updateResult+" time At DAO");
		else
			System.out.println("Update Method Was Failed!");
		return updateResult;
	}
	
	@Override
	public int selectSpecificEmployeeDetails(Employee_POJO emp) {
	
		String selectQuery = "select * from employee where E_Id = ?";

		RowMapper<Employee_POJO> rowMap = new RowMap();
		emp= this.jdt.queryForObject(selectQuery,rowMap,emp.getEmpolyee_ID());
		if(emp!=null) 
		{
			System.out.println("Details Were Successfully Fetched!!!");
		    System.out.println("Employee Id:- "+emp.getEmpolyee_ID()+"\n"+
			                   "Employee Name :- "+emp.getEmployee_NAME()+"\n"+
		    					"Employee Salary :- "+emp.getEmployee_SALARY()+"\n"+
		    					"Employee Branch :- "+emp.getEmployee_BRANCH()+"\n"+
		    					"Employee Is_Working :-"+emp.getIs_WORKING_NOW()+"\n"+
		    					"Java Class :-"+emp.getClass());
		    }
		else
			System.out.println("Reterving Details Were Failed!!!");
		return 0;
	}
	
	@Override
	public int selectAllEmployeeDetails() {
		String selectQuery = "select * from employee ";
		
		List<Employee_POJO> al= this.jdt.query(selectQuery,new RowMap());
		for(Employee_POJO i:al)
			System.out.println(i);

		return 0;
	}

	

	
}
