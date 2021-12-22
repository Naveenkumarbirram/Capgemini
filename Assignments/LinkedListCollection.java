package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Bangalore");
		list.add("Hyd");
		list.add("Mumbai");
		System.out.println(list);
		System.out.println(list.subList(0, 2));
		for(int i=0;i<list.size();i++)
		{
			if(i%2==0)
			{
				System.out.println(list.get(i));
			}
		}
		//Add elements at first position
		list.addFirst("Delhi");
		System.out.println(list);
		//Add elements at last position
		list.addLast("Chennai");
		System.out.println(list);
		//Add elements at specified position
		list.add(2, "Gurugram");
		System.out.println(list);
		//Iterating linked list
		System.out.println("==========================");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("===========================");
		//Iterating using for loop
		for(String e:list)
		{
			System.out.println(e);
		}
		
		
	}

}
