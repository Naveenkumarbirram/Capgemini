package Java8;

public class Method_Reference 
{
	public static  void m1()//public void run();
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Method-1");
		}
	}
	public static void main(String []args)
	{
		/* Refencing already devoloped method to the Lambda
		 * If method is not static follow this one...
		 * Method_Reference v=new Method_Reference();
		 * Runnable r=v::m1;
		 * If method is static we can directlu refernce that method with class name
		 * Here we  wan't to excute Runnable interface run(),but we have alredy 
		 * devoloped one method is there-->m1()
		 * Soo we can refer this m1() method to our run() method
		 * Here we can decrease the lines code.*/
		Runnable r=Method_Reference::m1;
		Thread t=new Thread(r);
		//In the case of method reference the arguments must be same in already devoloped 
		//method--->m1() and we are referring method---> run()
		//It never talks about return type, modifier etc.,
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Method-1");
		}
	}

}
