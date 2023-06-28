package com.stringdemos;

import java.util.Arrays;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"red","yellow","green","blue"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i].charAt(0)<arr[j].charAt(0))
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
