package com.stringdemos;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[2];
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		int count;
		int count2=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
		for(int j=2;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				count=0;
				break;
			}
			else if(arr[i]%j!=0)
			{
				count=1;
			}
			
		}
		if(count==1)
		{
			count2++;
		}
		}
		if(count2==2)
		{
			if(arr[0]-arr[1]==2||arr[1]-arr[0]==2)
			{
				System.out.println("Twin prime");
			}
			else
			{
				System.out.println("Numbers are prime but not twin prime");
			}
		}
		else 
		{
			
			System.out.println("both numbers are not prime");
		}
	}
}
	