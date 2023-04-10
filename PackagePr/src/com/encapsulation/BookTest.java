package com.encapsulation;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Book b1= new Book();
		
		System.out.println("enter book id");
		b1.setBookId(sc.nextInt());
		
		System.out.println("enter bookname");
		b1.setBookname(sc.next());
		
		System.out.println("enter author");
		b1.setAuthor(sc.next());
		
		System.out.println("enter price");
		b1.setPrice(sc.nextInt());
		
		System.out.println(b1.getBookId()+" "+b1.getBookname()+" "+b1.getAuthor()+" "+b1.getPrice());
			
		
		
		
		

	}

}
