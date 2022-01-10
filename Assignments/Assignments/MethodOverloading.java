package Assignments;

class Employee
{
	//Declaring variables
	String name;
	int id;
	double salary;
	String company;
	//Method overloading means same method method name with different arguments
	//Creating methods
	void Details(String name)
	{
		this.name=name;
	}
	//Method with Two arguments
	void Details(String name,int id)
	{
		Details(name);
		this.id=id;
	}
	//Method with three arguments
	void Details(String name,int id,double salary)
	{
		Details(name,id);
		this.salary=salary;
	}
	//Method with four arguments
	void Details(String name,int id,double salary,String company)
	{
		Details(name,id,salary);
		this.company=company;
	}
	void studentInfo()
	{
		System.out.println("Employee name is: "+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee Company is: "+company);
	}
	
}
public class MethodOverloading 
{
	//Main method
    public static void main(String[] args)
    {
    	//Creating object for class
    	Employee emp=new Employee();
    	//Invoking/Calling method
    	emp.studentInfo();
    }
}
