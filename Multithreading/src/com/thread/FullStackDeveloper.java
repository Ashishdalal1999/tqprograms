package com.thread;

import java.util.Arrays;

public class FullStackDeveloper implements Developer {

	@Override
	public void salaryPaid()
	{
		System.out.println("Salary is : rs."+100000);
	}
	
	@Override
	public void skills()
	{
		String arr[]= {"angular","JS"};
		System.out.println(Arrays.toString(arr));
		
	}
}
