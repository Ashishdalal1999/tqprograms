package com.stringdemos;

class Book
{
	private int id;
	private String book_name;
	private int price;
	
	void setdetails(int id,String book_name,int price)
	{
		this.id=id;
		this.book_name=book_name;
		this.price=price;
	}
	void getdetails()
	{
		System.out.println(id);
		System.out.println(book_name);
		if(book_name.equals("java"))
		{
			int disc=(price*10)/100;
			System.out.println(price-disc);
		}
		else
		{
			System.out.println(price);
		}
	}
}

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setdetails(1, "java", 500);
		b.getdetails();
	}

}
