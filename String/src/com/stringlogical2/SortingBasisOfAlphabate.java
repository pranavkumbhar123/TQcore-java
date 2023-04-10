package com.stringlogical2;

import java.util.Arrays;

public class SortingBasisOfAlphabate {

	public static void sortString(String []str)
	{
		for(int i=0;i<str.length;i++)
		{
			String temp;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>1)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
				

			}
			
		}
	}
	public static void main(String[] args) {


		String lang[]= {"Java","C","Angular","Html","Web"};
		System.out.println(Arrays.toString(lang));

		sortString(lang);
		System.out.println(Arrays.toString(lang));
	}

}
