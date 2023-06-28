package com.stringdemos;

public class StringVowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		char arr[]=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
