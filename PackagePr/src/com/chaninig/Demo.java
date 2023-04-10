package com.chaninig;

class Demo {
	private int a;
	private int b;
	private int c;
	
	Demo()
	{
		System.out.println("Default");
		a=90;
		b=34;
		c=44;
		System.out.println(a+" "+b+" "+c);
	}
		Demo(int a)
		{
			this();
			System.out.println("const 1");
			this.a=a;
			this.b=b;
			
		}
	Demo(int a,int b,int c)
	{
		System.out.println("Main");
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public String toString()
	{
		return a+" "+b+" "+c;
		}
	public class ConstructorChainingDemo{
		public static void main(String args[])
		{
			Demo d1=new Demo(100,1000,900);
			System.out.println(d1);
		}
	}
}
