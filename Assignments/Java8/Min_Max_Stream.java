package Java8;
import java.util.ArrayList;
import java.util.function.*;
import java.util.List;
public class Min_Max_Stream 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		System.out.println(l);
		//Minimun value in the list
		//According to  acsending order
		int l1=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(l1);

		//Maximum value in the list
		//According to  acsending order
		int l2=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(l2);
		System.out.println();

		//Maximum value in the list
		//According to  Descending order
		int l3=l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(l3);
                
		//Maximum value in the list
		//According to  Descending order
		int l4=l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(l4);
		System.out.println();
		
		//To iterate each element in the list we don't need to write a for loop
		//ForEach in streams
		l.stream().forEach(System.out::println);
		System.out.println();
		
		// we can also use like this...
		Consumer<Integer>c=i->
		{
			System.out.println("The sqaure of "+i+" is "+i*i);
		};
		l.stream().forEach(c);
	}

}
