package com.basics;

public class Car {

	int cprice;
	String brandname;
	int modelnumber;
	String color;
	
	void enterDetails(int p,String n,int m,String c)
	{
		cprice = p;
		brandname = n;
		modelnumber = m;
		color = c;
	}
	void displayDetails()
	{
		System.out.println("car price:"+cprice);
		System.out.println("Brand name of car:"+brandname);
		System.out.println("car model number:"+modelnumber);
		System.out.println("color of car:"+color);
	}
	
	public static void main(String args[])
	{
		Car c1= new Car();
		c1.displayDetails();
		
		Car c2= new Car();
		c2.enterDetails(1500000, "TATA", 1, "white");
		c2.displayDetails();
	}
	
}
