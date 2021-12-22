package MultiThreading;

class Join extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{

			try {
				Thread.sleep(1000);
				System.out.println("Join Method");
			}
			catch(InterruptedException e) {

			}
		}
	}

}
public class JoinMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		Join j=new Join();
		//Thread.currentThread().setPriority(10);
		//j.currentThread().setPriority(1);
		j.start();
		//It will excute the join method first after mani method will excute
		//If we want to call join or sleep methods we should throw InterruptedException
		j.join();
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(400);
			System.out.println("Main Method");
		}


	}

}
