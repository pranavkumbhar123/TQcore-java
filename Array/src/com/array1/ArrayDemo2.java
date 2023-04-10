package com.array1;

import java.util.Scanner;

public class ArrayDemo2 {
	public static int sumEven(int arr[])
	{
		int sumEven=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sumEven+=arr[i];
			}
		}
		return sumEven;
		
		
	}
	
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int ar[]=new int[5];
	System.out.println("Enter array elements:");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
		
	}
	int sumE=sumEven(ar);
	System.out.println("sum of even:"+sumE);

	}

}
