package com.demo;

public class ExceptionHandling1 {

	public static void main(String[] args) {


		int x=10;
		int y=10;
		try {
		int sum=(x+y)/(x-y);
		
		System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
