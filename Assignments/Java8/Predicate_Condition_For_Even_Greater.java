package Java8;

import java.util.function.Predicate;

public class Predicate_Condition_For_Even_Greater 
{
	public static void main(String[] args)
	{
		int[] x= {0,5,10,15,20,25,30,35,40};
		//cheching the numbers are even or not
		Predicate<Integer> p1=i->i%2==0;
		//checking the number is greater than 15 or not
		Predicate<Integer> p2=i->i>15;
		//Iterating each element in the list
		for(int x1:x)
		{
			//checking the condition for predicates...
			//p1.or(p2).test(x1)  ----->either of the condition
			//p1.negate().test(x1)----->Only numbers which are not even
			if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			}
		}	
	}
}
