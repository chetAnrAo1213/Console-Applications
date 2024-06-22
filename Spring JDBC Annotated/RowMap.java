package com.Spring_Jdbc_Annoation.App;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMap implements RowMapper<PhonePOJO>{

	@Override
	public PhonePOJO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PhonePOJO phj = new PhonePOJO();
		 phj.setPhoneId(rs.getInt(1));
		 phj.setPhoneBrand(rs.getString(2));
		 phj.setPhoneOS(rs.getString(3));
		 phj.setPhoneModel(rs.getString(4));
		 phj.setPhoneColor(rs.getString(5));
		return phj;
	}

}
