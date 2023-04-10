package com.encapsulation;

public class Book {
	public int bookId;
	public String bookname;
	public String author;
	public float price;
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
		
	}
	public int getBookId()
	{
		return bookId;
	}
	public void setBookname(String bookname)
	{
		this.bookname=bookname;
	}
	public String getBookname()
	{
		return bookname;
	}
	public void setAuthor(String author)
	{
		this.author=author;
		}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public float getPrice()
	{
		return price;
	}
	public String toString() {
		return "BookId:" +bookId+" Name:"+bookname+" Author:"+author+" Price:+"+price;
	}
}
