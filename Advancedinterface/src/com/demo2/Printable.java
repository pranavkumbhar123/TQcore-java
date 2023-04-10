package com.demo2;

public interface Printable {

	float pi=3.147f;
	void area();
	default void volume()
	{
		System.out.println("volume method");
		display();
	}
	static void show()
	{
		System.out.println("Geometry shapes interfaces");
		
	}
	//common method for all non  abstract methods
	private void display()
	{
		System.out.println("made by:pranav");
	}
}
