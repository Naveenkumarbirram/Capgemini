package MultiThreading;

class Child extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Method");
		}
	}
}
public class PriorityThread 
{
	public static void main(String[] args)
	{
		//current thread priority
		System.out.println(Thread.currentThread().getPriority());
		//creating object for child class
		Child c=new Child();
		//set priority for child class
		c.setPriority(10);
		//set priority for main class
		Thread.currentThread().setPriority(1);
		//printing current thread priority
		System.out.println(Thread.currentThread().getPriority());
		//printing child class priority
		System.out.println(c.getPriority());
		//calling start method
		c.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Method");
		}
		
	}

}
