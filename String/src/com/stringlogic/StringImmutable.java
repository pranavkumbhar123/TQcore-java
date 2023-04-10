package com.stringlogic;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1="java";
		System.out.println(s1);
		s1.concat("Programs");
		s1=s1.concat("Programs");
		System.out.println(s1);

	}

}
