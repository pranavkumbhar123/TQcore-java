package com.multiple;

public class Person implements Teacher,Student{
	
	private int id;
	private String name;
	
	public Person()
	{
		
	}
	public Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public void show() {

		System.out.println(id+" "+name);
		
	}
	public static void main(String args[])
	{
		Person p1= new Person(1,"pranav");
		p1.show();
	}
}
