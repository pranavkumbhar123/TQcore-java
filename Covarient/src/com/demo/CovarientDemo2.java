package com.demo;
class Employee
{
	float salary;
	Employee incrSalary()
	{
		salary=salary+1000;
		return this;
		
	}
}
class Manager extends Employee
{
	Manager incrSalary()
	{
		salary =salary+5000;
		return this;
	}
	void perks()
	{
		salary=salary+2000;
	}
}

public class CovarientDemo2 {

	public static void main(String[] args) {
		Employee e1;
		Manager m1= new Manager();
		m1.salary=9000;
		
		m1=m1.incrSalary();
		
		System.out.println(m1.salary);
		m1.perks();
		
		System.out.println(m1.salary);
		

	}

}
