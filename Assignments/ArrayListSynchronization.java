package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronization 
{
	public static void main(String[] args)
	{
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("Russia");
		//Iterating on the array list
		synchronized(list) 
		{
			Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				//Once we iterate through CopyOnWriteArrayList we can't modify like add,remove
				//it throws unSupportedError
				//it.remove();
			}
		}


	}

}
