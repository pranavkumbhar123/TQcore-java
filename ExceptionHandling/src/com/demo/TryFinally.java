package com.demo;

public class TryFinally {

	public static void main(String[] args) {


		int ar[]= {2,3,4,5,6};
		
		try
		{
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]+ar[i+1]);
			}
		}
		
		// here catch is handled by JVM
		finally
		{
			System.out.println("rest of the code");
		}

	}

}
