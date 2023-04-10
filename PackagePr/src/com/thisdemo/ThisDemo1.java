package com.thisdemo;

class Person
{
	private String name;
	private int age;
	private String vote;
    
	Person()
	{
		System.out.println("default");
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		this.vote=null;
	}
	public void getVotingRight()
	{
		System.out.println("Voting right:");
		this.checkVote();
		//checkVote();
		System.out.println(this.vote);
	}
	public void checkVote()
	{
		System.out.println("In checking");
		if(this.age>=18)
			this.vote="Eligible";
		else 
			this.vote="Not eligible";
	}
}

public class ThisDemo1 {

	public static void main(String[] args) {
		
		Person p1=new Person("pranav",23);
		p1.getVotingRight();
				

}
}



