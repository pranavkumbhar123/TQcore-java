package com.array1;

public class EnhancedLoopArrays {

	public static void main(String[] args) {

		int arr[]= {1,23,4,5,2,6,8};
		
		for(int i:arr)
		{
			System.out.println(i);
			
		}
		for(int i:arr)
		{
			i=i+2;
		}
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
