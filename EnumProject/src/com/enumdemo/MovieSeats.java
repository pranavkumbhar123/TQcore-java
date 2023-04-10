package com.enumdemo;

public enum MovieSeats {

	STANDARDS(200),PREMIUM(300),RECLINER(400);
	
	int price;
	
	private MovieSeats(int price)
	{
		this.price=price;
	}
}
