package com.stringlogical2;

import java.util.Scanner;

public class Anagram {

	public static void sorting(char ch[])
	{
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	public static boolean checkEqual(char ch1[],char ch2[])
	{
		boolean status =true;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				status =false;
				break;
			}
		}
		return status;
	}
	public static void checkAnagram(String str1, String str2)
	{
		boolean status=false;
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			//Arrays.sort(ch1);
			//Arrays.sort(ch2);
			sorting(ch1);
			sorting(ch2);
			
			System.out.println(ch1);
			System.out.println(ch2);
			
			//if (Arrays.equals(ch1, ch2))
			if(checkEqual(ch1,ch2))
			{
				status =true;
				System.out.println("the string are anagram");
			}
		}
		if(!status)
		{
			System.out.println("The string are not anagram");
		}
			
			
			
		
		
		
	}
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");

		String s1=sc.next();
		
		System.out.println("Enter second string");
		String s2=sc.next();
		checkAnagram(s1,s2);
	}

}
