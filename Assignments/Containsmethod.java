package collections;

import java.util.ArrayList;

public class Containsmethod 
{
	public static void main(String[] args)
	{
		ArrayList<String> Names=new ArrayList<String>();
		Names.add("Naveen");
		Names.add("Kumar");
		Names.add("Birram");
		Names.add("Aspk");
		ArrayList<String> Names1=new ArrayList<String>();
		Names1.add("Naveen");
		Names1.add("Kumar");
		Names1.add("Birram");
		Names1.add("Hyd");
		ArrayList<String> New_Array=new ArrayList<String>();
		//checking elements contained in both the list 
		for(String temp:Names1)
		{
			New_Array.add(Names.contains(temp)?temp:"No");
		}
		System.out.println(New_Array);
		
		
		
		
		
	}

}
