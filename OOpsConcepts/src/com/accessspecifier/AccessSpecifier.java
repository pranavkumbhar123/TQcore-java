package com.accessspecifier;

public class AccessSpecifier {
	
	
	private int a;
	int b ;
	public int c;
	
	private void show ()
	{
		System.out.println("hi");
	}
	void display()
	{
		System.out.println("Hello");
	}
	public void test()
	{
		System.out.println("Test");
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessSpecifier d1=new AccessSpecifier();
		d1.a=89;
		d1.b=79;
		d1.c=90;
		d1.show();
		d1.display();
		d1.test();
	}

}
