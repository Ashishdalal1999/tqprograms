package com.thread;



class Message1
{
	public static void processMessage (String msg) throws InterruptedException
	{
		System.out.println("sending: "+msg);
		Thread.sleep(300);
		System.out.println("Received: "+msg);
		
	}
}
public class Threadstatic {

	public static void main(String[] args) {
		Message1 mt= new Message1();
		Message1 mt1=new Message1();
		Thread t1= new Thread()
				{
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+"....has started");
				synchronized(mt)
				{
					try {
						mt.processMessage("Welcome");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
				};
				Thread t2= new Thread()
						{
					public void run()
					{
						System.out.println(Thread.currentThread().getName()+"....has started");
						synchronized(mt)
						{
							try {
								mt1.processMessage("Hello");
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
						};
						t1.start();
						t2.start();
	}
	
}