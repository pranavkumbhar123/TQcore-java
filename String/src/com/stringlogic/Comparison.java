package com.stringlogic;

public class Comparison {

	public static void main(String[] args) {


		String s1="Java";
		String s2=new String ("Java");
		
		System.out.println("=="+(s1==s2));
		System.out.println("equals:"+s1.equals(s2));
		
		String s3=new String("Java");
		System.out.println("=="+(s3==s2));
		System.out.println("equals:"+s3.equals(s2));
		
		String s4="Java";
		System.out.println("=="+(s1==s4));
		System.out.println("equals:"+s1.equals(s4));

		if(s1.compareTo(s2)==0)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
	}

}
