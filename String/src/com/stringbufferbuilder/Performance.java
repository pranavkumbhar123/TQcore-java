package com.stringbufferbuilder;

public class Performance {

	public static void calcStringBuffer(StringBuffer str)
	{
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			str.append("Java");
		}
		System.out.println("Time taken:"+(System.currentTimeMillis()-startTime));
		
	}
	public static void calcStringBuilder(StringBuilder str)
	{
		long startTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			str.append("Java");
		}
		System.out.println("Time taken:"+(System.currentTimeMillis()-startTime)+" ms");
	}
	public static void main(String[] args) {


		//StringBuffer sb=new StringBuffer();
		//calcStringBuffer(sb);
		
		StringBuilder sb1=new StringBuilder();
		
		calcStringBuilder(sb1);

	}

}
