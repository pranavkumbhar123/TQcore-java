package com.custommap2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) {


		HashMap<Employee, String> emap=new HashMap<>();
		 emap.put(new Employee(101,"Pranav",90000f),"Technical");
		 emap.put(new Employee(102,"Nilesh",89000f),"HR");
		 emap.put(new Employee(101,"Pranav",894000f), "Sales");
		 
		 for(Map.Entry<Employee, String> en: emap.entrySet())
		 {
			 System.out.println(en.getKey());
			 System.out.println(en.getValue());
		 }

	}

}
