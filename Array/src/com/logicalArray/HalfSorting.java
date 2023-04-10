package com.logicalArray;

import java.util.Arrays;

public class HalfSorting {

	 static void printOrder(int arr[], int n)
	{
		Arrays.sort(arr);
		for(int i=0; i<n/2;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int j=n-1;j>=n/2;j--)
		{
			System.out.println(arr[j]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {3,2,1,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		System.out.println("After sorting");
		printOrder(arr, n);
				
				
		}
		
		

	}


