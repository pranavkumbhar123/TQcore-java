package com.innerclass;

class Bank
{
	private static String bankName="SBI";
	String bankLoc;
	int regNo;
	
	{
		bankLoc="Delhi";
		regNo=1234;
		
	}
	
	void displayBank()
	{
		 System.out.println(bankName+" "+bankLoc+" "+regNo);
	}
	
	class Locker
	{
		int lockerId;
		String custName;
		static int LockerRent=2000;
		
		void enterDetails(int lockerId, String custName)
		{
			this.lockerId=lockerId;
			this.custName=custName;
			
			System.out.println("This locker belongs to "+custName+" with id "+lockerId+" in "+bankName);
			displayBank();
			
			System.out.println("Pay locker rent:"+LockerRent);
		}
	}
	
}
public class MemberInnerClass {

	public static void main(String[] args) {

		//1st
		
		Bank b1=new Bank();
		
		b1.displayBank();
		
		Bank.Locker lock1=b1.new Locker();
		lock1.enterDetails(101,"pranav");
		
		//2nd
		
		System.out.println("===========");
		
		Bank.Locker lock2=new Bank().new Locker();
		
		lock2.enterDetails(102, "nilesh");

		

	}

}
