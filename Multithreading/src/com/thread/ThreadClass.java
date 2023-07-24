package com.thread;

public class ThreadClass extends Thread {

	public void run()
	{
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass t1=new ThreadClass();
		t1.start();
		
		ThreadClass t2=new ThreadClass();
		t2.start();

	}

}
