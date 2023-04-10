package com.logicalArray;

import java.util.Arrays;

public class MergeAlternateElements {

	public static int[] mergeArray(int ar1[], int ar2[])
	{
		int size1=ar1.length;
		int size2=ar2.length;
		int marr[]=new int[size1+size2];
		int i,j;
		int k=0;
		
		for( i=0;i<size1;i+=2)
		{
			marr[k]=ar1[i];
					k+=2;
			
		}
		System.out.println(Arrays.toString(marr));
		k=1;
		for( j=1;j<size2;j+=2)
		{
			
			marr[k]=ar2[j];
			k+=2;
		}
		
	}
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4};
		int ar2[]= {5,6,7,8,9};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));

	}

}
