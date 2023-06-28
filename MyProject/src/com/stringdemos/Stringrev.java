package com.stringdemos;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is my country";
		char arr[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
