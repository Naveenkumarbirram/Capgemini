package Assignments;

class Student
{
	//Declaring Variables
	String name;
	int roll_number;
	String Dept;
	//Creating Constructor for Initialization
	public Student(String name, int roll_number, String dept) {
		super();
		this.name=name;
		this.roll_number = roll_number;
		Dept = dept;
	}
	//Creating method for student Info
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
	//Declaring Variables
	String door_number;
	String village;
	int pincode;
	String State;
	//Creating Constructor
	public Address(String door_number, String village, String state,int pincode) {
		super();
		this.door_number = door_number;
		this.village = village;
		this.pincode = pincode;
		State = state;
	}
	//Creating Method 
	void addressDetails()
	{
		System.out.println("==========Student Address==========");
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
		//Creating Object for both Student and Address Class
		Student student=new Student("Naveen kumar",305,"Mechanical");
	    Address address=new Address("2-167","Asupaka","Telangana",507301);
	    System.out.println("===================================");
	    //Invoking/calling Student Method
	    student.studentDetails();
	  //Invoking/calling Address Method
	    System.out.println("===================================");
	    address.addressDetails();
	}   
}
