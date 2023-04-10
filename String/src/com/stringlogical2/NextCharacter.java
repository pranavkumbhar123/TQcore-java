package com.stringlogical2;

public class NextCharacter {

	public static void nextChar(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]++;
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {


		String str="Language";
		System.out.println(str);
		nextChar(str);

	}

}
