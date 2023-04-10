package com.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortStudentsHashMap {

	/*public static void SortMarks(HashMap<Student,Courses>map)
	{
		ArrayList<Student> list =new ArrayList<>();
		
	
		//System.out.println(list);
		LinkedHashMap<String, Double> lmap= new LinkedHashMap<>();
		for(String s:list)
		{
			lmap.put(s, map.get(s));
		}
		for(Map.Entry<String,Double> en:lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		
	}*/
	public static void keySort(HashMap<Student,Courses> smap)
	{
		ArrayList<String> list = new ArrayList<>();
		
		Collections.sort(list);
		
		//System.out.println(list);
		
		LinkedHashMap<String, Double> lmap= new LinkedHashMap<>();
		
		for(String s:list)
		{
			lmap.put(s,smap.get(s));
		}
		
		for(Map.Entry<String, Double>en: lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}

	public static void main(String[] args) {


		Courses c1= new Courses(1,"python");
		Courses c2= new Courses(2,"Java");
		Courses c3 = new Courses(3,"C");
		
		LinkedHashMap<Student,Courses> smap=new LinkedHashMap<>();
		
		smap.put(new Student(101,"Pranav",89f), c3);
		smap.put(new Student(102,"Nilesh",88f), c1);
		smap.put(new Student(103,"Om",78f), c2);
		smap.put(new Student(104,"Annya",98f), c1);
		smap.put(new Student(105,"Omkar",85f), c3);
		smap.put(new Student(106,"Atharv",82f), c2);
		
		for(Entry<Student, Courses> en:smap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		//SortMarks(smap);
		keySort(smap);
		
		
		

	}

}
