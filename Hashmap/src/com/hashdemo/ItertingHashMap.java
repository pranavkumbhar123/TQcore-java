package com.hashdemo;

import java.util.HashMap;
import java.util.Set;

public class ItertingHashMap {

	public static void main(String[] args) {


		HashMap<String, Double> map=new HashMap<>();
		map.put("Pranav", 89.9);
		map.put("Nilesh", 88.0);
		map.put("Om",99.9);
		map.put("Omkar", 98.9);
		
		System.out.println(map);

		System.out.println("=========================");
		
		Set<String> keyset=map.keySet();
		
		for(String s:keyset)
		{
			System.out.println(s);
		}
		
		
		
	}

}
