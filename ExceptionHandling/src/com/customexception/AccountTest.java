package com.customexception;

class Account
{
	private int id;
	private String name;
	private float balance;
	
	public Account()
	{
		
	}
	public Account(int id,String name,float balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
		
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
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	void deposit(float amount)
	{
		this.balance+=amount;
		System.out.println("Amount deposited:"+amount);
		System.out.println("Current balance:"+this.balance);
	}
	void withdraw(float amount)
	{
		if(this.balance-amount<0)
			throw new InsufficienBalanceException("Balance is to low");
		else
		{
			this.balance-=amount;
			
			System.out.println("Amount withdraw:"+amount);
			System.out.println("Current balance:"+this.balance);
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class AccountTest {


	public static void main(String agrs[])
	{
		Account a1=new Account();
		a1.setId(1001);
		a1.setName("pranav");
		a1.setBalance(201910f);
		
		a1.deposit(100);
		a1.withdraw(200);
	}
	
}
