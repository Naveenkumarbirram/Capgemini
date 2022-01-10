package Java8;

import java.util.stream.Stream;

public class StreamOf
{
	public static void main(String[] args) 
	{
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		 
		Integer[] arr= {1,2,3,4,4,5};
		Stream.of(arr).forEach(System.out::println);
		//Once the collection is converted into stream we can perform all the 
		//methods which are applicable for stream is applicable to that collection...
		//count,filter,map,sorted,max,min,toArray etc.,
	}

}
