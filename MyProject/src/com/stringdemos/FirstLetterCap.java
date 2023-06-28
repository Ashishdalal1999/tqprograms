package com.stringdemos;

public class FirstLetterCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr="india is my country";
		String arr1[]=arr.split(" ");
		for(int i=0;i<arr1.length;i++)
		{
			char arr2[]=arr1[i].toCharArray();
			for(int j=0;j<arr2.length;j++)
			{
				if(j==0)
				{
					arr2[j]=Character.toUpperCase(arr2[j]);
				}
				System.out.print(arr2[j]);
				
			}
			System.out.print(" ");
		}
		

	}

}
