package com.stringdemos;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java programs";
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]=='a')
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(i);
				break;
			}
			
		}
	
	}

}
