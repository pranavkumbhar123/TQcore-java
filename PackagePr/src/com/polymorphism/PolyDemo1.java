package com.polymorphism;

public class PolyDemo1 {
	void addition(int a,int b)
	{
		System.out.println("Method 1");
		System.out.println("sum:"+(a+b));
	}
	void addition(int a,int b,int c)
	{
		System.out.println("Method 2");
		System.out.println("sum:"+(a+b+c));
	}
	void addition(float a,float b)
	{
		System.out.println("Method float");
		System.out.println("sum:"+(a+b));
	}
	void addition(int a, float b)
	{
		System.out.println("Method float 1");
		System.out.println("sum:"+(a+b));
		
	}
	void addition(float a, int b)
	{
		System.out.println("Method float 2");
		System.out.println("sum:"+(a+b));
	}
	public static void main(String args[])
	{
		PolyDemo1 p1=new PolyDemo1();
		p1.addition(45,67,100);
		p1.addition(78f,7f);
		p1.addition(7,89f);
		
		//Early binding
	}
	

}
