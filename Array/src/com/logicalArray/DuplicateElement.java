package com.logicalArray;

import java.util.Arrays;

public class DuplicateElement {

	public static void duplicate(int arr[])
	{
		int count;
		int dcount=0;
		for(int i=0;i<arr.length;i++)
		{
			count =1;
			if(arr[i]=='\0')
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count ++;
					arr[j]='\0';
				}
			}
			if(count >1)
			{
				dcount++;
				System.out.println(arr[i]+" : "+count);
			}
			
		}
		System.out.println("Number of duplicate elements :"+dcount);
		
	}
	
	
	public static void main(String[] args) {

		int ar[]= {1,2,3,4,1,2,5,3,5,7};
		System.out.println(Arrays.toString(ar));
		duplicate(ar);
		
		

	}

}
