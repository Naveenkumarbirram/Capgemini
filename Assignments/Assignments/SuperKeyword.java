package Assignments;

class Electronics
{
	//Declaring variables
	String mobile="Vivo";
	String laptop="Lenovo";
	String desktop="Dell";
	String tv="Videocon";	
}
public class SuperKeyword extends Electronics
{
	String mobile="Redmi";
	String laptop="Hp";
	String desktop="HCL";
	String tv="Samsung";	
	void details()
	{
		//Super keyword is used to reference the super class members
		System.out.println("Mobile is from super class: "+super.mobile);
		System.out.println("Mobile is from sub class: "+mobile);
	}
	public static void main(String[] args) 
	{
		//Creating object for sub class
		SuperKeyword e=new SuperKeyword();
		//Invoking/calling sub class method
		e.details();
	}

}
