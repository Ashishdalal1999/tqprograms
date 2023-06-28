package com.stringdemos;
import java.util.*;

public class AlternativeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c','d','e'};
		int arr1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
			arr1[i]=arr1[i]+2;
			arr[i]=(char)arr1[i];
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
