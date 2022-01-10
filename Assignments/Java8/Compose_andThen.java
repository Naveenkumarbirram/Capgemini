package Java8;

import java.util.function.Function;

public class Compose_andThen
{
	public static void main(String[] args) 
	{
		//Function chaining
		Function<Integer,Integer> f1=i->2*i;
		Function<Integer,Integer> f2=i->i*i*i;
		Function<Integer,Integer> f3=i->i*i;
		System.out.println(f1.andThen(f2).apply(2));//64
		System.out.println(f1.compose(f2).apply(2));//16
		//Function chaining
		System.out.println(f1.andThen(f2).andThen(f3).apply(2));//4096
	}
}
