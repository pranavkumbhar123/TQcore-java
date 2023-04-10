package com.Switch;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many particepants for trip:");
		int p = sc.nextInt();
		System.out.println("Number of particepants are:"+p);
		
		switch (p)
		{
		case 4 : System.out.println("so, Let's arrange car");
				break;
		case 8 : System.out.println("so, Let's arrange Ertiga");
			break;
		case 15 : System.out.println("so, Lets, arrange Traveller");
			break;
		case 20 : System.out.println("so, Let's arrange mini bus");
				break;
		default : System.out.println("Invalid no of particepants");
		}
		
	}

}
