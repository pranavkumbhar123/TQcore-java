package com.logicalArray;

import java.util.Arrays;

public class UniqueELements {

	public static void unique(int arr[])
	{
		int count;
		int ucount=0;
		for(int i=0;i<arr.length;i++)
		{
			count =1;
			if(arr[i]=='\0')
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			if(count==1)
			{
				ucount++;
				System.out.println(arr[i]+" :"+count);
			}
		}
		System.out.println("Number of unique elements:"+ucount);
	}
	
	
	
	
	
	public static void main(String[] args) {

		int ar[]= {1,2,3,4,5,3,1,2,3,7,8};
		System.out.println(Arrays.toString(ar));
		unique(ar);

	}

}
