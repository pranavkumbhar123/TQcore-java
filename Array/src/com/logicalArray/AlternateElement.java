package com.logicalArray;
import java.util.Scanner;

public class AlternateElement {


	
		static Scanner sc=new Scanner(System.in);
		public static void enterArray(int ar[])
		{
			System.out.println("Enter array elements");
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
			}
		}
		public static void printArray(int ar[])
		{
			System.out.println("---------");
			for(int x:ar)
			{
				System.out.println(x);
			}
		}
		public static void alternateNumbers(int ar[])
		{
			
			/*for(int i=0;i<ar.length;i+=2)
			{
				System.out.println(ar[i]+" ");
			}
			System.out.println();
			*/
			for(int i=0;i<ar.length;i++)
			{
				if(i%2==0)
					System.out.println(ar[i]+" ");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			System.out.println("Enter array size");
			int size=sc.nextInt();
			int arr[]=new int[size];
			enterArray(arr);
			System.out.println("Before:");
			printArray(arr);
			System.out.println("after");
			alternateNumbers(arr);
			
			

		}

	}


