package com.stringdemos;

class IncorrectLengthPasswordException extends Exception
{
	public IncorrectLengthPasswordException(String str1)
	{
		super(str1);
	}
}

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String str="Ashish";
			if(str.length()<8)
			{
			throw new IncorrectLengthPasswordException("Password length less than 8");
			}
			else
			{
				System.out.println(str);
			}
		}
		catch(IncorrectLengthPasswordException ex)
		{
			System.out.println("Exception occured: "+ex);
		}

	}

}
