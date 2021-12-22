package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> Map=new HashMap<Integer,String>();
		Map.put(2,"Naveen");
		Map.put(3,"Kumar");
		Map.put(1,"Birram");
		Map.put(8,"Hyd");
		System.out.println(Map);
		//ArrayList<String> li=new ArrayList<String>();
		//li.add(Map)
		Set values=Map.entrySet();
		Iterator it=values.iterator();
		while(it.hasNext())
		{
			Map.Entry mm=(Map.Entry)it.next();
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		//		System.out.println(Map.get(1));//Naveen
		//		System.out.println(Map.remove(3));//Birram
		//		System.out.println(Map);
		//		System.out.println(Map.size());//3
		//		//System.out.println(Map.remove(1));
		//		Map.clear();
		//		System.out.println(Map);//{}
		//		//sorting the hashmap
		//		
		//checking whether key is present or not
		System.out.println(Map.containsKey(3));//true
		//checking whether value is present or not
		System.out.println(Map.containsValue("Heyd"));//false


	}

}
