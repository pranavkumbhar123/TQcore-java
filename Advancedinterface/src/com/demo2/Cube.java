package com.demo2;

public class Cube implements Printable {

	int side;
	Cube()
	{
		
	}
	Cube(int side)
	{
		this.side=side;
	}
	@Override
	public void area() {

		System.out.println("Area of cube:"+(6*side*side));
		
	}
	public void volume()
	{
		System.out.println("volume of cube:"+(side*side*side));
	}
	
	
	public static void main(String[] args) {
		Printable.show();
		
		Printable p= new Cube(8);
		p.area();
		p.volume();
		

	}
	

}
