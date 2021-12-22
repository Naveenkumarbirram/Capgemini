package MultiThreading;

class Display
{
	//if it is synchronized then it will print one object and after print 
	//another object
	//Otherwise it will print randomly...
	public synchronized void wish(String name)  
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println("Good Morning "+name);
			}	
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception raised");
		}	
	}
}
class MyThrow extends Thread
{
	Display d;
	String name;
	MyThrow(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Synchronization
{
	public static void main(String[] args) 
	{
		Display d1=new Display();
		MyThrow m=new MyThrow(d1,"Dhoni");
		MyThrow m1=new MyThrow(d1,"Yuvaraj");
		m.start();
		m1.start();
	}

}
