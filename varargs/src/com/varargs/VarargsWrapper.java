package com.varargs;

public class VarargsWrapper {

	public void display(Object...s)
	{
		System.out.println("in Int");
		for(Object st:s)
		{
			System.out.println(st);
		}
	}
	public void display(Number...s)
	{
		System.out.println("in Number");
		for(Number st:s)
		{
			System.out.println(st);
		}
	}
	public static void main(String[] args) {
		VarargsWrapper w1=new VarargsWrapper();
		w1.display();
		

	}

}
