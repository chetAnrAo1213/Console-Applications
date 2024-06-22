package com.Hibernate_Annotated.App;

public interface DmlMethods {

	public void insertCustomer(CustomerPOJO cpj);
	
	
	public void updateCustomer(CustomerPOJO cpj);
	
	public void deleteCustomer(CustomerPOJO cpj);
	
	public void getCustomer(CustomerPOJO cpj);
	
	public void selectAllCustomers();
	
}
