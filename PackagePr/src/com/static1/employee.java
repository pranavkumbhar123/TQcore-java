package com.static1;

public class employee {

	private String name;
	static private String company;
	
	static int employeeCount;
	static {
		company="tcs";
		employeeCount=0;
		
		
	}
	//instance
	{
		employeeCount++;
	}
	public employee()
	{
		
	}
	public employee(String name,String company)
	{
		this.name=name;
		this.company=company;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany()
	{
		this.company=company;
	}
	
	
}
