package com.array1;

public class SearchingArray {
	
	public static boolean search(int arr[],int value)
	{
		boolean isPresent=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				isPresent=true;
				break;
			}
		}
		
		return isPresent;
	}

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,8,7};
		boolean isp=search(arr1,9);
		if(isp)//isp==true
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

}
