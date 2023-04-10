package com.array1;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void change(int arr[])
	{
		//traversal
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i];
		}
		System.out.println("Array in method");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ar[]=new int[5];
		System.out.println("Enter array elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		change (ar);
		System.out.println("original array");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
			
		}
		System.out.println();
		}
	


	}


