package MultiThreading;

class ThreadDemo extends Thread 
{
}
class ChangingThreadName
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());//main
		ThreadDemo t=new ThreadDemo();
		ThreadDemo t1=new ThreadDemo();
		System.out.println(t.getName());//Thread-0
		System.out.println(t1.getName());//Thread-1
		Thread.currentThread().setName("Bhaskar Thread");
		System.out.println(Thread.currentThread().getName());//Bhaskar Thread
		Thread.currentThread().setName("Naveen Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		//Thread thread = new Thread();
		System.out.println(t.getPriority());

	}
}
