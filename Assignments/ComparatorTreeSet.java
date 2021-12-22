package collections;

import java.util.TreeSet;

public class ComparatorTreeSet
{
	public static void main(String[] args) 
	{
		MyComparator n=new MyComparator();
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(13);
		t.add(40);
		t.add(5);
		System.out.println(t);	
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return 0;
	}
	
}
