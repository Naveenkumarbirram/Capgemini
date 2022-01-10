package Java8;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}	
}
public class StudentGrades 
{
	public static void main(String[] args)
	{
		Student [] Objects= {new Student("Naveen",85),
				new Student("Kumar",65),
				new Student("Naveen",39),
				new Student("Naveen",34)};
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>80) return "A [Distinction]";
			else if(marks>60) return "B [First Class]";
			else if(marks>35) return "B [Second class]";
			else return "F [Fail]";
		};
		//Function<Student,Integer> f2=s1->s1.marks>60;
		Predicate<Student> f2=s1->s1.marks>60;
		for(Student s:Objects)
		{
			//Print only if marks more than 60
			if(f2.test(s))
			{
				System.out.println("Student Name: "+s.name);
				System.out.println("Student Marks: "+s.marks);
				System.out.println("Student Grade: "+f.apply(s));
				System.out.println();
			}
		}
	}
}
