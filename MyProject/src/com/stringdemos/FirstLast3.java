package com.stringdemos;

public class FirstLast3 {

	public Boolean checkReverseSum(String str)
	{
		Boolean result;
		if(str.length()>2)
		{
		char arr[]=str.toCharArray();
		int sum1=0,sum2=0;
		for(int i=0;i<3;i++)
		{
		sum1=Character.getNumericValue(arr[i])+sum1;
		}
		for(int i=arr.length-3;i<arr.length;i++)
		{
			sum2=Character.getNumericValue(arr[i])+sum2;
		}
		if(sum1==sum2)
		{
			result=true;
		}
		else
			result=false;
		}
		else result=false;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		FirstLast3 fl=new FirstLast3();
		System.out.println(fl.checkReverseSum(str));

	}

}
