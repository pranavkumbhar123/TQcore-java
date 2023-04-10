package com.bankdemo;

public class Bank {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccNumber(1011);
		a1.setAccName("pranav");
		a1.setBankName("SBI");
		a1.setBalance(8921f);//loose bind
		
		Account a3=new Account(2013,"sunny","sbi");
		System.out.println(a3);
		
		//tight bind
		a3.setBalance(7000);
		System.out.println(a3);
		Account a2=new Account(2011,"Gaurav","HDFC",23344f);
		System.out.println(a2);
		
		
	}

}
