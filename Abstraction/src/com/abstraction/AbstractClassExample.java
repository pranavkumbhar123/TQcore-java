package com.abstraction;

abstract class ObjectMovement
{
	int speed;
	static String direction ="forward";
	abstract public void move(int newspeed);
	public void setspeed(int speed)
	{
		this.speed=speed;
		
	}
	public int getSpeed()
	{
		return speed;
	}
}
class Ball extends ObjectMovement
{
	public void move(int s)
	{
		speed =s;
		System.out.println("now Ball is rolling with speed"+speed +"meter/minute on the ground in"+ ObjectMovement.direction +"direction");
		
	}
}
class Car extends ObjectMovement
{
	public void move(int s) {
		speed =s;
		System.out.println("Now car with speed"+speed +"km/hr on the Road in"+ ObjectMovement.direction +"direction");
	}
}





public class AbstractClassExample {

	public static void main(String[] args) {
		ObjectMovement om=new Car();
		om.setspeed(120);
		System.out.println("Initialize speed of car:" +om.getSpeed()+"km/hr");
		om.move(80);
		
		om=new Ball();
		om.setspeed(20);
		System.out.println("Initialize speed of ball:"+om.getSpeed()+"km/hr");
		om.move(12);

	}

}
