package com.customexception;

public class InsufficienBalanceException extends Exception {

	public InsufficienBalanceException()
	{
		
	}
	
	public InsufficienBalanceException(String msg)
	{
		super(msg);
	}
	
}
