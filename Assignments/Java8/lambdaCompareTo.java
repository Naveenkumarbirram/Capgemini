package Java8;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
class Employee
{
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return 0;
//	}
	
	
}
public class lambdaCompareTo 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee(123,"Naveen"));
		arr.add(new Employee(123,"kumar"));
		arr.add(new Employee(524,"Birram"));
		arr.add(new Employee(113,"Aspk"));
		Collections.sort(arr,(a,b)->(a.name.compareTo(b.name)));
		Collections.sort(arr,(a,b)->(a.id>b.id?1:a.id<b.id?-1:0));
		System.out.println(arr);
		
	}
   
}
