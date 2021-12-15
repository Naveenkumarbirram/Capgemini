package Assignments;

class Student
{
	String name;
	int roll_number;
	String Dept;
	public Student(String name, int roll_number, String dept) {
		super();
		this.name=name;
		this.roll_number = roll_number;
		Dept = dept;
	}
	void studentDetails()
	{
		System.out.println("=========Student Details=========== ");
		System.out.println("===================================");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number is: "+roll_number);
		System.out.println("Student Department: "+Dept);
	}
}
class Address
{
	String door_number;
	String village;
	int pincode;
	String State;
	public Address(String door_number, String village, String state,int pincode) {
		super();
		this.door_number = door_number;
		this.village = village;
		this.pincode = pincode;
		State = state;
	}
	void addressDetails()
	{
		System.out.println("==========Address Details==========");
		System.out.println("===================================");
		System.out.println("Door Number: "+door_number);
		System.out.println("Village: "+village);
		System.out.println("Pincode: "+pincode);
		System.out.println("State: "+State);
	}	
}
public class Aggregation1 
{
	public static void main(String[] args)
	{
		Student student=new Student("Naveen kumar",305,"Mechanical");
	    Address address=new Address("2-167","Asupaka","Telangana",507301);
	    System.out.println("===================================");
	    student.studentDetails();
	    System.out.println("===================================");
	    address.addressDetails();
	}
    
    
}
