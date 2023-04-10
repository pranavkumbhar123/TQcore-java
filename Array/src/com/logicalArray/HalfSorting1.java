package com.logicalArray;

public class HalfSorting1{
	public static void HalfSorting(int ar[])
	{

	
		int len=ar.length;
		int temp;
		for(int i=0;i<len/2;i++)
		{
			for(int j=i+1;j<len/2;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(ar));
		//for descending other half
		
		for(int i=len/2;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		//System.out.println(Arrays.toString(ar));
		
		
	}	
	
	public static void printArray(int ar[])
	{
		for(int x:ar)
		{
			System.out.println(x+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,5,7,8,3,0};
		System.out.println("Before");
		printArray(arr);
		
		System.out.println("==================");
		HalfSorting(arr);
		
		System.out.println("After sorting");
		printArray(arr);
		
	}
}


