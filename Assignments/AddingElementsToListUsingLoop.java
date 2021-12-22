package collections;
import java.util.*;

public class AddingElementsToListUsingLoop 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>(3);
		numbers.add(10);
		numbers.add(20);
		numbers.add(13);
		numbers.add(05);
		System.out.println("Before sorting");
		System.out.println(numbers);
		System.out.println("After Sorting");
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("Sorting in reverse");
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println(numbers);
		//System.out.println(System.currentTimeMillis());
		
		
	}

}
