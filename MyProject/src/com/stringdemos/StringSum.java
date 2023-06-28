package com.stringdemos;
import java.util.*;

public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="2235322";
		if(str.length()>6)
		{
		char arr[]=str.toCharArray();
		int arr1[]=new int[7];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		int sum1=arr1[0]+arr1[1]+arr1[2];
		int sum2=arr1[arr.length-1]+arr1[arr.length-2]+arr1[arr.length-3];
		if(sum1==sum2)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		}
		else
		{
			System.out.println("Enter more than 6 numbers");
		}
		
		
	}

}
