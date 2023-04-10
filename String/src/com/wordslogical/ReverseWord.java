package com.wordslogical;

public class ReverseWord {

	public static void reverseW2(String st)
	{
	
		st=st.toLowerCase();
		String splitst[]=st.split("\\s");
		
		for(int i=0;i<splitst.length;i++)
		{
			
		}
		
		
	}
	public static void reverseW(String st)
	{
		
		
		 String rev="";
		 
		 
		 for(int i=st.length()-1;i>=0;i--)
		 {
			 rev =rev+st.charAt(i);
		 }
		 System.out.println("Reversed string is:"+rev);
	}
	public static void main(String[] args) {


		String str="java is a programming language";
		
		System.out.println(str);
		
		reverseW(str);

	}

}
