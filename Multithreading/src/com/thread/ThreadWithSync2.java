package com.thread;

class MyTable2
{
	public synchronized void printTable(int n) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			Thread.sleep(500);
		}
	}
}
public class ThreadWithSync2 {

	public static void main(String[] args) {
		MyTable2 mt= new MyTable2();
		Thread t1= new Thread()
				{
			public void run()
			{
				try
				{
				mt.printTable(2);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
				};
				Thread t2= new Thread()
						{
					public void run()
					{
						try
						{
						mt.printTable(50);
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					}
						};
						t1.start();
						t2.start();
	}
	
}