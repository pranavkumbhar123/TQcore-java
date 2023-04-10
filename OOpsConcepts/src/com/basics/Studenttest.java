package com.basics;

public class Studenttest {
	public static void main()
	{
		Student s=new Student();
		s.enterDetails(1, "pranav", 23, 20.0);
		s.displayDetails();
		char grade=s.calGrade();
		if(grade=='F')
			System.out.println("Fail");
		else
			System.out.println("Grade"+grade);
		
		Student s1 =new Student();
		s1.enterDetails(4,"pranav",23,20.0);
	s1.calGrade();
	s1.displayDetails();
	}
	

}
