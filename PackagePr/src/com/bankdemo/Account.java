package com.bankdemo;

public class Account {

	private int accNumber;
	private String accName;
	private float balance;
	private String bankName;
	private String panCard;
	//default constructor
	Account()
	{
		
	}
	Account(int accNumber,String accName,String bankName){
	System.out.println("Constructor 1");
		this.accName=accName;
		this.accNumber=accNumber;
		this.bankName=bankName;
	}
	//param constructor
	Account(int accNumber,String accName, String bankName,float balance)
	{
		this(accNumber, accName, bankName);
		System.out.println("Constructor 2");
		this.balance=balance;
	}
	public void setAccNumber(int accNumber)
	{
		this.accNumber=accNumber;
	}
	public int getAccNumber()
	{
		return accNumber;
	}
	public void setAccName(String accName)
	{
		this.accName=accName;
	}
	public String getAccName()
	{
		return accName;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	public String getBankName()
	{
		return bankName;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setPanCard(String panCard)
	{
		this.panCard=panCard;
	}
	public String getPanCard()
	{
		return panCard;
	}
	void display()
	{
		System.out.println(accNumber+" "+accName+" "+bankName+" "+balance);
	}
	public String toString()
	{
		return accNumber+" "+accName+" "+bankName+" "+balance;
	}
	void deposit(float amount)
	{
		this.balance=balance+amount;
		System.out.println("updated balance:"+balance);
	}
	void deposit(float amount, String panCard)
	{
		this.balance=balance+amount;
		this.setPanCard(panCard);
		System.out.println("updated balance"+balance);
	}
	
	
}

