package com.stringdemos;

public class StringSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="my pet name is snowbell";
		String str2="aeiou";
		char arr[]=str2.toCharArray();
		for(int i=0;i<str2.length();i++)
		{
		str1=str1.replace(arr[i], '\0');
		}
		System.out.println(str1);
		
	}

}
