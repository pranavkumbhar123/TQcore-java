package com.constructor;

public class Item {
	private int itemId;
	private String itemName;
	private float price;
	private String category;
	
	// default constructor
	public Item()
	{
		System.out.println("in default constructor");
	}
	//parameterized constructor
	
	public Item(int itemId,String itemName,float price, String category)
	{
		System.out.println("in para constructor");
		this.itemId=itemId;
		this.itemName=itemName;
		this.price =price;
		this.category =category;
	}
	public String toString()
	{
		return "Item Details: "+itemId+" "+itemName+" "+" Price:"+price+" Category:"+category;
	}
}
