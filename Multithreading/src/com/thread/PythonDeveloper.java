package com.thread;

import java.util.Arrays;

public class PythonDeveloper implements Developer {

	@Override
	public void salaryPaid()
	{
		System.out.println("Salary is : rs."+20000);
	}
	
	@Override
	public void skills()
	{
		String arr[]= {"python","SQL"};
		System.out.println(Arrays.toString(arr));
		
	}
}
