package com.sort;

import java.util.ArrayList;
import java.util.HashMap;

import com.custommaplogical.Department;
import com.custommaplogical.Employee;

public class EmployeeSortHashMap {

	public static void main(String[] args) {


		
		Department d1=new Department("technical");
		Department d2= new Department("Hr");
		Department d3= new Department("sales");
		HashMap<Employee,Department>lmap=new HashMap<>();
	
		lmap.put(new Employee(101,"Pranav",78000f, d3), d3);
		emp.add(new Employee(102,"Nilesh",68000f,d3));
		emp.add(new Employee(103,"Om",79000f,d3));
		emp.add(new Employee(104,"Shivatej",78300f,d1));
		emp.add(new Employee(105,"Aditya",55000f,d3));
		emp.add(new Employee(106,"Aniket",88000f,d3));
	}

}
