package com.thread;

class Account1
{
   int amount=1000;
   
   public synchronized void withdraw(int amount)
   {
	   System.out.println(Thread.currentThread().getName()+"Going to withdraw:"+amount);
	   
	   if((this.amount-amount)<100)
	   {
		 System.out.println("Insufficient Balance:"+this.amount);
		 System.out.println(Thread.currentThread().getName()+" is waiting for deposit");
		   try {
			wait();
		    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		 		 
			 withdraw(amount);
 		 
	   }
	   else
	   {
		   this.amount=this.amount-amount;
		   System.out.println("Withdrawal successfull:"+amount);
		   System.out.println("Balance left:"+this.amount);
	   }
	   
   }

   
   public synchronized void deposit(int amount)
   {
	   try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   this.amount=this.amount+amount;
	   System.out.println(Thread.currentThread().getName()+" has deposited:"+amount);
	   System.out.println("Balance:"+this.amount);
	   notifyAll();
   }

}

public class AccountInterThreadComm2 {
	
	
	public static void main(String[] args) {
		
		
		Account1 a1= new Account1();
		
		Thread son = new Thread()
				{
			       public void run()
			       {
			    	   a1.withdraw(2000);
			       }
			
				};
		
	    son.setName("Son");
	    
	    Thread daughter = new Thread()
		{
	       public void run()
	       {
	    	   a1.withdraw(1000);
	       }
	
		};

     daughter.setName("Daughter");
		
		Thread father = new Thread()
		{
	       public void run()
	       {
	    	   a1.deposit(1000);
	       }
	
		};
		
		
		
		father.setName("Father");
		
		Thread mother = new Thread()
		{
	       public void run()
	       {
	    	   a1.deposit(2500);
	       }
	
		};

		mother.setName("Mother");
      son.start();
      daughter.start();
      father.start();
	  mother.start();	
	}
	
	
	
	
	
	
	
	

}
