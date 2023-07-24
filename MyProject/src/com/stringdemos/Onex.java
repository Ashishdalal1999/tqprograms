package com.stringdemos;

public class Onex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("OneXtel");
			}
			else if(i%3==0)
			{
				System.out.println("OneX");
			}
			else if(i%5==0)
			{
				System.out.println("Tel");
			}
			else
			{
				System.out.println(i);
			}
			
			
		}

	}

}
