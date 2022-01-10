package Assignments;

class Animalclass
{
	//Creating method for super class
	void noise()
	{
		System.out.println("All animals Make Noise");
	}	
}
class Cat extends Animalclass
{
	//Overriding super class method
	void noise()
	{
		System.out.println("Cat Noise is like meow...meow....");
	}	
}
class Dogs extends Animalclass
{
	//Overriding super class method
	void noise() 
	{
		System.out.println("Dog Noise is like Bow...Bow...");
	}
}
class Snake extends Animalclass
{
	//Overriding super class method
	void noise()
	{
		System.out.println("Snake Noise like hisss....hissssss...");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		//Creating objects for sub classes with super class oreference
		//This is called up casting
		/*If two classes having IS-A relation and we want a
		 *to access only super class methods we go for up casting
		 *But if the sub class methods are overrided and when we call that method
		 *then overrided method will get...
		 */
		Animalclass a=new Cat();
		a.noise();
		Animalclass d=new Dogs();
		d.noise();
		Animalclass s=new Snake();
		s.noise();
	}

}
