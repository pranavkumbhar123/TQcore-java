package com.twodarray;

import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[][]=new int[2][3];
		System.out.println("Enter array elements:");
		//for rows
		for(int i=0;i<2;i++)
		{
			//for columns
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("=============");
		//print the 2D array
		
		for(int i=0;i<2;i++)
		
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}


	}

}
