package com.demo1;

public class Manager implements Employee{
	private int id;
	private String name;
	private float salary;
	
	public Manager()
	{
		
	}
	public Manager(int id, String name, float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
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
	@Override
	public void showDetails()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	@Override
	public void showSalary(float perks) {

		salary=salary+perks;
		System.out.println("Salary:"+salary);
		
	}
	

}
