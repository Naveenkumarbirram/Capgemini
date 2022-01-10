package Java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Primitive_Versions
{
	public static void main(String[] args)
	{
		//Primitive version of Predicate
		IntPredicate p=i->i%2==0;
		System.out.println(p.test(10));//100
		
		//Primitive version of Function
		IntFunction<Integer> f=i->i*i;
		System.out.println(f.apply(5));//25
		
		//Primitive version of Function with another method
		ToIntFunction<Integer> f1=i->i*i;
		System.out.println(f1.applyAsInt(4));//16
		
		//double as input and int as retrun type for Function
		IntToDoubleFunction f2=i->i*i;
		System.out.println(f2.applyAsDouble(12));//144.0
		
		//For function input and return type is same then we can go for
		UnaryOperator<Integer> u=i->i*i;
		System.out.println(u.apply(13));//169
		
		//If we don't want to convert Integer to Int we can go for
		//And method name also will changed to applyAsInt
		//For long and double also same
		IntUnaryOperator u1=i->i*i;
		System.out.println(u1.applyAsInt(9));//81
		
		//For Binary Operator same---->BiFunction
		BiFunction<String,String,String> b=(s1,s2)->s1+s2;
		System.out.println(b.apply("Naveen","Kumar"));//Naveenkumar
		//Instead of taking three arguments we can use directly binary Operator
		BinaryOperator<String> b1=(s1,s2)->s1+s1;
		System.out.println(b1.apply("Naveen","Naveen"));//NaveenNaveen
		
		//Directly without using <Integer> we can use...like this...
		IntBinaryOperator b2=(s1,s2)->s1+s2;
		System.out.println(b2.applyAsInt(10,20));//30
		IntBinaryOperator b3=(s1,s2)->s1*s2;
		System.out.println(b3.applyAsInt(10,20));//200
		
		System.out.println();
		
		
		
		
		
		
		
	}
}
