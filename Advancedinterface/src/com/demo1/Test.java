package com.demo1;

public class Test {

	public static void main(String[] args) {

		Manager m1= new Manager(1,"pranav",80000f);
		m1.showDetails();
		m1.showSalary(200000);
		
		Celebrity c1= new Celebrity("tiger",5);
		c1.showDetails();

	}

}
