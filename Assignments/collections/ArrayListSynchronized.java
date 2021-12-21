package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized
{
	public static void main(String[] args) 
	{
		//ArrayList<String> arr=(ArrayList<String>)Collections.synchronizedList(new ArrayList<String>());

		List<String> arr1=Collections.synchronizedList(new ArrayList<String>());
		arr1.add("Mobile");
		arr1.add("Laptop");
		arr1.add("Desktop");
		synchronized(arr1)
		{
			Iterator iterator=arr1.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			//we can iterate by for each loop
			//	    	for(String a:arr1)
			//	    	{
			//	    		System.out.println(a);
			//	    	}
			//We can iterate by for loop
			//			for(int i=0;i<arr1.size();i++)
			//			{
			//				System.out.println(arr1.get(i));
			//			}

		}
	}

}
