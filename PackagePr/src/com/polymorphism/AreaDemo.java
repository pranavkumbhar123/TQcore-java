package com.polymorphism;

public class AreaDemo {
		

	static void area(int side)
	{
		System.out.println("area of square"+( side* side));
	}
	static void area(int length, int breadth)
	{
		System.out.println("area of rectangle"+(length*breadth));
	}
	static void area(float radius)
	{
		System.out.println("Area of circle:"+(3.146*(radius*radius)));
	}
	static void area(int base,float height)
	{
		System.out.println("Area of triangle:"+(0.5*base*height));
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		area(8,5f);
	}

}
