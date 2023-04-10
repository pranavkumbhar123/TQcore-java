package com.bankdemo;

public class AnonymousObject {

	public static void main(String[] args) {
		//getter>no
		System.out.println(new Account(12,"pranav","SBI").toString());
		new Account(3,"shivtej","ICICI",1500000).display();
	}

}
