package com.innerclass;

class Outer
{
	private static int data=10;
	
	void display()
	{
		class LocalInner
		{
			private int value=20;
			
			static void show1()
			{
				System.out.println(data);
			}
		
			void show()
			{
				System.out.println(data);
				System.out.println(value);
			}
		}
		
		LocalInner l1=new LocalInner();
		l1.show();
		
		LocalInner.show1();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {


		

	}

}
