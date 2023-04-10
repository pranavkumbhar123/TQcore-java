package com.bankdemo;

import java.util.Scanner;

public class BankDemoObject {

	static Scanner sc=new Scanner(System.in);
	static void deposit(Account a)
	{
		System.out.println("Enter the amount to be deposited:");
		float amount =sc.nextFloat();
		if((a.getBalance()+amount)>=50000)
		{
			System.out.println("Balance exceeding 50000 enter pan card details:");
			String pan =sc.next();
			a.setPanCard(pan);
			
			
		}
		
		a.setBalance(a.getBalance()+amount);
		System.out.println("current balance:"+a.getBalance);
		
	}
	static void withdraw(Account a)
	{
		System.out.println("Enter the amount to be withdrawl:");
		float amount =sc.nextFloat();
		
		if((a.getBalance()-amount)<0)
		{
			System.out.println("Insufficient Balance");
	}
		else
			a.setBalance(a.getBalance()-amount);
		System.out.println("Current balance"+a.getBalance());
		
}
	public static void  main(String args[])
	{
		Account a1=new Account(2122,"pranav","HDFC",200000f);
		System.out.println(a1);
		
		int ch,choice;
		do {
		System.out.println("1.Deposite money");
		System.out.println("2.Withdraw money");
		System.out.println("3.Exit");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:deposit(a1);
		break;
		case 2:withdraw(a1);
		break;
		case 3:System.exit(0);
		break;
		default :System.out.println("Error");
		
		
		
		
		
		}
		System.out.println("Do you want to perform more");
		}
		}
		}