package com.Hibernate_Annotated.App;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Service")
public class CustomerPOJO 
{

	@Id
	@Column(name="Customer_Id")
	int custId;
	
	@Column(name="Customer_Name")
	String custName;
	
	@Column(name="Customer_Phone_Number")
	String custPhone;
	
	@Column(name="Customer_Mail_Id")
	String custEmail;
	
	@Column(name="Customer_Gender")
	String custGender;

	public CustomerPOJO() 
	{
		super();
	}

	public CustomerPOJO(int custId, String custName, String custPhone, String custEmail, String custGender) 
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
		this.custGender = custGender;
	}

	public int getCustId() 
	{
		return custId;
	}

	public void setCustId(int custId) 
	{
		this.custId = custId;
	}

	public String getCustName() 
	{
		return custName;
	}

	public void setCustName(String custName) 
	{
		this.custName = custName;
	}

	public String getCustPhone() 
	{
		return custPhone;
	}

	public void setCustPhone(String custPhone) 
	{
		this.custPhone = custPhone;
	}

	public String getCustEmail() 
	{
		return custEmail;
	}

	public void setCustEmail(String custEmail) 
	{
		this.custEmail = custEmail;
	}

	public String getCustGender() 
	{
		return custGender;
	}


	public void setCustGender(String custGender) 
	{
		this.custGender = custGender;
	}
	
	
	@Override
	public String toString() 
	{
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhone=" + custPhone + ", custEmail="
				+ custEmail + ", custGender=" + custGender + "]";
	}

}
