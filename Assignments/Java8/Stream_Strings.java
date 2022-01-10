package Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Strings 
{
	public static void main(String[] args) 
	{
		ArrayList<String> Names=new ArrayList<String>();
		Names.add("Prabhas");
		Names.add("Anushka Shetty");
		Names.add("Chiranjeevi");
		Names.add("Ram Charan");
		Names.add("Thamanna");
		Names.add("Pooja Hegde");
		Names.add("Nooja Hegde");
		System.out.println(Names);
		
		//Sort the above names according to their names length
		 Comparator<String> c=(s1,s2)->
		 {
			 int l1=s1.length();
			 int l2=s2.length();
			 if(l1<l2) return -1;
			 else if(l1>l2) return 1;
			 else return s1.compareTo(s2);//this is for is names are duplicate just compare with each other based on alphabetiacl order	 
		 };
		 //So for that we need to write a stream 
		 List<String> Updated_Names=Names.stream().sorted(c).collect(Collectors.toList());
		 System.out.println(Updated_Names);
		
		
	}

}
