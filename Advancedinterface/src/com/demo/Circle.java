package com.demo;

interface Printable
{
  float pi=3.147f;
  
  void draw();

}

interface Drawable 
{
  void draw();	
  void display();

}

public class Circle implements Printable,Drawable {
	
	int radius;
	
	Circle()
	{
		
	}
	
	Circle(int radius)
	{
		this.radius=radius;
	}
	
	@Override
	public void display() {

      System.out.println("Circle is drawn");
		
	}

	@Override
	public void draw() {

       System.out.println("Area is :"+(2*pi*radius));
		
	}
	
	
	public static void main(String[] args) {

       Printable p= new Circle(7);
       p.draw();
       //p.display();
       
       Drawable d= new Circle(8);
       d.draw();
       d.display();

	}

	

}
