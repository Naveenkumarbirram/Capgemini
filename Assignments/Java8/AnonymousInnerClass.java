package Java8;

public class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		//Anonymous inner class basically we can't create object for runnable
		//because of its a Interface
		//without implementing Runnable interface into a class and create an object
		//we can take like this also...
		Runnable r=new Runnable()
		{
			public void run()
			{
				for(int i=0;i<=10;i++)
				{
					System.out.println("Child class");
				}
			}

		};
		
		//Runnable is a Functional interface so we can implement lambda expression
		//Instead of above we can implement lambda like this...
		Runnable r1=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Its lambda");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main class");
		}
		//So we need to call that lambda method
		//internally run() will excute when we call start method
		Thread t1=new Thread(r1);
		t1.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main class for lambda");
		}
		
	}

}
