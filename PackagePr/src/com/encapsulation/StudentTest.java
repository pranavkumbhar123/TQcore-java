package com.encapsulation;

import java.util.Scanner;

public class StudentTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		s1.setId(101);
		s1.setName("pranav");
		s1.setAge(21);		

		
		
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
		
		Student s2=new Student();
		System.out.println("enter id");
		s2.setId(sc.nextInt());
		
		System.out.println("enter Name");
		s2.setName(sc.next());
		
		System.out.println("enter age:");
		s2.setAge(sc.nextInt());
		
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getAge());
	}

}
