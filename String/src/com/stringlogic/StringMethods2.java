package com.stringlogic;

public class StringMethods2 {

	public static void main(String[] args) {


		String s1="Java is fun";
		
		System.out.println(s1.isEmpty());
		
		String s2="";
		System.out.println(s2.isEmpty());
		
		s2=s1.replace('a', 'c');
		System.out.println(s2);
		
		String s3="  Java  ";
		System.out.println(s3.length());
		
		s3=s3.trim();
		System.out.println(s3.length());

	}

}
