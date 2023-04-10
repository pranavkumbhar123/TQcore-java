package com.Switch;

import java.util.Scanner;

public class AlternateNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int sum = 0;
		int number = sc.nextInt();
		
		for(int i=0;i<number;i++)
		{
		   if (i%2 == 0) {
			   sum =  sum +i;
			   System.out.println(i);
		   }
		
		
		}
		System.out.println("The sum is "+sum);		

	}

}
