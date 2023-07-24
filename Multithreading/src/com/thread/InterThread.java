package com.thread;


class SharedR
{
   public synchronized void methodOne() throws InterruptedException
   {
	   System.out.println(Thread.currentThread().getName()+ " has locked one");
	   System.out.println(Thread.currentThread().getName()+" released one");
	   wait();
	   
	   System.out.println(Thread.currentThread().getName()+" has finished");
	   
   }
   
   public synchronized void methodTwo() throws InterruptedException
   {
	   Thread.sleep(500);
	   notify();
	   System.out.println(Thread.currentThread().getName()+" has notified");
	   
   }

}

public class InterThread {
	
	
	public static void main(String[] args) {
		
		SharedR r= new SharedR();
		
		new Thread()
		{
			public void run()
			{
				try {
					r.methodOne();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
	
		
		new Thread()
		{
			public void run()
			{
				try {
					r.methodTwo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
		
	}

}
