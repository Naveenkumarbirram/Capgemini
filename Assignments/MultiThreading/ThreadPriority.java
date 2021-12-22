package MultiThreading;

class Priority extends Thread
{	
}
public class ThreadPriority 
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(10);
		Priority p=new Priority();
		//System.out.println(p.currentThread());
		System.out.println(p.getPriority());//9

		
	}

}
