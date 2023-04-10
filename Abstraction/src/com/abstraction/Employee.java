package com.abstraction;

public class Employee extends Person{

	private float salary;
	private String job;
	
	Employee()
	{
		
	}
	Employee(String name,int age, float salary, String job)
	{
		super(name,age);
		this.salary=salary;
		this.job=job;
	}
	void checkStatus()
	{
		System.out.println("I am working person");
		System.out.println("job:"+job);
		System.out.println("salary:"+salary);
	}
	
	void moneyStatus(float salary) {
		System.out.println(" i have earned:");
		this.salary=this.salary+salary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee ["+super.toString()+" salary=" + salary + ", job=" + job + "]";
	}
	
}
