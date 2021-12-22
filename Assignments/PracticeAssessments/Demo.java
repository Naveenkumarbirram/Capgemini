package PracticeAssessments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
//Implement Comparable to sort Employee on basis of Name, Salary and joining Date
class Employee implements Comparable<Employee> 
{
	//Declaring variables
	private int id;
	private String name;
	private String address;
    private int salary;
    //Creating no arg constructor
    public Employee() {
    }
    //Creating argument constructor
    public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
 	}
//    public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
    @Override
	public String toString() {
		return "Employee = [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
    public int compareTo(Employee o1) {

        Employee e = (Employee)o1;
        int SalComaprison = Integer.compare(this.salary, e.salary);
        if (SalComaprison == 0)
        {
            return name.compareTo(e.name);
        }
        return SalComaprison;

    }

}
 
public class Demo {
 
    public static void main(String[] args) {
 
    	Employee emp1 = new Employee(12,"Naveen","Hyd",20000);
        Employee emp2 = new Employee(12,"kavitha","Hyd",21000);
        Employee emp3 = new Employee(12,"Ram","Hyd",30000);
        Employee emp4 = new Employee(12,"Madhu","Hyd",27000);
        Employee emp5 = new Employee(12,"Kumar","Hyd",30000);
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
           Collections.sort(l); // SORT
           for(Employee x:l)
           {
        	   System.out.println(x);
           }
 
           //System.out.println(l); // Display list
    }
}
