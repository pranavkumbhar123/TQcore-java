package com.stringlogical2;

public class SearchingString {

	public static boolean search(String str1[],String value)
	{
		boolean isPresent=false;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]==value)
			{
				isPresent=true;
				break;
			}
		}
		
		return isPresent;
	}

	public static void main(String[] args) {
		


		String lang[]= {"java","python","c"};
		boolean isp=search(lang,"pranav");
		if(isp)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

}


