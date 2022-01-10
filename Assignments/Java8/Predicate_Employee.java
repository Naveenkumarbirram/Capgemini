package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Test
{
	String name;
	double salary;
	public Test(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Predicate_Employee 
{
	public static void main(String[] args) 
	{
		ArrayList<Test> list=new ArrayList<Test>();
		list.add(new Test("Naveen",300000));
		list.add(new Test("Raghava",320000));
		list.add(new Test("Manohar",300000));
		list.add(new Test("Chenna",1200000));
		Predicate<Test> p=s->s.salary>300000;
		System.out.println(p);
		for(Test s1:list)
		{
			if(p.test(s1))//s1.salary>300000
			{
				System.out.println(s1.name+"  "+s1.salary);
			}
		}
	}

}
