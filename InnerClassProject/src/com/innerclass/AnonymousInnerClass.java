package com.innerclass;

public class doable
{

	
	
	
}


public class AnonymousInnerClass {

	public static void main(String[] args) {


		Double d1=new Double()
				{
			public void doIt()
			{
				System.out.println("I am doing nothing");
			}
				};
			d1.doIt();
			
			//using concrete
			
			Car c1=new Car()
					{
				public void drive()
				{
					System.out.println("I am driving BMW");
				}
					};
					
			C1.drive();

	}

}
