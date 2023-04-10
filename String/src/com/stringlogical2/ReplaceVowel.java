package com.stringlogical2;

public class ReplaceVowel {

	public static void replaceV(String st)
	{
		st=st.toLowerCase();
		char ch1[]=st.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if((ch1[i]=='a')||(ch1[i]=='e')||(ch1[i]=='i')||(ch1[i]=='o')||(ch1[i]=='u'))
			{
				ch1[i]='#';
			}
		}
		System.out.println(ch1);
		
	}
	public static void replaceVChar(String st)
	{
		st=st.toLowerCase();
		
		char ch1[]=st.toCharArray();
		
		int i;
		for( i=0;i<ch1.length-1;i++)
		{
			if((ch1[i]=='a')||(ch1[i]=='e')||(ch1[i]=='i')||(ch1[i]=='o')||(ch1[i]=='u'))
			{
				ch1[i]=ch1[i+1];
			}
		}
		
		//for replacing last vowel with first letter
		
		if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u')
		{
			ch1[i]=ch1[0];
		}
		System.out.println(ch1);
		
	}
	public static void main(String[] args) {


		String str="java";
		System.out.println("Original:"+str);
		
		//replaceV(str);
		replaceVChar(str);
		

	}

}
