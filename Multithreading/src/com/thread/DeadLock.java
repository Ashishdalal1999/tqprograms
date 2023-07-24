package com.thread;

public class DeadLock {
	
	public static void main(String[] args) {
		
		final String s1="Java";
		final String s2="SQL";
		
		Thread t1= new Thread()
				{
			      public void run()
			      {
			    	  synchronized (s1) {
			    		  
			    		  System.out.println(Thread.currentThread().getName()+" has locked "+s1);
			    		  
			    		  try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  
			    		  
			    		  synchronized (s2) {
			    			  
			    			  System.out.println(Thread.currentThread().getName()+" has locked "+s2);
							
						}
			    		
						
					}
			    	  System.out.println(Thread.currentThread().getName()+" has released "+s1);
			    	  System.out.println(Thread.currentThread().getName()+" has released "+s2);
			    	  
			      }
			
				};
				
		Thread t2= new Thread()
				{
			      public void run()
			      {
			    	  synchronized (s2) {
			    		  
			    		  System.out.println(Thread.currentThread().getName()+" has locked "+s2);
			    		  
			    		  try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  
			    		  
			    		  synchronized (s1) {
			    			  
			    			  System.out.println(Thread.currentThread().getName()+" has locked "+s1);
							
						}
			    		
						
					}
			    	  System.out.println(Thread.currentThread().getName()+" has released "+s1);
			    	  System.out.println(Thread.currentThread().getName()+" has released "+s2);
			    	  
			      }
			
				};
				
		t1.start();
		t2.start();
		
	}

}
