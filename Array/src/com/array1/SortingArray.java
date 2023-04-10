package com.array1;

public class SortingArray {

	public static void sortArray(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void printArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i+" "); 
			
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr1[]= {2,3,4,1,6,3,7};
		System.out.println("Before sorting:");
		printArray(arr1);
		System.out.println("-----------------------------");
		
		sortArray(arr1);
		System.out.println("After sorting");
		printArray(arr1);
	}
}
