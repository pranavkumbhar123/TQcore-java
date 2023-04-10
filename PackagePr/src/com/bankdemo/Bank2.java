package com.bankdemo;

import java.util.Scanner;

public class Bank2 {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		Account a2=new Account (2011,"pranav","HDFC",3420423f);
		System.out.println(a2);
		
		System.out.println("Enter the amount to be deposited:");
		float amount = sc.nextFloat();
		
		
		
		if((a2.getBalance()+amount)<50000)
		{
			a2.deposit(amount);
		}
		else
		{
			System.out.println("Balance exceeding 50000 enter pan card Details:");
			String pan=sc.next();
			a2.deposit(amount,pan);
		}

	}

}
