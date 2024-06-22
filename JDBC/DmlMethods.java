package com.Jdbc.App;

public interface DmlMethods {
	
	public int insertItem(ItemPOJO ip);
	
	public int deleteItem(ItemPOJO ip);
	
	public int updateItem(ItemPOJO ip);
	
	public int getItem(ItemPOJO ip);
	
	public void selectAllItems();
	
	
}
