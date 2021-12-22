package MultiThreading;

public class SleepMethod 
{
	public static void main(String[] args)
	{
		
		//If we want to use sleep method we should throw an InterruptedException
		//we can use throw that exception usinf try-catch also...
		try{
			System.out.println("Naveen");
			Thread.sleep(2000);
			System.out.println("Kumar");
			Thread.sleep(2000);
			System.out.println("Birram");
			Thread.sleep(2000);
			System.out.println("Asupaka");
		}catch(InterruptedException e)
		{
			
		}
		
	}

}
