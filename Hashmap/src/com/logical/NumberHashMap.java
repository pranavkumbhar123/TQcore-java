package com.logical;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberHashMap {

	public static String convertWord(int num)
	{
		String word=null;
		
		switch(num)
		{
		case 1: 
			word ="one";
			break;
		case 2: 
			word="two";
			break;
		case 3: 
			word="three";
			break;
		case 4 :
			word="four";
			break;
		case 5:
			word="five";
			break;
		default :
			System.out.println("Error");
		}
		return word;
	}
	
	public static void createMap(ArrayList<Integer>list)
	{
		HashMap<String, Integer> map= new HashMap<>();
		for(Integer n: list)
		{
			String nwords =convertWord(n);
			if(map.containsKey(nwords))
				map.put(nwords, map.get(nwords)+1);
			else
				map.put(nwords, 1);
		}
		for(Map.Entry<String, Integer> en: map.entrySet())
		{
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
	}

	public static void main(String args[]) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(3);
	al.add(2);
	al.add(4);
	al.add(3);
	al.add(1);
	al.add(1);
	
	createMap(al);
	
	}
	
}
