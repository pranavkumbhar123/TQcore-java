package com.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {


		LinkedList<String> n= new LinkedList<>();
		n.add("Pranav");
		n.add("Nilesh");
		n.add("Om");
		n.add("Omkar");
		n.add("Abhi");
		
		System.out.println(n);
		///insertion
		n.addFirst("Atharv");
		
		n.offerFirst("Atharv");
		
		
		System.out.println(n);
		//mid
		n.add(1, "Siddhant");
		System.out.println(n);
		
		//last 
		n.add("null");
		n.offer("null");
		n.addLast("Null");
		n.offerLast("Null");
		System.out.println(n);
		
		//deletion
		
		n.remove();
		n.poll();
		n.remove(0);
		n.removeFirst();
		System.out.println(n);
		
		
		//retrieve at head
		n.getFirst();
		n.peekFirst();
		n.element();
		n.peek();
		
		System.out.println(n);
		
		//mid
		
		n.get(3);
		n.peekLast();
		n.getLast();
		System.out.println(n);
		
		

	}

}
