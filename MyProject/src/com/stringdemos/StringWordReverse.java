package com.stringdemos;

public class StringWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		String arr[]=s.split(" ");
		char arr1[]=arr[0].toCharArray();
		char arr2[]=arr[1].toCharArray();
		System.out.println(arr[1].length());
		for(int j=arr[0].length()-1;j>=0;j--)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}

}
