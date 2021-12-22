package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySwaping 
{
	public static void main(String[] args) 
	{
		ArrayList<String> Names=new ArrayList<String>();
		Names.add("Sachin");
		Names.add("Naveen");//Swap with Dhoni
		Names.add("Kumar");
		Names.add("Yuvi");
		Names.add("Kohli");
		Names.add("Dhoni");//Swap with Naveen
		for(String temp:Names)
		{
			System.out.println(temp);
		}
		System.out.println("=======================");
		Collections.swap(Names, 5,1);
		for(String temp:Names)
		{
			System.out.println(temp);
		}
		

	}

}
