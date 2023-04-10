package com.Switch;

public class DoWhileExample {

	public static void main(String[] args) {
		//que1
		int i = 1; //initialization
		while(i<=9)
		{
			System.out.println("Hello");
			i +=2; //re-initialization
		}
		System.out.println("i="+i);
		
		//que2
		int a =1;
		while (a<=10)
		{
		System.out.println("a="+a);
		a++;
		}
		//que 3
		int b =10,sum=0;
		while(b>0)
		{
			sum +=b;
			b--;
		}
		System.out.println("sum of first 10 numbers are:"+b);
	}

}
