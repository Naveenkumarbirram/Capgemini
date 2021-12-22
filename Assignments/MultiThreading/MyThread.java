package MultiThreading;

class Multi extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child thread");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
public class MyThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		Multi t=new Multi();//Instantiation of a Thread
		t.start();//starting of a Thread
		//			t.interrupt();
		//			System.out.println("hlooo");
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
			t.sleep(1000);
			//t.start();IllegalthreadstateException
		}
	}


}
