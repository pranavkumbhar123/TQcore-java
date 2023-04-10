package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorUse {

	public static void main(String[] args) {
		
		List l1=new ArrayList<>();
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		l1.add("Java");
		
		// 5 ways to interate
		
		// 1st way
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
			
		}
		System.out.println("===================");
		
		// 2nd way
		for(String s:l1)
		{
			System.out.println(s);
		}
		System.out.println("=====================");
		
		// 3rd way
		Iterator<String> itr=l1.iterator();
		
		// cursor before the first element
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===========================");

		
		ListIterator<String> litr1=l1.listIterator(l1.size());
				while(litr1.hasPrevious())
				{
					System.out.println(litr1.previous());
				}
	}

}
