class MyThread extends Thread
{
	String name;
	public  MyThread(String threadname)
	{
		
		 name = threadname;
		
		
		
		System.out.println("Thread Details : "+ this);
	}
	
	public void run ()
	{
		try
		{	
			for(int i = 5; i>0; i--)
			{
				System.out.println(name + ":" + i);
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + "Exit");
	}
}

class Threads
{
	public static void main(String [] args)
	{
		MyThread th = new MyThread("One");
		MyThread rh = new MyThread("Two");
		MyThread yh = new MyThread("Three");
		th.start();
		rh.start();
		yh.start();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}	
