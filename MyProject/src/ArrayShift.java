import java.util.*;

public class ArrayShift {


	public static void main(String []args)
	{
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	//O/p: 5,6,7,8,9,10,1,2,3,4
	int arr1[]=new int[10];
	for(int i=4,j=0;i<arr.length;i++,j++)
	{
		if(j<6)
		arr1[j]=arr[i];  
	}
	
	for(int i=0,j=6;i<4;i++,j++)
	{
		if(j>=6)	
		arr1[j]=arr[i];
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr1[i]);
	}
		
}
}		
		
		
		
		
		
		