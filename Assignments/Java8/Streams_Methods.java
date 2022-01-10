package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Methods 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(40);
		l.add(50);
		//Print list of elements in the array
		System.out.println(l);
		//Prinitng only even numbers from the list..
		//filter method...
		List<Integer>l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//map Method
		//If we wan't to add 5 to the each element in the array we go for map...
		List<Integer> marks=l.stream().map(i->i+5).collect(Collectors.toList());
		//5 added to the each element present in the list...
		System.out.println(marks);
		
		//If we wan't to print failed students from the list
		long no_Of_Failed_Students=l.stream().filter(m->m<35).count();
		System.out.println(no_Of_Failed_Students);//3
		
		//If we wan't to sort the list
		List<Integer> sorted_list=l.stream().sorted().collect(Collectors.toList());
		//List<Integer> sorted_list1=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sorted_list);
		
		//If we wan't to sort according to descending order
		//In sorted method its accepting comparator, so comoarator is a functional interface 
		//so we can use lambda expression
		//Comparable is always default sorting order--->compareTo()
		//Comparator is always customized sorting order----->compare()
		// SO we can use like this alsoo..
		//we can use either of these three...
		List<Integer> sorted_list2=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> sorted_list3=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		List<Integer> sorted_list1=l.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println(sorted_list3);
		
		
		
		
		
		
	}

}
