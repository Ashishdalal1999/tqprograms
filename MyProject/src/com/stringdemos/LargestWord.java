package com.stringdemos;

public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I like programming";
		String arr[]=str.split(" ");
		int greatest=arr[0].length();
		String last=new String();
		for(int i=0;i<arr.length;i++)
		{
				
			if(arr[i].length()>greatest)
			{
				greatest=arr[i].length();
				last=arr[i];
			}
				
		}
		System.out.println(last);
		
	}

}
