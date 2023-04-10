package com.basics;

import java.util.Scanner;

public class CarUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car price:");
		int cprice = sc.nextInt();
		System.out.println("Enter car brand name:");
		String brandname= sc.next();
		System.out.println("Enter a model number:");
		int modelnumber = sc.nextInt();
		System.out.println("Enter a car color:");
		String color= sc.next();
		Car c2 = new Car();
		c2.enterDetails(cprice,brandname,modelnumber,color);
		c2.displayDetails();
		Car c1 = new Car();
		c1.enterDetails(cprice, brandname, modelnumber, color);
		c1.displayDetails();
		

	}

}
