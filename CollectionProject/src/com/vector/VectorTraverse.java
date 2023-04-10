package com.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTraverse {

	public static void main(String[] args) {


		Vector<String> vName=new Vector<>();
		
		vName.add("Pranav");
		vName.add("Nilesh");
		vName.add("Om");
		vName.add("Omkar");
		vName.add("Atharv");
		
		// 1st method
		for(int i= 0;i<vName.size();i++)
		{
			System.out.println(vName.get(i));
		}
		
		// 2nd method
		for(String s:vName)
		{
			System.out.println(s);
		}
		
		// 3rd method
		Iterator<String> itr=vName.iterator();
		
		/// cursor before the first element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator<String> litr1=vName.listIterator();
		while()
		

	}

}
