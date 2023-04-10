package com.custommaplogical;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraiLsitToHashMap {

	public static void namesMap(ArrayList<Employee> al)
	{
		HashMap<Department, ArrayList<String>> dmap=new HashMap<>();
		ArrayList<String> names;
		for(Employee emp:al)
		{
			Department d=emp.getDept();
			if(dmap.containsKey(d))
			{
				names=dmap.get(d);
				
			}
			else
			{
				names =new ArrayList<>();
			}
			names.add(emp.getName());
			dmap.put(d, names);
		}
		for(Map.Entry<Department, ArrayList<String>> en: dmap.entrySet())
		{
			System.out.println(en.getKey().getdName()+" : "+en.getValue());
		}
		
	}
	public static void main(String[] args) {


		Department d1=new Department("technical");
		Department d2= new Department("Hr");
		Department d3= new Department("sales");
		ArrayList<Employee> emp=new ArrayList<>();
	
		emp.add(new Employee(101,"Pranav",78000f,d1));
		emp.add(new Employee(102,"Nilesh",68000f,d3));
		emp.add(new Employee(103,"Om",79000f,d3));
		emp.add(new Employee(104,"Shivatej",78300f,d1));
		emp.add(new Employee(105,"Aditya",55000f,d3));
		emp.add(new Employee(106,"Aniket",88000f,d3));
		emp.add(new Employee(107,"Annya",45550f,d2));
		emp.add(new Employee(108,"Atharv",64030f,d2));
		emp.add(new Employee(109,"Omkar",99000f,d1));
		namesMap(emp);
		
		

	}

}
