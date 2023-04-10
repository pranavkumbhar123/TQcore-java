package com.polymorphism;

public class TypePromotionAmbiguity {
	static void display(int a, double b)
	{
		System.out.println("Method 1");
		System.out.println(a+b);
	}
	static void display(long l,float f)
	{
		System.out.println("Method 2");
		System.out.println(l+f);
	}
	public static void main(String args[])
	{
		display(4l,40f);
		//ambiguity
	}
	
}
