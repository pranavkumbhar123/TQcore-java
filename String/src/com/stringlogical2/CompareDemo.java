package com.stringlogical2;

public class CompareDemo {

	public static void uniqueString(String str1[],String str2[])
	{
		boolean found;
		for(String s:str2)
		{
			found=false;
			for(String si:str1)
			{
				if(s.equals(si))
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {

		

		String s1[]= {"shruti","Ajay","Suraj","Mamta","Vinot"};
		String s2[]= {"Gaurav","Sharukh","Ajay","Sahili","Vinod"};
		
		uniqueString(s1,s2);
	
	
	}

}
