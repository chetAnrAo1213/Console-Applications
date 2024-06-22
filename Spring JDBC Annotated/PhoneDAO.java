package com.Spring_Jdbc_Annoation.App;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PhoneDAO implements DmlMethods{

	private JdbcTemplate jdt;
	public JdbcTemplate getJdt() {
		return jdt;
	}

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}

	@Override
	public int insertPhone(PhonePOJO pj) 
	{
		String insertQuery="insert into PHONES values(?, ?, ?, ?, ?)";
		int insertResult =this.jdt.update(insertQuery,pj.getPhoneId(),pj.getPhoneBrand(),pj.getPhoneOS(),pj.getPhoneModel(),pj.getPhoneColor());
		if(insertResult>0)
			System.out.println("Insert Method Was Invoked! "+insertResult+" time At DAO");
		else
			System.out.println("Insert Method Was Failed!");
		return insertResult;
	}

	@Override
	public int updatePhone(PhonePOJO pj) {
		String updateQuery = "update Phones set PID = ?, pBrand = ?, pOS = ?, pModel = ?, pColor = ? where PID = ?";

		int updateResult =this.jdt.update(updateQuery,pj.getPhoneId(),pj.getPhoneBrand(),pj.getPhoneOS(),pj.getPhoneModel(),pj.getPhoneColor(),PhoneDetails.u_pid);
		if(updateResult>0)
			System.out.println("Update Method Was Invoked! "+updateResult+" time At DAO");
		else
			System.out.println("Update Method Was Failed!");
		return updateResult;
	}

	@Override
	public int deletePhone(PhonePOJO pj) {
		String deleteQuery="delete from phones where PID =?";
		int deleteResult =this.jdt.update(deleteQuery,pj.getPhoneId());
		if(deleteResult>0)
			System.out.println("Delete Method Was Invoked! "+deleteResult+" time At DAO");
		else
			System.out.println("Delete Method Was Failed!");
		return deleteResult;
	}

	@Override
	public int getAnPhone(PhonePOJO pj) {
		String selectQuery = "select * from phones where PID = ?";
		RowMapper<PhonePOJO> rm = new RowMap();
		pj=this.jdt.queryForObject(selectQuery, rm,pj.getPhoneId());
		if(pj!=null) 
		{
			System.out.println("Details Were Successfully Fetched!!!");
		    System.out.println("Phones Id:- "+pj.getPhoneId()+"\n"+
			                   "Phones Brand :- "+pj.getPhoneBrand()+"\n"+
		    					"Phones Os :- "+pj.getPhoneOS()+"\n"+
		    					"Phones Model :- "+pj.getPhoneModel()+"\n"+
		    					"Phones Color :-"+pj.getPhoneColor()+"\n"+
		    					"Java Class :-"+pj.getClass());
		    }
		else
			System.out.println("Reterving Details Were Failed!!!");

		return 0;
	}

	@Override
	public int selectAllPhone() {
		String SelectQuery ="select * from phones";
		List<PhonePOJO> li  = this.jdt.query(SelectQuery,new RowMap());
		for(PhonePOJO i:li)
			System.out.println(i);
		return 0;
	}
	
}
