package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> Names=new ArrayList<Integer>();
		Names.add(10);
		Names.add(20);
		Names.add(30);
		Names.add(40);
		System.out.println("Array List elements: "+Names);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("List without adding elements: "+list);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("List adding after elements: "+list);
		Names.addAll(list);
		System.out.println("After copying: "+Names);
		//copying list at specified index
		Names.addAll(2, list);
		System.out.println("List at specified index: "+Names);
		//removing specified element from the list
		Names.remove(0);
		System.out.println("After Removing elements: "+Names);
	
		
	}

}
