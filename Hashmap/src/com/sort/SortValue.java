package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class SortValue {

	public static void valueSort(HashMap<String, Double> map)
	{
		ArrayList<String>  list=new ArrayList<>();
		Collections.sort(list);
		System.out.println(list);
		
		LinkedHashMap<String,Double> lmap=new LinkedHashMap();
		for(Map.Entry<String, Double>en:map.entrySet())
		{
			if(en.getValue())
		}
		
	}
	public static void main(String[] args) {
	

		HashMap<String, Double> map=new HashMap<>();
		map.put("Pranav", 99.9);
		map.put("Nilesh",88.8);
		map.put("Om",88.98);
		map.put("Anny", 98.9);
		
		valueSort(map);
		
	}

}
