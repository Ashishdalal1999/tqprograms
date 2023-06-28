package com.stringdemos;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world welcome to java";
		String arr[]=s.split(" ");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			char arr1[]=arr[i].toCharArray();
			sum=arr1.length+sum;
		}
		System.out.println(sum);

	}

}
