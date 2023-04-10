package com.array1;

import java.util.Scanner;

public class SearchingArray2 {

	static Scanner sc= new Scanner(System.in);
	public static void search(int ar[],int value)
	{
		boolean isPresent=false;
		int pos=-1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==value)
			{
				isPresent=true;
				pos=i;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("Element "+value+" is present at position:"+pos);
		}
		else
		{
			System.out.println("Element "+value+" is not present");
		}
	}
	public static void enterArrayElements(int ar[])
	{
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
			System.out.println("Enter size of array");
			int size=sc.nextInt();
			
			int arr1[]=new int[size];
			enterArrayElements(arr1);
			System.out.println("Enter the element to be searched:");
			int val=sc.nextInt();
			System.out.println(arr1.length);
			search(arr1,val);

	}

}
