package com.basics;

public class Student {
	// instance  variable
	int sid;
	String name;
	int age;
	double marks;
	
	// method
	void enterDetails(int id,String n, int a, double m)
	{
		sid=id;
		name=n;
		age=a;
		marks=m;
	}
	void displayDetails()
	{
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
		System.out.println("Marks:"+marks);
	}
	
	char calGrade()
	{
		if(marks>=80)
			return 'A';
		else
			if(marks>=60)
				return'B';
			else
				if(marks>=40)
					return'C';
				else 
					return'F';
							
	}
	
	public static void main(String args[])
	{
		Student s1=new Student();
		//s1.displayDetails();
		
		Student s2=new Student();
		s2.enterDetails(1, "pranav", 23, 88.80);
		s2.displayDetails();
		s1.enterDetails(2, "sunny", 23, 88.90);
		s1.displayDetails();
	}
}
