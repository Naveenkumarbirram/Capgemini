package Java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}
public class BiFunction_Lambda 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee>l=new ArrayList<Employee>();
		BiFunction<Integer,String,Employee> f=(id,name)->new Employee(id,name);
		l.add(f.apply(100,"Naveen"));
		l.add(f.apply(200,"Kumar"));
		l.add(f.apply(300,"Birram"));
		l.add(f.apply(400,"Asp"));
		for(Employee e:l)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println();
		}
		
	}

}
