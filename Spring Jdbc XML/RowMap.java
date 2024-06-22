package com.Spring_Jdbc_App;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMap implements RowMapper<Employee_POJO>{

	@Override
	public Employee_POJO mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee_POJO empj = new Employee_POJO();
		 empj.setEmpolyee_ID(rs.getInt(1));
		 empj.setEmployee_NAME(rs.getString(2));
		 empj.setEmployee_SALARY(rs.getInt(3));
		 empj.setEmployee_BRANCH(rs.getString(4));
		 empj.setIs_WORKING_NOW(rs.getString(5));
		return empj;
	}

}
