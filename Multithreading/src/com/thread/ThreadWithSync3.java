package com.thread;



class Message
{
	public void processMessage (String msg) throws InterruptedException
	{
		System.out.println("sending: "+msg);
		Thread.sleep(300);
		System.out.println("Received: "+msg);
		
	}
}
public class ThreadWithSync3 {

	public static void main(String[] args) {
		Message mt= new Message();
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
								mt.processMessage("Hello");
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