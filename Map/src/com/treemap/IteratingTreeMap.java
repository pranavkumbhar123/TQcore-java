package com.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IteratingTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer,String> tmap=new TreeMap<>();
		
		tmap.put(3, "Java");
		tmap.put(1, "Python");
		tmap.put(2, "c");
		tmap.put(3, "HTML");
		
		System.out.println("============using iterator method 1=================");
		Set<Integer> keys =tmap.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(keys+" "+tmap.get(keys));
		}
		
		System.out.println("================method 2=============");
		
		
		

		

	}

}
