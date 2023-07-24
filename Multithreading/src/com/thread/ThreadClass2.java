package com.thread;

public class ThreadClass2 extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running");
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass2 t1=new ThreadClass2();
		t1.setName("thread 1");
		t1.setPriority(1);
		t1.start();
		
		ThreadClass2 t2=new ThreadClass2();
		t2.setName("thread 2");
		t2.setPriority(2);
		t2.start();

	}

}
