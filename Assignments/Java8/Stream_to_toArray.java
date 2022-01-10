package Java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_to_toArray
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
		 //To convert stream objects into array		
		Integer[] i=l.stream().toArray(Integer[]::new);
		for(Integer i1:i)
		{
			System.out.println(i1);
		}
		
		//To iterate above objects in a array we can use like this aslo..
		//First we need to convert Integer into Stream
		System.out.println();
		Stream.of(i).forEach(System.out::println);
		
	}
}
