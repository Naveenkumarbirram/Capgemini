package collections;

import java.util.ArrayList;

public class ArrayListinJava
{
	public static void main(String[] args) 
	{
		ArrayList<String> Names=new ArrayList<String>();
		//Adding objects to the arraylist
		Names.add("Naveen");
		Names.add("Kumar");
		Names.add("Birram");
		Names.add("Sai");
		System.out.println(Names);
		//Adding elements in a specified position
		Names.add(3, "Asupaka");
		System.out.println("After Adding Element: "+Names);
		//Removing element from the list
		Names.remove(2);
		System.out.println("After Removing element: "+Names);
		//Retrieving one element from the list
		Names.get(1);
		//Fetching all the elements from the list
		System.out.println("=======Fetching elements======");
		for(int i=0;i<Names.size();i++)
		{
			System.out.println(Names.get(i));
		}
		//Using for each loop
		System.out.println("=======For Each  Loop=======");
		for(String obj:Names)
		{
			System.out.println(obj);
		}
		
		
		
	}

}
