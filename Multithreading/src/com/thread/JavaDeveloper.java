package com.thread;

import java.util.Arrays;

public class JavaDeveloper implements Developer {

	@Override
	public void salaryPaid()
	{
		System.out.println("Salary is : rs."+50000);
	}
	
	@Override
	public void skills()
	{
		String arr[]= {"corejava","SQL"};
		System.out.println(Arrays.toString(arr));
		
	}
}
