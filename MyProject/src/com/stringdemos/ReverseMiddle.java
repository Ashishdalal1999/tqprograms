package com.stringdemos;

public class ReverseMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is my country";
		String arr[]=str.split(" ");
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length-1;i++)
		{
			char arr1[]=arr[i].toCharArray();
			for(int j=arr1.length-1;j>=0;j--)
			{
				System.out.print(arr1[j]);
			}
			System.out.print(" ");
		}
		System.out.print(arr[arr.length-1]);

	}

}
