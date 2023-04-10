package com.abstraction;

abstract public class Loan {
	private String name;
	private String loanType;
	private int loanId;
	
	public Loan()
	{
		System.out.println("default constr");
	}

	public Loan(String name, String loanType, int loanId)
	{
		this.name=name;
		this.loanType=loanType;
		this.loanId=loanId;
		
	}
	abstract float calcInterest(int Interest);
	abstract void checkValidity();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	@Override
	public String toString() {
		return "Loan [name=" + name + ", loanType=" + loanType + ", loanId=" + loanId + "]";
	}
	
	
	
}
