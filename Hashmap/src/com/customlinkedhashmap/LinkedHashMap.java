package com.customlinkedhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {


		Department d1=new Department("technical");
		Department d2= new Department("Hr");
		Department d3= new Department("sales");
		LinkedHashMapemp=new LinkedHashMap<>();
	
		emp.add(new Employee(101,"Pranav",78000f,d1));
		emp.add(new Employee(102,"Nilesh",68000f,d3));
		emp.add(new Employee(103,"Om",79000f,d3));
		emp.add(new Employee(104,"Shivatej",78300f,d1));
		emp.add(new Employee(105,"Aditya",55000f,d3));
		emp.add(new Employee(106,"Aniket",88000f,d3));
		emp.add(new Employee(107,"Annya",45550f,d2));
		emp.add(new Employee(108,"Atharv",64030f,d2));
		emp.add(new Employee(109,"Omkar",99000f,d1));
		
		for(Map.Entry<Department, ArrayList<String>> en: emp())
		{
			System.out.println(en.getKey().getdName()+" : "+en.getValue());
		}
		
		
		

	}

	private void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
