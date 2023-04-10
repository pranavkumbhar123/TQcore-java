package com.enumdemo;

import java.util.Scanner;

public class BookMovieTIckets {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose  ticket type:");
		System.out.println("1.Standard");
		System.out.println("2.Premium");
		System.out.println("3.Recliner");
		
		int seatTypes=sc.nextInt();
		
		System.out.println("Enter total seats:");
		
		int noOfSeats=sc.nextInt();
		
		MovieSeats ms=null;
		
		switch(seatTypes)
		{
		case 1: ms=MovieSeats.STANDARDS;
			    System.out.println("Total Price:"+ noOfSeats*(ms.price));
			    break;
		case 2: ms=MovieSeats.PREMIUM;
				System.out.println("Total Price:"+ noOfSeats*(ms.price));
				break;
		case 3:ms=MovieSeats.RECLINER;
				System.out.println("Total Price:"+ noOfSeats*(ms.price));
				break;
		default:
			System.out.println("Error");
		
		
		}
		

	}

}
