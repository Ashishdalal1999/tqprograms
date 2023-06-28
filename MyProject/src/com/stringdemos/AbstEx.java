package com.stringdemos;

abstract class Car
{
	abstract void Car();
}
class Honda extends Car
{
	void Car()
	{
		System.out.println("hello");
	}
}


public class AbstEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h=new Honda();
		h.Car();
		
	
	}

}
