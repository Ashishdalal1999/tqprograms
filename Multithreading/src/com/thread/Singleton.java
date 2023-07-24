package com.thread;

public class Singleton {
	
	
	private static Singleton sobj= new Singleton(); 
	
	public String msg;
	
	private Singleton()
	{
		msg="Welcome to java";
	}
	
	public static Singleton getInstance()
	{
		if(sobj==null)
			sobj=new Singleton();
		
		return sobj;
	}
	

	public static void main(String[] args) {
		
		
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		Singleton s3= Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
		
		s1.msg="Hello Everyone";
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);

 
	}

}

