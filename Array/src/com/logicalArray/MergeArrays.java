package com.logicalArray;

import java.util.Arrays;

public class MergeArrays {

	public static int[] mergeArray(int ar1[], int ar2[])
	{
		int size1=ar1.length;
		int size2 =ar2.length;
		int marr[]=new int[size1+size2];
		int i,j;
		int k=0;
		for(i=0,j=0;i<size1&&j<size2;i++,j++)
		{
			marr[k++]=ar1[i];
			marr[k++]=ar2[j];
	}
		//System.out.println(Arrays.toString(marr));
		
		//remaining elements
		while(i<size1)
		{
			marr[k++]=ar1[i++];
		}
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		//System.out.println(Arrays.toString(marr));
		//remaining elements
		while(i<size1)
		{
			marr[k++]=ar1[i++];
		}
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		//System.out.println(Arrays.toString(marr));
		return marr;
	}
	public static int[] mergeArrayAlternate2(int ar1[], int ar2[])
	{
		int size1=ar1.length;
		int size2=ar2.length;
		int size=0;
		int marr[];
		if(size1>size2)
		{
			marr=new int[size1];
			size=size2;
		}
		else
		{
			marr =new int[size2];
			size=size1;
		}
		int i,j,k;
		i=0;
		j=0;
		for(k=0;k<size;k++)
		{
			if(k%2==0)
			marr[k]=ar1[i];
			else
				marr[k]=ar2[j];
			
			i++;
			j++;
		}
		while(i<size1)
		{
			marr[k++]=ar1[i++];
		}
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		System.out.println(Arrays.toString(marr));
		return marr;
	}
	
	
	
	
	public static void main(String[] args) {
	
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int mar[]=mergeArrayAlternate2(arr1, arr2);
		//System.out.println(Arrays.toString(mar));
	}

}
