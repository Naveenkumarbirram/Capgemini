package Java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp
{
	String name;
	double salary;
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}
public class BiConsumer_Lambda 
{
	public static void main(String[] args)
	{
		ArrayList<Emp>l=new ArrayList<Emp>();
		populate(l);
		BiConsumer<Emp,Double> c=(e,d)->e.salary=e.salary+d;
		for(Emp e:l)
		{
			c.accept(e,500.0);
		}
		for(Emp e:l)
		{
			System.out.println("Employee name: "+e.name);
			System.out.println("Employee salary: "+e.salary);
			System.out.println();
		}		
	}
	public static void populate(ArrayList<Emp> l)
	{
		l.add(new Emp("Naveen",1000));
		l.add(new Emp("Kumar",2000));
		l.add(new Emp("Aspk",3000));
		l.add(new Emp("Khammam",4000));		
	}

}
