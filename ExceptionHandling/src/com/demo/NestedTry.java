package com.demo;

public class NestedTry {

	public static void main(String[] args) {


		try {
			
			String s[]= {"Java","C",null,"Python"};
			for(int i=0;i<=s.length;i++)
			{
				try {
			
			System.out.println(s[i].length());
			
					}

			
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
		}
	}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			

		

	}

		}
