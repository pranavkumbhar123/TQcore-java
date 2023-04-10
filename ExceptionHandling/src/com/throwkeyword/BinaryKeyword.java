package com.throwkeyword;

import java.util.Scanner;

public class BinaryKeyword {

	public static void main(String[] args) {


		System.out.println("Enter a number");
		Scanner sc=new Scanner (System.in);
		
		int num=sc.nextInt();
		
		while(num!=0)
		{
			if((num%10!=0)&&(num%10!=1))
			{
				throw new ArithmeticException("Not a binary number");
			}
			num=num/10;
		}
		System.out.println("Binary number is valid");
		
		

	}

}
