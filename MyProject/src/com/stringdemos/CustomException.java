package com.stringdemos;

class Exceptionex
{
	
}

public class CustomException {

	static void checkInspection()
	{
		try
		{
			throw new NullPointerException("yes");
		}
		catch(NullPointerException e)
		{
			System.out.println("caught");
			throw e;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			checkInspection();
		}
		catch(NullPointerException e)
		{
			System.out.println("done");
		}
	}

}
