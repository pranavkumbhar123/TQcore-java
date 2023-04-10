package com.diamond;
interface Student{
	void show();
	default void display()
	{
		System.out.println("i am student");
	}
}
interface Teacher
{
	void show();
	default void display()
	{
		System.out.println("i am teacher");
	}
	}



public class DiamondDemo implements Student , Teacher {
	public void display()
	{
		Student.super.display();
		Teacher.super.display();
	}

	@Override
	public void show() {

		System.out.println("i am in diamond problems");
		
	}
	
	public static void main(String args[])
	{
		DiamondDemo d1= new DiamondDemo();
		d1.show();
		d1.display();
		
	}

}
