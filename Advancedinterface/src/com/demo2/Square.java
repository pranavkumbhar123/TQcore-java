package com.demo2;

public class Square implements Printable {
	int side;
	Square()
	{
		
	}
	Square(int side)
	{
		this.side=side;
	}
	@Override
	public void area() {

		System.out.println("Area of square is:"+(side+side));
		
	}
	public static void main(String args[])
	{
		Printable p= new Square (7);
		p.area();
		p.volume();
	}
}
