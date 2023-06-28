package com.stringdemos;

public class Stringpatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India is my country";
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='i'||arr[i]=='I')
			{
				arr[i]='@';
			}
		}
		str=new String(arr);
		String arr1[]=str.split(" ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr1[j]+" ");
			}
			System.out.println();
		}

	}

}
