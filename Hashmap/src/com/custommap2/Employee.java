package com.custommap2;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public int hashCode()
	{
		return Objects.hash(id,name);
	}
	public boolean equals (Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Employee e=(Employee)obj;
		return (id==e.id)&&(name.equals(e.name));
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
