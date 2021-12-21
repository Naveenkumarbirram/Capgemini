package collections;

import java.util.ArrayList;
import java.util.List;

public class CopyList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> Names=new ArrayList<String>();
		Names.add("Naveen");
		Names.add("Kumar");
		Names.add("Birram");
		System.out.println(Names);
		List<String> list=new ArrayList<String>();
		System.out.println(list);
		list.add("Asupaka");
		list.add("Aspt");
		list.add("Hyd");
		System.out.println(list);
		Names.addAll(list);
		System.out.println(Names);
		
		
	}

}
