package com.stringdemos;

public class StringLengthDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is our country";
		String arr[]=str.split(" ");
		String temp;
		int length=arr.length;
		int greatest=arr[0].length();
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i].length()<arr[j].length())
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
