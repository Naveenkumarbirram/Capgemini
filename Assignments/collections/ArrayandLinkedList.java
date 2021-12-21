package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayandLinkedList 
{
	public static void main(String[] args)
	{
		//Adding linked list object to the ArrayList
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Nagarjuna");
		arr.add("Chiru");
		arr.add("Balayya");
		arr.add("Balayya");
		LinkedList<String> arr1=new LinkedList<String>();
		arr1.add("Naga Chaithanya");
		arr1.add("Ram Charan");
		arr1.add("NTR");
		arr.addAll(arr1);
		arr.retainAll(arr1);
		System.out.println(arr);
		System.out.println(arr);
		//clear----->It removes all elements in the array
		arr1.clear();
		System.out.println(arr1);
		arr.clone();
		System.out.println(arr);
		//The index the first occurrence of a specific element is either returned,
		//or -1 in case the element is not in the list.
		System.out.println(arr.indexOf("Balayya"));//2
		System.out.println(arr.indexOf("Arjun"));//-1
		//isEmpty()----->returns true if it is empty
		System.out.println(arr1.isEmpty());//true
		System.out.println(arr.isEmpty());//false
		//lastIndexOf()----->The index of the last occurrence of a specific element is either returned
		//or -1 in case the element is not in the list.
		System.out.println(arr.lastIndexOf("Balayya"));//3
		System.out.println(arr1.lastIndexOf("Balayya"));//-1
		//listiterator----->iterate the elements present in the list
		System.out.println(arr.listIterator());
		//remove()---->Removes the element at the specified position in this list.
		System.out.println(arr.remove(1));//Chiru
		System.out.println(arr);//Except chiru all the elements will be print here
		//remove(Object o)---->Removes the first occurrence of the specified element from this list, if it is present.
		System.out.println(arr.remove("Balayya"));//true
		System.out.println(arr);//balayya will be removed
		//removeAll?(Collection c)	Removes from this list all of its 
		//elements that are contained in the specified collection.
		//arr.removeAll(arr);
		//System.out.println(arr);//Empty list
		//Replaces the element at the specified position 
		//in this list with the specified element.
		arr.set(0, "Ram");
		System.out.println(arr);
		//Size of the elements
		System.out.println(arr.size());
		//subList from index to toIndex
		System.out.println(arr.subList(0, 1));
	}
}
