package com.accessspecifier;

public class AccessSpecifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AccessSpecifier d1= new AccessSpecifier();
		d1.a=90;//not accessible
		d1.b=45;
		d1.c=50;
		
		d1.show();//not accessible
		d1.display();
		d1.test();
	}

}
