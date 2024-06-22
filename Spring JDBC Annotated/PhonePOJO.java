package com.Spring_Jdbc_Annoation.App;


import org.springframework.stereotype.Component;

@Component("Phone")
public class PhonePOJO {

	private int phoneId;
	private String phoneBrand;
	private String phoneOS;
	private String phoneModel;
	private String phoneColor;

	public PhonePOJO() 
	{
		super();
	}


	public PhonePOJO(int phoneId, String phoneBrand, String phoneOS, String phoneModel, String phoneColor) 
	{
		super();
		this.phoneId = phoneId;
		this.phoneBrand = phoneBrand;
		this.phoneOS = phoneOS;
		this.phoneModel = phoneModel;
		this.phoneColor = phoneColor;
	}


	
	public void setPhoneId(int phoneId) 
	{
		this.phoneId = phoneId;
	}
	
	
	public void setPhoneBrand(String phoneBrand) 
	{
		this.phoneBrand = phoneBrand;
	}

	
	public void setPhoneOS(String phoneOS) 
	{
		this.phoneOS = phoneOS;
	}

	
	public void setPhoneModel(String phoneModel) 
	{
		this.phoneModel = phoneModel;
	}
	
	
	public void setPhoneColor(String phoneColor) 
	{
		this.phoneColor = phoneColor;
	}


	public int getPhoneId() {
		return phoneId;
	}


	public String getPhoneBrand() {
		return phoneBrand;
	}


	public String getPhoneOS() {
		return phoneOS;
	}


	public String getPhoneModel() {
		return phoneModel;
	}


	public String getPhoneColor() {
		return phoneColor;
	}


	@Override
	public String toString() {
		return "PhonePOJO [phoneId=" + phoneId + ", phoneBrand=" + phoneBrand + ", phoneOS=" + phoneOS + ", phoneModel="
				+ phoneModel + ", phoneColor=" + phoneColor + "]";
	}

	
}
