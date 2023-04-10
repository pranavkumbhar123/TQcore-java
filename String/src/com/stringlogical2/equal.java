package com.stringlogical2;

public class equal {

	public static void equal(String []arr1,String []arr2)
	{
		String str[]=new String [arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {


		String arr1[]= {"Java","c","python","cpp"};
		String arr2[]= {"Angular","Java","Sql"};
		
		equal(arr1,arr2);
		

	}

}
