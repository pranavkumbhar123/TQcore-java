package com.demo;

class First
{
	Number value;
	
	Number displayValue()
	{
		return value;
	}
}
class Second extends First
{
	Integer myVal;
	Integer displayValue() {
		return myVal;
	}
	
}
/*class Third extends First
{
	char ch;
	Character displayValue()
	{
		return ch;
	}
}*/
public class Wrapper {
	public static void main(String args[]) {
	Second s1= new Second();
	Integer n= s1.displayValue();
	n=n+5;
	}

	
}
