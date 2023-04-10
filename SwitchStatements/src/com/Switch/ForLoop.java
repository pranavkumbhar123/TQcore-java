package com.Switch;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num = sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num*i);
	}
	
	

	}

}
