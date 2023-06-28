package com.stringdemos;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr1[]= {'a','b','c','d'};
		char arr2[]=  {'e','f','g','h'};
		char arr3[]=new char[8];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[i+(arr1.length)]=arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}

}
