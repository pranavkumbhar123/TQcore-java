package com.innerclass;

class Mall
{
	private static String mallName="Pacific";
	private String loc="Pune";
	
	void doShopping()
	{
		class Cart
		{
			String item;
			float price;
			float totalBill=0.0f;
			
			public void addBill(String item,float price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item+" "+this.price);
				totalBill+=this.price;
				
			}
			
			public void displayBill()
			{
				System.out.println("=======================");
				System.out.println("Thanks for shopping at "+mallName);
				System.out.println("Total bill:"+totalBill);
			}
		}
		
		Cart c1=new Cart();
		c1.addBill("laptop", 50000);
		c1.addBill("pendrive", 500);
		c1.addBill("headphone", 2000);
		c1.displayBill();
		
	}
}

public class LocalInnerClass2 {

	public static void main(String[] args) {


		Mall m1=new Mall();
		m1.doShopping();
		

	}

}
