package Assignments;

class parentclass 
{
	//Creating Constructor
	public parentclass()
	{
		System.out.println("Static constructor");
	}
	//Creating Method
	void display1()
	{
		System.out.println("Parent class method");
	}
	
}
//Aquaring properties from super class to sub class
public class staticConstructor extends parentclass 
{
	//Creating constructor in sub class
	public staticConstructor()
	{
		System.out.println("This is child Constructor");
	}
	//Creating child class method
	void display()
	{
		System.out.println("This is child method");
	}
	//Main Method
	public static void main(String[] args) 
	{
		//Creating object for child class
		staticConstructor obj=new staticConstructor();
		//Calling or Invoking Methods
		obj.display();
		obj.display1();
		
	}
	

}

