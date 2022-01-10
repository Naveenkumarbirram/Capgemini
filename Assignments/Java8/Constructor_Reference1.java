package Java8;

class Student1
{
	String name;
	int marks;
	int rollno;
	int age;
	public Student1(String name, int marks, int rollno, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", marks=" + marks + ", rollno=" + rollno + ", age=" + age + "]";
	}
	
}
interface interfff
{
	public Student1 get(String name, int marks, int rollno, int age);
}
public class Constructor_Reference1 
{
	
	public static void main(String[] args) 
	{
		//we can create object with lambda
		interfff i=(name,marks,rollno,age)->new Student1(name,marks,rollno,age);
		//Instead of creating object with lambda we can also...
		interfff i1=Student1::new;
		Student1 i2=i1.get("Naveen",80,305,22);
		Student1 i3=i1.get("kumar",90,309,22);
		System.out.println(i2);				
	}

}
