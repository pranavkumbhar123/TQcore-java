package com.throwkeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

	private int id;
	private int age;
	
	public Student()
	{
		
	}
	
	
	public Student(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {


		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a id");
		s.setId(sc.nextInt());
		
		
	
			System.out.println("Enter a age");
			int a=sc.nextInt();
			if(a<18)
			{
				throw new InputMismatchException("you ar not eligible");
			}
			else
			{
				throw new InputMismatchException("you are eligible");
			}
		
		
	}

}
