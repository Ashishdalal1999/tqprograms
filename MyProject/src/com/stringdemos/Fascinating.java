package com.stringdemos;
import java.util.*;

public class Fascinating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int mul1=num;
		int mul2=num*2;
		int mul3=num*3;
		int count=0;
		int sum=0;
		String smul1=Integer.toString(mul1);
		String smul2=Integer.toString(mul2);
		String smul3=Integer.toString(mul3);
		String allnum=String.join("",smul1, smul2,smul3);
		System.out.println(allnum);
		char arr[]=allnum.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count=1;
					break;
				}
				else
				{
					count=0;
				}
			}
			if(count==1)
			{
				System.out.println("not a fascinating number");
				sum=sum+count;
				break;
			}
			else
			{
				sum=sum+count;
			}
			
		}
		if(sum==0)
		{
			System.out.println("Fascinating number");
		}
	}

}
