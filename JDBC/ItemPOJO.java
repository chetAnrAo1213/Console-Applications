package com.Jdbc.App;

public class ItemPOJO {

	private int itemID;
	private String itemName;
	private int itemPrice;
	private String itemType;
	private String Quantity;
	
	
	public ItemPOJO() {
		super();
	}


	public ItemPOJO(int itemID, String itemName, int itemPrice, String itemType, String quantity) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemType = itemType;
		Quantity = quantity;
	}


	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getQuantity() {
		return Quantity;
	}


	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	
}