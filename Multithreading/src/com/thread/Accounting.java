package com.thread;

class Producting
{
	int numberofitems=10;
	
	public synchronized void produce(int numberofitems)
	{
		this.numberofitems=this.numberofitems+numberofitems;
		System.out.println(Thread.currentThread().getName()+"show number of items"+numberofitems);
		notify();
	
	}
	
	public synchronized void consume(int numberofitems)
	{
		if((this.numberofitems-numberofitems)<10)
		{
			System.out.println("insufficient items"+this.numberofitems);
			System.out.println(Thread.currentThread().getName()+"is waiting for produce");
			
		}
		else
		{
			this.numberofitems=this.numberofitems-numberofitems;
			System.out.println("consume successful"+numberofitems);
		}
	}
}


public class Accounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producting p=new Producting();
		
		
		
		
	}

}
