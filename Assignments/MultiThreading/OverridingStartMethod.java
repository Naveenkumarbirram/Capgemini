package MultiThreading;

class start extends Thread
{
//	public void start()
//	{
//		System.out.println("Start Method");
//	}
	public void run()
	{
		System.out.println("Run Method");
	}
}
public class OverridingStartMethod 
{
	public static void main(String[] args)
	{
		start t=new start();
		t.start();
		System.out.println("Main method");
		t.run();
		t.start();
		
	}

}
