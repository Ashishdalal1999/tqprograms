package com.stringdemos;

class Invalidnumber extends Exception
{
	public Invalidnumber(String st)
	{
		super(st);
	}
}

public class TestCustom {

	static void validate(int num) throws Invalidnumber
	{
		if(num<0)
		{
			throw new Invalidnumber("number is not valid");
		}
		else
		{
			System.out.println("number is okay");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(-10);
		}
		catch (Invalidnumber ex)
		{
			System.out.println("caught");
		}
	}

}
