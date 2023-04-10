package com.thisdemo;

public class ThisDemo2 {
	int a;
	int b;
	String name;
	
	ThisDemo2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	ThisDemo2()
	{
		this(90,100);
		name ="Unknown";
	}
	void addition(ThisDemo2 obj)
	{
		this.a=this.a+obj.a;
		this.b=this.b+obj.b;
	}
	//local variable
	void display()
	{
		int a=9000;
		System.out.println("Local a:"+a);
		System.out.println("Instance a:"+this.a);
		this.addition(this);
		
		//addition(this)
	}
	ThisDemo2 displayValues()
	{
		a=a+10;
		b=b+10;
		return this;
	}
	public static void main(String args[])
	{
		ThisDemo2 obj1=new ThisDemo2(5,6);
		ThisDemo2 obj2=new ThisDemo2(9,9);
		
		System.out.println("Before:"+obj1.a+" "+obj1.b);
		obj1.addition(obj2);
		
		System.out.println("After:"+obj1.a+" "+obj1.b);
		ThisDemo2 t=new ThisDemo2();
		t.display();
		
		System.out.println("T:"+t.a+" "+t.b);
		obj1=obj1.displayValues();
		System.out.println("After:"+obj1.a+" "+obj1.b);
		
	}
}
