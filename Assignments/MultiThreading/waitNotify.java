package MultiThreading;

class ThreadA extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread starts calculation");
			for(int i=0;i<=10;i++)
			{
				total=total+1;
			}
			System.out.println("Child thread giving notification call");
			this.notify();
		}
	}

}
public class waitNotify
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadA a=new ThreadA();
		a.start();
		synchronized(a)
		{
			System.out.println("main Thread calling wait() method");//step-1
			a.wait();
			System.out.println("main Thread got notification call");//step-4
			System.out.println(a.total);
		}

	}

}
