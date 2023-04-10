package com.demo;
class vehicle
{
	protected int speed;
	{
		speed =100;
	}
	vehicle changeSpeed()
	{
		speed=speed+10;
		return this;
	}
	void display()
	{
		System.out.println("speed of vehicle:"+speed);
	}
	
}
class Car extends vehicle
{
	{
		speed =200;
		}
	Car changeSpeed()
	{
		speed=speed+50;
		return this;
	}
	void display()
	{
		System.out.println("Speed of car:"+speed);
	}
	void changeGear()
	{
		System.out.println("Geat changed");
	}
}

public class CovarientDemo1 {

	public static void main(String[] args) {
	/*	vehicle v=new Car();
		v.display();
		
		// bmw=bmw.changeSpeed();
		
		v=v.changeSpeed();
		*/
		/* 
		 Car c1= new Car();
		 c1.display();
		 c1=c1.changeSpeed();
		 c1.changeGear();
		 
		 c1.display();
		 
		 */
		Car c;
		
		Car bmw=new Car();
		Car audi=new Car();
		
		c=bmw.changeSpeed();
		c.display();
		
		c.changeGear();
		c.display();
		
		c=audi.changeSpeed();
		c.display();

	}

}
