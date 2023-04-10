package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {


		Vector<String> colors=new Vector<>(5);
		

		System.out.println("size:"+colors.size());
		
		System.out.println("Capacity:"+colors.capacity());
		
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Orange");
		colors.add("Red");
		colors.addElement("Brown");
		
		System.out.println("size:"+colors.size());
		
		System.out.println("Capacity:"+colors.capacity());
		
		colors.add("Black");
		colors.ensureCapacity(20);
		System.out.println("size:"+colors.size());
		
		System.out.println("Capacity:"+colors.capacity());
		
		System.out.println("======================");
		
		System.out.println(colors.get(4));
		System.out.println(colors.elementAt(4));
		
		System.out.println(colors.set(4, "Purple"));
		System.out.println(colors);
	}

}
