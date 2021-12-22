package MultiThreading;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			Thread.yield();
			System.out.println("Child Method");
		}
	}	
}
public class YieldDemo {
	public static void main(String[] args) {
		Mythread t=new Mythread();
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Method");
		}
		
	}

}
