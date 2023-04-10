package com.linkedlist;

import java.util.LinkedList;

public class LinkedLIstIteration {

	public static void main(String[] args) {


		LinkedList<String> a=new LinkedList<>();
		
		a.add("red");
		a.add("orange");
		a.add("yellow");
		a.add("brown");
		
		System.out.println(a);
		
		//1st 
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a);
		}

	}

}
