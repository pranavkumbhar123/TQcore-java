package com.comparator;

public class Order {

	private int id;
	private String name;
	private float price;
	public Order()
	{
		
	}
	public Order(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public int compareTo(Order o)
	{
		if(this.price==o.price)
			return 0;
		else
			if(this.price<o.price)
				return 1;
			else
				return -1;
	}
	
}
