package com.stringlogic;

public class StringMethod {

	public static void main(String[] args) {

		//length
		String s1="Java is fun";
		System.out.println("Length:"+s1.length());
		
		//charAr
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(s1.length()-1));
		
		//substring
		System.out.println(s1.substring(1,6));   //..........1 to 5
		
		//contains
		
		System.out.println(s1.contains("Java is fun")); //return true or false
		
		String s2="Java";
		String s3="java";
		System.out.println("comparing strings......");
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		// index of
		
		System.out.println(s1.indexOf("fun"));
		
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.lastIndexOf('a'));

	}

}
