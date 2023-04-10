package com.logicalArray;

import java.util.Scanner;
public class AddNext {
	static Scanner sc= new Scanner(System.in);
	public static void enterArray(int ar[])
	{
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
	}
	public static void printArray(int ar[])
	{
		System.out.println("------------");
		for(int x:ar)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void replaceNext(int ar[])
	{
		int addVal=2;
		for(int i=0;i<ar.length-addVal;i++)
		{
			ar[i]=ar[i]+ar[i+1];
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		enterArray(arr);
		System.out.println("before");
		printArray(arr);
		replaceNext(arr);
		
		System.out.println("After");
		printArray(arr);

	}

}
