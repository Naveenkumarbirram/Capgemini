package Java8;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_lambda 
{
	public static void main(String[] args)
	{
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		System.out.println((int)Math.random()*10);
		
	}

}
