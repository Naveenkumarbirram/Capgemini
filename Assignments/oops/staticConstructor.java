package oops;

class parentclass 
{
	public parentclass()
	{
		System.out.println("Static constructor");
	}
	void display1()
	{
		System.out.println("Parent class method");
	}
	
}
public class staticConstructor extends parentclass 
{
	public staticConstructor()
	{
		System.out.println("This is child Constructor");
	}
	void display()
	{
		System.out.println("This is child method");
	}
	public static void main(String[] args) 
	{
		staticConstructor obj=new staticConstructor();
		obj.display();
		obj.display1();
		
	}
	

}

