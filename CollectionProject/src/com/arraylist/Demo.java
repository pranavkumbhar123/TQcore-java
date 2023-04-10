package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		l1.add("Java");
		l1.add(null);
		l1.add(null);

		System.out.println(l1);
		l1.add(2, "Html");
		System.out.println(l1);
		
		ArrayList<String> l2=new ArrayList();
		l2.add("vb.net");
		l2.add("asp.net");
		
		System.out.println(l2);
		l1.addAll(l2);
		l1.addAll(2, l1);
		
		l1.remove("Java");
		
		System.out.println(l1);
		
		l1.retainAll(l2);
		l1.removeAll(l2);
		System.out.println(l2);

	}

}
