package com.stringdemos;

public class Primesum {

	/*public int isprime(int num)
	{
		int res=0;
		return res;
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime;
		int n=15;
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
		for(int j=2;j<=i/2;j++)
		{

			flag=true;
			if(i%j==0)
			{
				System.out.println(i+"not prime");
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(i+"prime");
		}
		}
		
		
	}

}
