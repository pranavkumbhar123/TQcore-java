package com.demo1;

public class Celebrity implements Person{
	private String name;
	private float rating;
	
	public Celebrity() {
		
	}
	public Celebrity(String name, float rating)
	{
		this.name=name;
		this.rating=rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public void showDetails()
	{
		System.out.println(name+" "+rating);
	}
	
}
