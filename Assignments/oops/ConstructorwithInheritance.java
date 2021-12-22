package oops;


class parent
{
	//Creating first constructor
	parent()
	{
		System.out.println("First constructor");
	}
}
class child extends parent
{
	//Creating Second Constructor
	child()
	{
		System.out.println("Second constructor");
	}	
}
public class ConstructorwithInheritance
{
  public static void main(String[] args) 
  {
	  new child();
	
  }	
}

	