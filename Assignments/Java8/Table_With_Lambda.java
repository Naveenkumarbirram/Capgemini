package Java8;

import java.util.function.Function;
import java.util.function.Predicate;


public class Table_With_Lambda 
{
//	 i->
//	{
//		for(int j=1;j<=10;j++)
//		{
//			System.out.println(2*j);
//		}
//	}
	public static void main(String[] args) 
	{
		Function<Integer,Integer> p =i->2*i;
		for(int i=1;i<=10;i++)
		{
			System.out.println("2 * "+i+" = "+p.apply(i));
		}

			
			
	
	
		//return p.test(2);
		//table(2);
		
		
	}

}
