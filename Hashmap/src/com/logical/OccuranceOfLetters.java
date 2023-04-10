package com.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfLetters {

	public static void creatMap(ArrayList<String> al)
	{
		HashMap<String, Integer> map= new HashMap<>();
	
		for(String s:al)
		{
			if(map.containsKey(s))
			{
			
				map.put(s, map.get(s)+1);
			}
			else
			map.put(s, 1);
		}
		for(Map.Entry<String,Integer> en:map.entrySet())
		{
			System.out.println(en.getKey()+":"+en.getValue());
		}
	}
	public static void main(String[] args) {


		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("A");
		
		System.out.println(list);
		creatMap(list);

	}

}
