package com.treemap;

import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {


	 TreeMap<Integer,String> map1=new TreeMap<>();
	 map1.put(6, "C");
	 map1.put(5, "python");
	 map1.put(3, "Angular");
	 map1.put(4, "Java");
	 map1.put(2, "SpringBoot");
	 map1.put(1, "HTMl");
	 map1.put(7, null);
	 
	 System.out.println("/////////////////////");
	 System.out.println("FirstKey:"+map1.firstKey());
	 System.out.println("LastKey:"+map1.lastKey());
	 
	 
	 

	}

}
