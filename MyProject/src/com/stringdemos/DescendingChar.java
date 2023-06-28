package com.stringdemos;

public class DescendingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c','d','e'};
		int arr1[]=new int[5];
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println((char)arr1[i]);
		}
	}

}
